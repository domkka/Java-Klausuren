import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		ArrayList<Shape> list = new ArrayList<Shape>();
		
		for(int i = 0; i < 10; i++){
			list.add(new Rectangle((int)(Math.random() * 10) + 1,(int)(Math.random() * 10) + 1));
		}
		
		for(Shape r : list){
			System.out.println(r.toString());
		}
		
		Collections.sort(list);
		
		for(Shape r : list){
			System.out.println(r.toString());
		}
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true){
			System.out.println("Welche Area suchen?");
		
			String input = scanner.nextLine();
			
			try{
				Integer.parseInt(input);
			}catch(NumberFormatException e){
				System.out.println("Das ist keine Zahl");
				System.exit(1);
			}
		
			int search = Integer.parseInt(input);
		
			System.out.println(binarySearch(list,0, list.size(), search).toString());
			input = "";
			while(true){
				System.out.println("Wollen sie noch eins suchen? (j/n)");
				input = scanner.nextLine();
				if(input.equals("j")){
					break;
				}else System.exit(0);
				
			}
		}
		
		
	}
	
	public static Rectangle binarySearch(ArrayList<Shape> list, int lower, int upper, int search){
		
		if(lower > upper){
			return null;
		}
		
		int mid = (upper + lower) / 2;
		
		if(search == list.get(mid).getSurfaceAre()){
			return (Rectangle)list.get(mid);
		}else if(search > list.get(mid).getSurfaceAre()){
			return binarySearch(list,mid + 1, upper, search);
		}else return binarySearch(list, lower , mid -1, search);
		
	}
	
}