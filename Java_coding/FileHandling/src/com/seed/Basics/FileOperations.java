package com.seed.Basics;
import java.io.File;
public class FileOperations {
	File f;
	String fnm,path,abspath;
	long size;
	//s=E:/abc123.txt
	public FileOperations(String s)
    {
		f=new File(s);
		if(f.exists()==true)
			System.out.println("file exists");
		else 
			System.out.println("file does not exists");
		
		fnm=f.getName();
		System.out.println("file name is: " + fnm);

	    path=f.getPath();
		System.out.println("path is:" + path);

		abspath=f.getAbsolutePath();
		System.out.println("Absolute path is" + abspath);

		if(f.canRead()==true)
			System.out.println("u can read file");
		if(f.canWrite()==true)
			System.out.println("u can also write in file");

		if(f.isAbsolute()==true)
		System.out.println("file has absolute path");
        size=f.length();
		System.out.println("file length is:" + size);

	}
	public static void main(String args[])
    {
		FileOperations of=
		new FileOperations("B:/seed-Infotech_java/Java_coding/test.txt");
    }
}
