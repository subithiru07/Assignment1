 class Square implements Shapes1{

	@Override
	public void Area(double side) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square "+ side*side);
		
	}
 }
class Circle implements Shapes1{

	@Override
	public void Area(double side) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle "+ 3.14*side*side);
		
	}
}
class TriangleArea implements Shape2{

	@Override
	public void Area(double b, double l) {
		// TODO Auto-generated method stub
		System.out.println("Area of Triangle "+ 0.5*b*l);
		
	}
	
}

	

public  class MainApp {

	public static void main(String[] args) {
		Square S = new Square();
		S.Area(10.00);
		Circle C= new Circle();
		C.Area(5.0);
		TriangleArea T = new TriangleArea();
		T.Area(20.0, 10.00);
      
	}
		// TODO Auto-generated method stub

	}


