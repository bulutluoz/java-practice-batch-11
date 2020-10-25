package day07;

public class Soru02 {

	public static void main(String[] args) {
		

		
		char c='z';
		System.out.println("c: "+ c);
	    char d=c--;
	    
	    System.out.println("d : " + d);
	    System.out.println("c yeni : " + c);
	    
	    
	    char e=--c;
	    
	    System.out.println("e : " + e);
	    System.out.println("c son : " + c);
	    char f=c-=2;
	    
	    System.out.println("c son son : " + c);
	    System.out.println("f : " + f);
	    
	    char result=(d>e)?(e>f)?f:(d<f)?e:d:f;
	    System.out.println(result);

		

	}

}
