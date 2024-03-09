import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		System.out.println("Dies sind die Objekte: ");
		Schaufel schaufel1 =  new Schaufel(10);
		Schaufel schaufel2 = new Schaufel(12);
		Eimer eimer1 = new Eimer(4);
		Eimer eimer2 = new Eimer(7);
		
		System.out.println("Vote mit 2 Schaufel und 1 Eimer");
		Object t1 = vote(schaufel1, eimer1, schaufel2);
		System.out.println(t1.toString());
		System.out.println();
		
		System.out.println("Vote mit 1 Schaufel und 2 Eimer");
		Object t2 = vote(eimer2, eimer1, schaufel2);
		System.out.println(t2.toString());
		System.out.println();
		
		System.out.println("Vote mit 2");
		Object t3 = vote(2, 2, 2);
		System.out.println(t3.toString());
		System.out.println();
		
	}
	
	public static <T> T vote(T t1, T t2, T t3){
		
		if(t1.equals(t2) | t1.equals(t3)){
			return t1;
		}else if(t2.equals(t3)){
			return t2;
		}else return t1;
	}
	
	
}