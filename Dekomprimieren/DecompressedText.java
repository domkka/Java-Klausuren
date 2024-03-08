import java.util.*;

public class DecompressedText{
	
	String text;
	String decompressed;
	
	public DecompressedText(String text){
		this.text = text;
	}
	
	public String getText(){
		return this.text;
	}
	
	public void setDecompressed(String decompressed){
		this.decompressed = decompressed;
	}
	
	public void decompress(){
		
		String[] split = getText().split(" ");
		ArrayList<String> list = new ArrayList<String>();
		
		for(String s : split){
			list.add(s);
		}
		
		for(int i = 0; i < list.size(); i++){
			for(int j = 0 ; j < list.get(i).length() - 1; j++){
				if(list.get(i).charAt(j) == '*' && list.get(i).charAt(j + 1) != '*'){
					StringBuilder sb = new StringBuilder(list.get(i));
					char c = list.get(i).charAt(list.get(i).length() - 2);
					String count = sb.substring(j + 1,list.get(i).length() - 2);
					int rest = Integer.parseInt(count);
					
					char[] chars = list.get(i).toCharArray();
					String replace = "";
					int k = 0;
					while(chars[k] != '*'){
						replace += chars[k];
						k++;
					}
					while(rest > 0){
						replace += c;
						rest--;
					}
					list.set(i,replace);
					break;
				}
			}
		}
		
		String decom = "";
		for (String s :list){
			decom += s + " ";
		}
		
		setDecompressed(decom);
		
	}
	
	@Override
	public String toString(){
		return this.decompressed;
	}
	
}