import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		while(true){
			System.out.println("Bitte Text eingeben: ");
			Scanner scanner = new Scanner(System.in);
		
			String input =  scanner.nextLine();
		
			Generator generator = new Generator(input);
			generator.generate();
			System.out.println(generator.toString());
			
			input = "";
			while(true){
				System.out.println("wollen sie nochmal? (j/n)");
				input = scanner.nextLine();
				if(input.equals("j")){
					break;
				}else System.exit(0);
			}
			
		}
		
	}
	
	
	
}