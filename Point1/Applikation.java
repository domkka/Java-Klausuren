import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		ArrayList<Point> list = new ArrayList<Point>();
		
		for(int i = 0; i < 25; i++){
			list.add(new Point((int)(Math.random()*21) - 10, (int)(Math.random()*21) - 10));
		}
		
		System.out.println("unsortiert: ");
		for(Point p : list){
			System.out.println(p.toString());
		}
		
		sortiere(list);
		System.out.println("sortiert: ");
		for(Point p : list){
			System.out.println(p.toString());
		}
		
	}
	
	public static void sortiere(ArrayList<Point> list){
		
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.size() - 1; j++)
				if(list.get(j).manhattanDistanceFromZero() > list.get(j + 1).manhattanDistanceFromZero()){
					Point temp = list.get(j);
					list.set(j, list.get(j + 1));
					list.set(j + 1, temp);
				}
		}
	}
	
}