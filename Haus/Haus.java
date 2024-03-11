import java.util.*;

public class Haus implements isthoher{
	String name;
	int hoehe;
	
	public Haus(String name, int hoehe){
		this.name = name;
		this.hoehe = hoehe;
	}
	
	public int getHoehe(){
		return this.hoehe;
	}
	
	public void setHoehe(int hoehe){
		this.hoehe = hoehe;
	}
	
	@Override
	public int compareTo(isthoher h){
		if (this.getHoehe() > h.getHoehe()){
			return 1;
		}else if( this.getHoehe() < h.getHoehe()){
			return -1;
		}else return 0;
	}
	
	@Override
	public String toString(){
		return ("Name = " + this.name + " , Hoehe = " + this.getHoehe());
	}
}