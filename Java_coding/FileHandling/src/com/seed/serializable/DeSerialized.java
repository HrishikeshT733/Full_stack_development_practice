package com.seed.serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


//Deserializatio
public class DeSerialized {
	public static void main(String args[])
	{
	   FileInputStream fis;
	   ObjectInputStream ois;
	   try
       {
	 Employee od;
	fis=new FileInputStream("B:/seed-Infotech_java/Java_coding/Serializable2.txt");
 ois=new ObjectInputStream(fis);
 od=(Employee)ois.readObject();
 od.display();
 ois.close(); }
	   catch(Exception e)
	  {
		   e.printStackTrace();
      }
    }
}
