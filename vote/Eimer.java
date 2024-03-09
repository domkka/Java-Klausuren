import java.util.*;

public class Eimer implements Comparable<Eimer>{
	
	int volume;
	
	public Eimer(int volume){
		this.volume = volume;
	}
	
	public int getVolume(){
		
		return this.volume;
		
	}
	
	@Override
	public int compareTo(Eimer e){
		
		if(this.getVolume() > e.getVolume()){
			return 1;
		}else if(this.getVolume() < e.getVolume()){
			return -1;
		}else return 0;
		
		
	}
	
	@Override
	public String toString(){
		return "Eimer mit Volumen :" + this.getVolume();
		
	}
	
}