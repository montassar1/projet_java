package application;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class stockarticle {
	static ArrayList<article> listA = new ArrayList<>();
	public static void viderliste(){
		listA.clear();
	}
	public static void Charger() {
		ObjectInputStream f;
		boolean eof = true;
		article a;
		try {
			f = new ObjectInputStream(new FileInputStream("stock.dat"));
			listA.clear();
			while (eof) {
				try {
					
					a = (article) f.readObject();
					listA.add(a);
					
				} catch (EOFException e) {
					eof = false;
				}
			}
			f.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	public static void enregistrer(ObjectOutputStream f1) {
		try {
			for (article art : listA)
			{
				f1.writeObject(art);
		    }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public static ArrayList<article> getListA() {
		return listA;
	}
	
	
	public static ArrayList<article> liste() throws ClassNotFoundException, IOException {
		ObjectInputStream f = new ObjectInputStream(new FileInputStream("resp.dat"));
		ArrayList<article> li = (ArrayList<article>) f.readObject();
		return li ;
	}

	
	
	public static void ajout(article a ){listA.add(a);}
	
	public static void supprimer(article a){ listA.remove(a);}
}
