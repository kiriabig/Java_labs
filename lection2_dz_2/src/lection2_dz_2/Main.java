package lection2_dz_2;

class Point {
	protected double x,y;
	protected Point (double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX(){
		return x;
	}
	public void setX(double x){
		this.x = x;
	}
	public double getY(){
		return y;
	}
	public void setY(double y){
		this.y = y;
	}
	public void setPoint (double x,double y){
		this.x = x;
		this.y = y;
	}
	public void movePoint (double x1, double y1){
		this.x = x+x1;
		this.y = y+y1;
	}
}


class Circle extends Point{
	private double rad;
	protected Circle (double x,double y,double rad){
		super (x,y);
		if (rad < 0 || rad==0) {
            throw new IllegalArgumentException("Radius can not be less then zero or 0.");
        }
		this.rad=rad;
        }
	
	public double getRad(){
		return rad;
	}
	public void setRad(double rad){
		this.rad = rad;
	}
	public void cloneCircle (Circle circle){
		setPoint(circle.getX(),circle.getY());
		setRad(circle.getRad());
	}
	
	
	@Override
    public String toString(){
    	return "Circle. Center coordinates ("+getX()+";"+getY()+"). Radius:"+getRad();
    }
}


class Rectangle {
	protected double a,b;
	protected Rectangle(double a, double b){
		this.a=a;
		this.b=b;
	}
	public double getWidth(){
		return a;
	}
	public double getHeight(){
		return b;
	}
	public void setWidth(double a){
		this.a = a;
	}
	public void setHeight(double b){
		this.b = b;
	}
	
	@Override
    public String toString(){
    	return "Rectangle. Width:"+getWidth()+" Height:"+getHeight();
    }
}

class Square extends Rectangle{
	protected Square(double a) {
		super(a,a);
	}
	public void setWidth(double a){
		this.a = a;
		this.b=a;
	}
	public void setHeight(double b){
		this.b = b;
		this.a=b;
	}
	@Override
    public String toString(){
    	return "Square. Length:"+getWidth();
    }

}

public class Main {

	public static void main(String[] args) {
	   Point point1 = new Point (4,7);
	   Circle circle1 = new Circle (0,0,15);
	   Circle circle2 = new Circle(10,10,15);
	   System.out.println(circle1+"  "+circle2);
	   circle2.cloneCircle(circle1);
	   System.out.println(circle1+"  "+circle2);
	   Square square1 = new Square(5);
	   System.out.println(square1);
	   square1.setHeight(4);
	   System.out.println(square1);
	   Rectangle rec1 = new Rectangle(1,8);
	   System.out.println(square1+"  "+rec1);
	   rec1.setWidth(2);
	   System.out.println(square1+"  "+rec1);
	   
	}

}
