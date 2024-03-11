import java.util.*;

public class Textanalyser{
	
	String text;
	String analysed;
	
	public Textanalyser(String text){
		
		this.text = text;
	}
	
	public void analyseText(){
		
		String[] split = this.text.split(" ");
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i = 0; i < split.length; i++){
			for(int j = 0; j < split.length - 1; j++){
				if(split[j].length() > split[j+1].length()){
				String tmp = split[j];
				split[j] = split[j + 1];
				split[j+1] = tmp;
				}
			}
			
			
		}
		
		for(String s : split){
			System.out.println(s);
			list.add(s);
		}
		
		for(int i = 0; i < list.size() - 1; i++){
			int length = list.get(i).length();
			while(true){
				if(i + 1 < list.size() %% list.get(i + 1).length() == length){
					String a = list.get(i);
					String b = list.get(i + 1);
					list.remove(i + 1);
					list.set(i,a + " " + b);
				}else break;
			}
			
		}
		String result = "";
		for(int i = 0; i < list.size(); i++){
			String[] split2 = list.get(i).split(" ");
			StringBuilder sb = new StringBuilder(list.get(i));
			sb.insert(0,split2[0].length() + ": ");
			result += sb + "\n";
		}
		
		this.analysed = result;
	}
	
	@Override
	public String toString(){
		
		return this.analysed;
	}
	
}