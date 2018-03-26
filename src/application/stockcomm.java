package application;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.ListIterator;

public class stockcomm {
	
	static commande c ;
	static ArrayList<commande> listC = new ArrayList<>();
	public static void viderliste(){
		listC.clear();
	}
	public static void Charger() {
		ObjectInputStream f;
		boolean eof = true;
		commande com;
		try {
			f = new ObjectInputStream(new FileInputStream("comm.dat"));
		listC.clear();
			while (eof) {
				try {
					
					com = (commande) f.readObject();
					listC.add(com);
					
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
	 
	public static void enregistrer(ObjectOutputStream f) {
		try {
			for (commande comm : listC)
			{
				f.writeObject(comm);
		    }

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
public static commande getListD(int k){
	
	ListIterator <commande> it= getListC().listIterator(); 	
	while(it.hasNext())	
	{commande com = it.next();

	if (com.getNum_comm()==k){
		
c=com;}
		}
	
	
	return c;
}
	
	
	public static ArrayList<commande> getListC() {
		return listC;
	}
	
	
	public static ArrayList<commande> liste() throws ClassNotFoundException, IOException {
		ObjectInputStream f = new ObjectInputStream(new FileInputStream("vente.dat"));
		ArrayList<commande> li = (ArrayList<commande>) f.readObject();
		return li ;
	}

	
	
	public static void ajout(commande comm ){listC.add(comm);}
	
	public static void supprimer(commande comm){ listC.remove(comm);}
}
