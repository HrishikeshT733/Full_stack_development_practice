package com.seed.externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class SerializeEmp1 {

public static void main(String[] args) {
	FileOutputStream fos = null;
	ObjectOutputStream oos = null;
		try{
 Employee1 e1=new Employee1 (1002,"Ram Khanna",822000.00);
 fos=new FileOutputStream ("externserial.dat");
oos=new ObjectOutputStream (fos);
 oos.writeObject (e1);
System.out.println("serialized successfully");
}catch (Exception e){
e.printStackTrace();
 }finally{
 try {
	oos.close();
	} catch (IOException e) {
			e.printStackTrace();}
 }
}

}
