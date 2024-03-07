import java.util.*;

public class Point implements PointI{
	
	int x;
	int y;
	
	public Point(int x, int y){
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
	
	public int manhattanDistanceFromZero(){
		return Math.abs(0 - this.getX()) + Math.abs(0 - this.getY());
	}
	
	@Override
	public String toString(){
		return "(" + this.getX() + "," + this.getY() + "): Manhattan: " + this.manhattanDistanceFromZero();
	}
	
}