import java.io.File;
import java.io.FileNotFoundException;

public class FileDemo {
public static void main(String[] args) throws FileNotFoundException{
	File fs=new File("B:/seed-Infotech_java/Java_coding/test6.txt");
    if(fs.exists()==true){
    	System.out.println("File exist in the system");
    }else{
    	FileNotFoundException e=new FileNotFoundException();
    	System.out.println("File not found");
    	System.out.println(e.getMessage());
    	
    
    }
	
	
	
}
}
