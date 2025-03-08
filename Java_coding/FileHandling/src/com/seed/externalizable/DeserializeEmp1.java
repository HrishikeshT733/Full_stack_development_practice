package com.seed.externalizable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class DeserializeEmp1 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try{
			Employee1 ob1=null;
fis=new FileInputStream ("externserial.dat");
ois=new ObjectInputStream (fis);
	ob1= (Employee1) ois.readObject ();
	ob1.display();
		 }catch (Exception e){
			   e.printStackTrace ();
			 }finally{
				try {
					ois.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }

	}

}
