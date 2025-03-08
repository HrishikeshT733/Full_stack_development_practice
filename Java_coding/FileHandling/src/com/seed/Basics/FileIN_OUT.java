package com.seed.Basics;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIN_OUT {	
	
	public static void main(String args[])
	{
		try{
		File f;
        FileInputStream fis;
	    FileOutputStream fos;
	    int x;
	    	f=new File("B:/seed-Infotech_java/Java_coding/test.txt");
			fis=new FileInputStream(f);
			fos=new FileOutputStream("B:/seed-Infotech_java/Java_coding/test2.txt");
		      do {
			 x=fis.read();
			System.out.print((char)x);
			if(x!=-1)			
			fos.write(x);
			else
				break;
			   }while(x!=-1);//-1 is end of the file
		     //Resourse closing code
		      fis.close();
			   fos.close();	
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}

















//if(x!=-1)			
//fos.write((char)x);