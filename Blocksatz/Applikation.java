

public class Applikation{
	
	public static void main(String[] args){
		
		while(true){
			
			System.out.println("Wie lautet ihr Text?");
			String input = TextInput.readLine();
			FormattedText formatted = new FormattedText(input);
			
			System.out.println("Wie viel Zeichen?");
			input = TextInput.readLine();
			
			try{
				Integer.parseInt(input);
			}catch(NumberFormatException e){
				System.out.println(input + " ist keine Zahl.");
				System.exit(1);
			}
			
			int number = Integer.parseInt(input);
			
			formatted.justifyText(number);
			
			System.out.println("Blocksatz");
			System.out.println(formatted.toString());
			
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