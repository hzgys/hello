package homework;

public class EX507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     double input=0;
     double s=10000;
     for(int i=1;i<=10;i++) {
    	s=(1+0.05)*s; 
     }
     System.out.println(s);
     for (int i=1;i<=4;i++) {
    	 s=(1+0.05)*s;
    	 input+=s;
     }
     System.out.println(input);
	}
}

