import java.util.*;

public class Schaufel implements Comparable<Schaufel>{
	
	int length;
	
	public Schaufel(int length){
		this.length = length;
	}
	
	public int getLength(){
		
		return this.length;
		
	}
	
	@Override
	public int compareTo(Schaufel s){
		
		if(this.getLength() > s.getLength()){
			return 1;
		}else if(this.getLength() < s.getLength()){
			return -1;
		}else return 0;
		
		
	}
	
	@Override
	public String toString(){
		return "Schaufel mit Länge: " + this.getLength();
		
	}
	
}