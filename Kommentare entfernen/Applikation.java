import java.util.*;

public class Applikation{
	public static void main(String[] args){
		
		while(true){
			System.out.println("Unformatierter Text: ");
			Scanner scanner = new Scanner(System.in);
			String input = "";
			String oldtext= "";
			
			while(true){
				input = scanner.nextLine();
				if(input.equals("stop")){
					break;
				}else{
					oldtext += input +'\n';
				}
			}
			
			System.out.println("Formatierter Text: ");
			String text = FormattedText.formatText(oldtext);
			System.out.println(text);
		}
	}
}