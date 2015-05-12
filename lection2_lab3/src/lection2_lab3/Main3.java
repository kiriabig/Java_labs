package lection2_lab3;

abstract class Vehicle{
	private int weight,speed,cost;
	public int getWeight(){
		return weight;
	}
	public int getSpeed(){
		return speed;
	}
	public int getCost(){
		return cost;
	}
	public void setWeight(int weight){
		this.weight = weight;
	}
	public void setSpeed(int speed){
		this.speed = speed;
	}
	public void setCost(int cost){
		this.cost = cost;
	}
	abstract String getDescription();
}
//------------------------------------------
class Air extends Vehicle{
	private int dist;
	public int getDist(){
		return dist;
	}
	public void setDist(int dist){
		this.dist = dist;
	}
	@Override
	public String getDescription(){
		return "Air vehicle. Weight:"+getWeight()+"Speed: "+getSpeed()+"Cost: "+getCost()+ "Max distance: "+getDist();
	}
}
class Plane extends Air{
	private String entype;
	public String getEngine(){
		return entype;
	}
	public void setEngine(String entype){
		this.entype = entype;
	}
	@Override
	public String getDescription(){
		return "Air vehicle (Plane). Weight:"+getWeight()+"Speed: "+getSpeed()+"Cost: "+getCost()+"Max distance: "+getDist()+"Plane Engine Type: "+getEngine();
	}
}
class Copter extends Air{
	private int height;
	public int getHeight(){
		return height;
	}
	public void setHeight(int height){
		this.height = height;
	}
	@Override
	public String getDescription(){
		return "Air vehicle (Helicopter). Weight:"+getWeight()+"Speed: "+getSpeed()+"Cost: "+getCost()+ "Max distance: "+getDist()+"Max Fly Height: "+getHeight();
	}
}
//-----------------------------------------
class Ground extends Vehicle{
	private String fueltype;
	public String getFuel(){
		return fueltype;
	}
	public void setFuel(String fueltype){
		this.fueltype = fueltype;
	}
	@Override
	public String getDescription(){
		return "Ground vehicle. Weight:"+getWeight()+"Speed: "+getSpeed()+"Cost: "+getCost()+ "Engine fuel type: "+getFuel();
	}
}
class Bus extends Ground{
	private int capacity;
	public int getCap(){
		return capacity;
	}
	public void setCap(int capacity){
		this.capacity = capacity;
	}
	@Override
	public String getDescription(){
		return "Ground vehicle (Bus). Weight:"+getWeight()+"Speed: "+getSpeed()+"Cost: "+getCost()+ "Max capacity: "+getCap();
	}
}
class Train extends Ground{
	private int power;
	public int getPower(){
		return power;
	}
	public void setPower(int power){
		this.power = power;
	}
	@Override
	public String getDescription(){
		return "Ground vehicle (Train). Weight:"+getWeight()+" Speed:"+getSpeed()+" Cost:"+getCost()+ " Engine power:"+getPower();
	}
}
class Car extends Ground{
	private String cartype;
	public String getType(){
		return cartype;
	}
	public void setType(String cartype){
		this.cartype = cartype;
	}
	@Override
	public String getDescription(){
		return "Ground vehicle (Car). Weight:"+getWeight()+" Speed:"+getSpeed()+" Cost:"+getCost()+ " Car type:"+getType();
	}
}
//----------------------------------------
class Sea extends Vehicle{
	private int disp;
	public int getDisp(){
		return disp;
	}
	public void setDisp(int disp){
		this.disp = disp;
	}
	@Override
	public String getDescription(){
		return "Sea vehicle. Weight:"+getWeight()+" Speed:"+getSpeed()+" Cost:"+getCost()+ " Displacement:"+getDisp();
	}
}
class Sailboat extends Sea{
	private int mast;
	public int getMast(){
		return mast;
	}
	public void setmast(int mast){
		this.mast = mast;
	}
	@Override
	public String getDescription(){
		return "Sea vehicle (Sailboat). Weight:"+getWeight()+" Speed:"+getSpeed()+" Cost:"+getCost()+ " mast qty:"+getMast();
	}
}
class Dieselboat extends Sea{
	private int deck;
	public int getDeck(){
		return deck;
	}
	public void setDeck(int deck){
		this.deck = deck;
	}
	@Override
	public String getDescription(){
		return "Sea vehicle (Dieselboat). Weight:"+getWeight()+" Speed:"+getSpeed()+" Cost:"+getCost()+" Deck qty:"+getDeck();
	}
}

public class Main3 {
	public static void main (String [] args){
		Plane plane1 = new Plane();
		plane1.setWeight(2500);
		plane1.setSpeed(600);
		plane1.setCost(250);
		plane1.setDist(11000);
		plane1.setEngine("turboprops");
		System.out.println(plane1.getDescription());
	}
}
