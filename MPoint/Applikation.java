import java.util.*;

public class Applikation{
	
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String input = "";
		
		ArrayList<Point> list = new ArrayList<Point>();
		
		while(true){
			System.out.println("Neuer Punkt x y :");
			input =  scanner.nextLine();
			if(input.equals("e")) break;
			int x =  Integer.parseInt(input); 
			input = scanner.nextLine();
			if(input.equals("e")) break;
			int y = Integer.parseInt(input);
			
			list.add(new MPoint(x,y));
			
		}
		System.out.println("Eingegebene Punkte");
		for(Point p : list){
			System.out.println(p.toString());
		}
		sortPoints(list);
		System.out.println("Sortierte Punkte");
		for(Point p : list){
			System.out.println(p.toString());
		}
		
	}
	
	public static <T extends Comparable> void sortPoints(ArrayList<T> list){
		
		for(int i = 0; i + 1 < list.size(); i++){
			
			if(list.get(i).compareTo(list.get(i + 1)) == 1){
				T tmp = list.get(i);
				list.set(i, list.get(i + 1)) ;
				list.set(i + 1,  tmp);
				i = 0;
			}
			
		}
		
	}
	
}