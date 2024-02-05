import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		ArrayList<Haus> houses = new ArrayList<Haus>();
		for (int i = 0; i < 10; i++){
			int randomheight =(int) (Math.random() * (20-5) + 1) + 5;
			houses.add(new Haus("Haus Nr." + (i+1),randomheight));
		}
		
		System.out.println("unsortierte Liste");
		for(Haus h : houses){
			System.out.println(h);
		}
		
		Collections.sort(houses);
		
		System.out.println("\nsortierte Liste");
		for(Haus h : houses){
			System.out.println(h);
		}
		
		while(true){
			System.out.println("Nach welcher Haushoehe (5-20) soll gesucht werden?");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			
			try{
				Integer.parseInt(input);
			}catch (NumberFormatException e){
				System.out.println(input + " ist keine valide Zahl.");
				System.exit(1);
			}
			
			int number = Integer.parseInt(input);
			
			Haus haus = new Haus("", number);
			binarySearch(houses, 0, houses.size(), haus);
			
			input= "";
			while(!input.equals("n") && !input.equals("j")){
				System.out.println("Wollen sie nach noch einer Hoehe suchen? (j/n)");
				input = scanner.nextLine();
				if(input.equals("n")){
					System.exit(0);
				}else if (input.equals("j")){
					break;
				}
			}
		}
		
	}
	
	public static <T extends Haus> void binarySearch(ArrayList<T> list, int lower, int upper, T haus){
		
		if(lower > upper){
			System.out.println("Kein Haus gefunden");
			return;
		}
		
		int m = (lower + upper) /2;
		if(list.get(m).getHoehe() == haus.getHoehe()){
			System.out.println("Haus gefunden: ");
			System.out.println(list.get(m).toString());
			return;
		}else if(list.get(m).getHoehe() > haus.getHoehe()){
			binarySearch(list, lower,m - 1,haus);
		}else {
			binarySearch(list, m+1 ,upper,haus);
		}
	}
	
}