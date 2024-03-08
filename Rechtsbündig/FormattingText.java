import java.util.*;

public class FormattingText{
	
	String text;
	String justified;
	
	public FormattingText(String text){
		this.text = text;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public void alignRight(int limit){
		
		String[] split = this.text.split(" ");
		
		ArrayList<String> strings = new ArrayList<String>();
		
		for(String s : split){
			strings.add(s);
		}
		
		for(int i = 0; i< strings.size() - 1;i++){
			if(strings.get(i).length() + strings.get(i + 1).length() + 1 <= limit){
				String a = strings.get(i);
				String b = strings.get(i + 1);
				strings.remove(i + 1);
				strings.set(i, a + " " + b);
				i--;
			}
		}
		
		String output = "";
		
		for(String s : strings){
			StringBuilder sb = new StringBuilder(s);
			int rest = limit - s.length();
			while(rest > 0){
				sb.insert(0,"#");
				rest--;
			}
			output += sb + "\n";
		}
		this.justified = output;
	}
	
	@Override
	public String toString(){
		return this.justified;
	}
	
}