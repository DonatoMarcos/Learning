package entities;

public class Retangulo {
	
	public double width;
	public double height;
	
	public Retangulo (double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double area() {
		return width * height;
	}
	
	public double perimeter () {
		return 2 * width + 2 * height;
	}
	
	public double diagonal ( ) {
		return Math.sqrt(height * height + width* width);
	}

	
	public String toString() {
		return "Medidas = "+
				+width
				+", "
				+height
				+" Area = "
				+area()
				+" Perimetro = "
				+perimeter()
				+" Diagonal = " 
				+diagonal();
	}
}
