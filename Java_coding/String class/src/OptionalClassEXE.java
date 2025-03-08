import java.util.Optional;

public class OptionalClassEXE {
public static void main(String[] args) {
	//Null pointer exception
	String [] words =new String[10];
	//String word=words[5].toUpperCase();
	//System.out.println(word);
	//it will throw nullpointer exception
	
	//Solution: Optional Class
	Optional<String> checkNull=Optional.ofNullable(words[5]);
	if(checkNull.isPresent()){
		String w=words[5].toUpperCase();
		System.out.println(w);
		
	}else
		System.out.println("Word is "+"null try to re enter");
}


}
