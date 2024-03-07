import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		ArrayList<Haus> houses = new ArrayList<Haus>();
		
		for(int i = 0; i < 6; i++){
			houses.add(new Haus((int)(Math.random() * 15 + 1)));
		}
		
		System.out.println("unsortiert:");
		for(Haus h : houses){
			System.out.println(h.toString());
		}
		
		GenericMaxSort<Haus> sort = new GenericMaxSort<Haus>();
		sort.sort(houses);
		
		System.out.println("sortiert:");
		for(Haus h : houses){
			System.out.println(h.toString());
		}
		
	}
	
}