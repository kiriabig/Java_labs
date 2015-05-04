package lection2_dz_1;

abstract class Flower {                  //abstract super class
	private String name,color;
	private double price;
	
	protected Flower(double price, String name, String color) {
        if (price < 0) {
            throw new IllegalArgumentException("Price can not be less then zero.");
        }
        this.price = price;
        if (name == null) {
            throw new NullPointerException("Argument name can not be null.");
        }
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name of flower can not be empty.");
        }
        this.name = name;
        if (color == null){
			throw new NullPointerException("Argument name can not be null.");
		}
		if (color.isEmpty()) {
            throw new IllegalArgumentException("Name of flower can not be empty.");
		}
		this.color = color;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getName(){
		return name;
	}
	public String getColor(){
		return color;
	}
	@Override                                           
	public String toString(){
		return "Flower: "+getName()+","+getColor()+","+getPrice();
	}
}

class Rose extends Flower{
	private static String name = "Rose";
	public Rose (double price, String color){
		super (price, name, color);
		
	}
	@Override                                           
	public String toString(){
		return "Flower: "+getName()+","+getColor()+","+getPrice();
	}
}

class Lily extends Flower{
	private String color;
	private static String name = "Lily";
	public Lily (double price, String color){
		super (price,name,color);
		
	}
	@Override                                           
	public String toString(){
		return "Flower: "+getName()+","+getColor()+","+getPrice();
	}
}

class Tulip extends Flower{
	private String color;
	private static String name = "Tulip";
	public Tulip (double price, String color){
		super (price,name,color);
		
		
	}
	@Override                                           
	public String toString(){
		return "Flower: "+getName()+","+getColor()+","+getPrice();
	}
}

class Bouquet{
	
	public String generateBouquet(Flower [] flowerpack){
		String report = "";
		for (Flower arr: flowerpack){
			report+="\n"+flowerpack.toString();
		}
		return report;
	}
	
	public double getPrice(){
        return price;
	}
}


public class Main {
   public static void main (String [] args){
	  Tulip tulip1 = new Tulip(50,"red"); 
	  Rose rose1 = new Rose(123.20,"red");
	  Lily lily1 = new Lily(40,"white");
	  
	  Bouquet report = new Bouquet();
	  
	  Flower [] flowerpack = new Flower []{tulip1,rose1,lily1};
	  System.out.println(report.generateBouquet(flowerpack));
	 System.out.println(rose1.getPrice());
   }
}
