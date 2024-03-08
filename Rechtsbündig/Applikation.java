import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		while(true){
			System.out.println("Bitte text eingeben: ");
			
			String input = TextInput.readLine();
			
			FormattingText text = new FormattingText(input);
			
			System.out.println("Anzahl an Zeichen pro Zeile: ");
			input = TextInput.readLine();
			
			
			try{
				Integer.parseInt(input);
			}catch(NumberFormatException e){
				System.out.println("Keine gültige Nummer");
				System.exit(1);
				
			}
			
			int limit = Integer.parseInt(input);
			text.alignRight(limit);
			System.out.println("rechtsbündig: ");
			System.out.println(text.toString());
			
			input = "";
			while(true){
				System.out.println("Wollen sie noch ein text formatieren (j/n)?");
				input = TextInput.readLine();
				if(input.equals("n")){
					System.exit(0);
				}else if(input.equals("j")){
					break;
				}
			}
			
		}
	}
	
	
	
}