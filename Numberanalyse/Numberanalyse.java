import java.util.*;

public class Numberanalyse{
	
	String sequence;
	ArrayList<String> analysed;
	
	public Numberanalyse(String sequence){
		this.sequence = sequence;
	}
	
	public int checksum(String number){
		try{
			Integer.parseInt(number);
		}catch(NumberFormatException e){
			System.out.println("Keine valide Nummer!");
			System.exit(1);
		}
		
		int zahl = Integer.parseInt(number);
		int checksum = 0;
		
		while(zahl >0){
			
			checksum += zahl % 10;
			zahl /= 10;
		}
		return checksum;
	}
	
	public void analyseSequence(){
		
		String[] split = this.sequence.split(" ");
		
		for (int i = 0; i < split.length; i++){
			for (int j = 0; j < split.length - 1; j++){
				if(checksum(split[j]) > checksum(split[j + 1])){
					String tmp = split[j];
					split[j] = split[j + 1];
					split[j + 1] = tmp;
				}
			}
		}
		
		ArrayList<String> strings = new ArrayList<String>();
		for(String s : split){
			strings.add(s);
		}
		
		for(int i = 0; i < strings.size() - 1; i++){
			int check = checksum(strings.get(i));
			while(true){
				if(i + 1 < strings.size() && checksum(strings.get(i + 1)) == check){
					String a = strings.get(i);
					String b = strings.get(i + 1);
					strings.set(i, a + " " + b);
					strings.remove(i + 1);
				}else break;
			}
			
		}
		
		for(int i = 0; i < strings.size(); i++){
			String[] split2 = strings.get(i).split(" ");
			StringBuilder sb = new StringBuilder(strings.get(i));
			sb.insert(0, checksum(split2[0]) + ": ");
			strings.set(i, sb.toString());
		}
		this.analysed = strings;
		
	}
	
	public String toString(){
		String output = "";
		for(int i = 0; i < this.analysed.size(); i++){
			output += analysed.get(i) + "\n";
		}
		return output;
	}
	
}