import java.util.*;

public class PermutateWords{
	String text;
	String permutedText;
	
	public PermutateWords(String text){
		this.text = text;
	}
	
	public char[] sort(String s){
		
		char[] chars = s.toCharArray();
		int last = 1;
		if(chars[chars.length - 1] == '.'){
			last = 2;
		}
		
		for(int i = 1; i < chars.length - last; i++){
			
			char min = chars[i];
			int minpos = i;
			for(int j = i; j < chars.length - last; j++){
				if(chars[j] < min){
					min = chars[j];
					minpos = j;
				}
			}
			if(minpos != i){
				char tmp = min;
				chars[minpos] = chars[i];
				chars[i] = min;
			}
		}
		return chars;
	}
	
	public void permutate(){
		
		String[] split = this.text.split(" ");
		String output = "";
		for(String s : split){
			char[] chars = sort(s);
			for(char c : chars){
				output += c;
			}
			output += " ";
		}
		
		this.permutedText = output;
	}
	
	
	@Override
	public String toString(){
		return this.permutedText;
	}
	
}