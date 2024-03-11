import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		while(true){
			
			System.out.println("Text eingeben");
			Scanner scanner = new Scanner(System.in);
			String input =  scanner.nextLine();
			Textanalyser ta = new Textanalyser(input);
			ta.analyseText();
			System.out.println(ta.toString());
			input = "";
			while(true){
				System.out.println("Wollen sie nochmal");
				input = scanner.nextLine();
				if(input.equals("j")){
					break;
				}else System.exit(0);
			}
			
			
		}
		
		
	}
	
	
	
}