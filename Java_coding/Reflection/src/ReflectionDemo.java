import java.lang.reflect.Field;
import java.lang.reflect.Method;


public class ReflectionDemo {
		public static void main(String[] args) {
			try {
				Class c=
						Class.forName("Employee");
				System.out.println("Employee class is loaded");
				Employee e=(Employee)c.newInstance();
				e.display();
				Method mArr []=c.getMethods();
				for(Method m: mArr)
					System.out.println(m);
				System.out.println("---------------------------------------");
				Field f[]=c.getDeclaredFields();
					for(Field x:f) {
						System.out.println(x);
					}
			}catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
				e.printStackTrace(); 
			} 
		
		}
}
