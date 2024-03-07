import java.util.*;
import java.lang.*;

public class FormattedText{
	
	String text;
	String justified;
	
	public FormattedText(String text){
		this.text = text;
	}
	
	void setText(String text){
		this.text = text;
	}
	
	public void justifyText(int limit){
		
		String[] split = this.text.split(" ");
		
		ArrayList<String> strings = new ArrayList<String>();
		
		for(String s : split){
			strings.add(s);
		}
		
		for(int i = 0; i < strings.size() - 1;i++){
			if(strings.get(i).length() + strings.get(i + 1).length() < limit){
				
				String a = strings.get(i);
				String b = strings.get(i + 1);
				
				strings.set(i, a + " " + b);
				strings.remove(i + 1);
				i--;
			}
		}
		
		for(int i = 0; i < strings.size(); i++){
			StringBuilder build = new StringBuilder(strings.get(i));
			int rest = limit - build.length();
			for(int j = 0; j < build.length(); j++){
				if(build.charAt(j) == ' '){
					while(rest > 0){
						build.insert(j,"_");
						rest--;
					}
				}
			}
			strings.set(i, build.toString());
		}
		String output = "";
		for(int i = 0; i < strings.size(); i++){
			output += strings.get(i) + "\n";
		}
		this.justified = output;
	}
	
	@Override
	public String toString(){
		return this.justified;
	}
	
}