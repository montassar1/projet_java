package application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.ListIterator;

public class commande implements Serializable{
	private int num_comm ;
	article a;

	static ArrayList <article> comm = new ArrayList<>();
public commande (int num){
	this.setNum_comm(num);
}


public void ajouterart(article a)
{
	comm.add(a);
}
public void supprimerart (article a)
{comm.remove(a);
}
public article rechercher( int ref){

ListIterator <article> it=  comm.listIterator(); 	
while(it.hasNext())	
{article ar = it.next();
if (ar.getRef()==ref)
	a=ar;
}
	return a;
	
}

public int getNum_comm() {
	return num_comm;
}

public void setNum_comm(int num_comm) {
	this.num_comm = num_comm;
}






public static ArrayList<article> getListV() {
	return comm;
}
}
