import java.util.*;

public class MPoint implements Point {
	
	int x;
	int y;
	
	public MPoint(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public void setX(int x){
		this.x = x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}
	
	public double getDistance(){
		double a = Math.pow(this.getY(), 2);
		double b = Math.pow(this.getX(), 2);
		return Math.pow(a + b,0.5);
	}
	
	@Override
	public int compareTo(Point p){
		
		if(this.getDistance() < p.getDistance()){
			return -1;
		}else if(this.getDistance() > p.getDistance()){
			return 1;
		}else return 0;
	}
	
	@Override
	public String toString(){
		return "Punkt: ( " + this.getX() + " ; " + this.getY() + " ) Dist: " + this.getDistance();
	}
	
}