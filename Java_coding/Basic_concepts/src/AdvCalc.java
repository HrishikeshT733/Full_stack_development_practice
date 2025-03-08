
public class AdvCalc {
    public void add(int...num){ //known as varargs or ellipses
    	int res=0;
    	for(int i=0;i<num.length;i++){
    		res=res+num[i];
    	}
    	System.out.println("Addition result "+res);
    }
    public void add(float...num){
    	float res=0;
    	for(int i=0;i<num.length;i++){
    		res=res+num[i];
    	}
    	System.out.println("Addition result "+res);
    }
    public void add(double...num){
    	double res=0;
    	for(int i=0;i<num.length;i++){
    		res=res+num[i];
    	}
    	System.out.println("Addition result "+res);
    }
}
