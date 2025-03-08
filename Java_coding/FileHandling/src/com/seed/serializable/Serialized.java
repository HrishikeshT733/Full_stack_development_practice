package com.seed.serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//Serialization
public class Serialized {
	 public static void main(String args[])
		{
	 FileOutputStream fos; 
	ObjectOutputStream oos;
	 try{
	 Employee od=new Employee("Radha",21,7845662);
	  fos=new FileOutputStream("B:/seed-Infotech_java/Java_coding/Serializable.txt");
	  oos=new ObjectOutputStream(fos);
	  oos.writeObject(od);
	  oos.close();
	  System.out.println("Serialization done");
		   }
		catch(Exception e)
	    {
		e.printStackTrace();
	      }
		}
}
