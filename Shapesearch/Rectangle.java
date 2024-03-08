import java.util.*;

public class Rectangle implements Shape{
	
	int width;
	int height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public void setWidth(int width){
		this.width = width;
	}
	
	public void setHeight(int height){
		this.height = height;
	}
	
	public int getWidth(){
		return this.width;
	}
	
	public int getHeight(){
		return this.height;
	}
	
	public int getSurfaceAre(){
		return this.getWidth() * this.getHeight();
	}
	
	@Override
	public int compareTo(Shape r){
		if(this.getSurfaceAre() < r.getSurfaceAre()){
			return -1;
		}else if(this.getSurfaceAre() == r.getSurfaceAre()){
			return 0;
		}else return 1;
	}
	
	@Override
	public String toString(){
		return "Rect (" + this.getWidth() + "," + this.getHeight() + ")";
	}
	
}