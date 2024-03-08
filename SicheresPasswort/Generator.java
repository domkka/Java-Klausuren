import java.util.*;

public class Generator{
	
	String text;
	String password;
	
	public Generator(String text){
		this.text = text;
	}
	
	public void setText(String text){
		this.text = text;
	}
	
	public void setPassword(String password){
		this.password = password;
	}
	
	public String getText(){
		return this.text;
	}
	
	public String getPassword(){
		return this.password;
	}
	
	
	public void generate(){
		String text = this.getText();
		String[] split = text.split(" ");
		String output = "";
		int count = 0;
		for(String s : split){
			for(int i = 0; i < s.length(); i++){
				if(i == 0){
					output += s.charAt(i);
				}
				if(Character.isUpperCase(s.charAt(i))){
					count++;
				}
				
			}
		}
		output += count;
		this.setPassword(output);
	}
	
	
	@Override
	public String toString(){
		return this.getPassword();
	}
	
	
}