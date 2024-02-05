import java.util.*;

public class FormattedText{
	
	public static String formatText(String text){
		
		StringBuilder sb = new StringBuilder(text);
		boolean delete = false;
		
		for(int i = 0; i < sb.length(); i++){
			
			if(sb.charAt(i)== '/' && sb.charAt(i + 1) == '*'){
				delete = true;
			}
			if(sb.charAt(i)== '*' && sb.charAt(i + 1) == '/'){
				sb.deleteCharAt(i);
				sb.deleteCharAt(i);
				delete = false;
				i--;
			}
			if(delete){
				sb.deleteCharAt(i);
				i--;
			}
			
		}
		for(int i = 0; i < sb.length(); i++){
			if(sb.charAt(i)== '/' && sb.charAt(i + 1)=='/'){
				while(!(sb.charAt(i)=='\n')){
					sb.deleteCharAt(i);
				}
			}
		}
		return sb.toString();
	}
	
}