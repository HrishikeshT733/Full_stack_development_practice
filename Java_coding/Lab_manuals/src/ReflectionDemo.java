import java.lang.reflect.*;

public class ReflectionDemo {
public static void main(String[] args) {
	try{
		Class c=Class.forName("Employee");
		System.out.println("Employee class is loaded");
		Employee e=(Employee)c.newInstance();
		e.show();
		Class<?>clazz=e.getClass();
		System.out.println("Class name: "+clazz.getName());
		System.out.println("************************************************************");
		Method m[]=c.getMethods();
		for(Method i:m){
			System.out.println(i);
		}
		System.out.println("************************************************************");
		System.out.println("************************************************************");
		Field f[]=c.getDeclaredFields();
		for(Field i:f){
			System.out.println(i);
		}
	}catch(ClassNotFoundException | InstantiationException | IllegalAccessException e){
		e.printStackTrace();
	}
}
}
