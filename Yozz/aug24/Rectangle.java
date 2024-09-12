package aug24;

public class Rectangle {
private double length;
private double width=1.0;


public Rectangle(double length, double width) {
	
	this.length = length;
	this.width = width;
	
}

public Rectangle(double length) {

	this.length = length;
	this.width=1.0;
}
public double area() {
	return length*width;
}

public double getLength() {
	return length;
}

public double getWidth() {
	return width;
}

@Override
public String toString() {
	
	return "Length=" + length + "\nWidth=" + width+"\nArea="+area();
}

}
