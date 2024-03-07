import java.util.*;

public class Haus implements Comparable<Haus>{
	
	int hoehe;
	
	public Haus(int hoehe){
		this.hoehe = hoehe;
	}
	
	public void setHoehe(int hoehe){
		this.hoehe = hoehe;
	}
	
	public int getHoehe(){
		return this.hoehe;
	}
	
	@Override
	public int compareTo(Haus h){
		
		if(this.getHoehe() < h.getHoehe()){
			return -1;
		}else if(this.getHoehe() == h.getHoehe()){
			return 0;
		}else return 1;
		
	}
	
	@Override
	public String toString(){
		return "Hoehe: " + this.getHoehe();
	}
	
}

