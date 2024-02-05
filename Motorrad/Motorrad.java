

public class Motorrad implements MotorradI{
	
	double power;
	int weight;
	String name;
	
	public Motorrad(double p, int w, String n){
		this.power = p;
		this.weight = w;
		this.name = n;
	}
	
	public void setPower(double p){
		this.power = p;
	}
	
	public void setWeight(int w){
		this.weight = w;
	}
	
	public void setName(String n){
		this.name = n;
	}
	
	public double getPower(){
		return this.power;
	}
	
	public int getWeight(){
		return this.weight;
	}
	
	public String getName(){
		return this.name;
	}
	
	@Override
	public String toString(){
	return "Name: " + this.getName() + "\nLeistung: "+ this.getPower() + "\nGewicht: " + this.getWeight();
	}
	
}