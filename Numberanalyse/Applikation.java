import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		while(true){
			Scanner scanner = new Scanner(System.in);
			System.out.println("Sequenz von Zahlen eingeben!: ");
			String input = scanner.nextLine();
		
			Numberanalyse numberanalyse = new Numberanalyse(input);
		
			numberanalyse.analyseSequence();
			System.out.println(numberanalyse.toString());
			
			input = "";
			while(true){
				System.out.println("nochmal? (j/n)");
				input = scanner.nextLine();
				if(input.equals("j")){
					break;
				}else System.exit(1);
			}
			
			
		}
	}
	
	
	
}