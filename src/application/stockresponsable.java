package application;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public  class stockresponsable {
	static ArrayList<responsable> listR = new ArrayList<>();
	public static void viderliste(){
		listR.clear();
	}
	public static void Charger() {
		ObjectInputStream f1;
		boolean eof = true;
		responsable res;
		try {
			f1 = new ObjectInputStream(new FileInputStream("resp.dat"));
		listR.clear();

			while (eof) {
				
				try {
					
						res = (responsable) f1.readObject();
						listR.add(res);

					
				} catch (EOFException e) {
					eof = false;
				}
			}
			f1.close();
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
			for (responsable res : listR) {
f1.writeObject(res);			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static ArrayList<responsable> getListR() {
		return listR;
	}
	public static ArrayList<responsable> liste() throws ClassNotFoundException, IOException {
		ObjectInputStream f1 = new ObjectInputStream(new FileInputStream("resp.dat"));
		ArrayList<responsable> li = (ArrayList<responsable>) f1.readObject();
		return li ;
	}

	
	public static void ajout(responsable r ){listR.add(r);}
	public static void supprimer(responsable i){ listR.remove(i);}
}
