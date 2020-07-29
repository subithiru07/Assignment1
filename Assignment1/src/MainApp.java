 class Square implements Area1{

	@Override
	public void Area(Double a) {
		// TODO Auto-generated method stub
		System.out.println("Area of Square "+ a*a);
		
	}
 }
class Circle implements Area1{

	@Override
	public void Area(Double a) {
		// TODO Auto-generated method stub
		System.out.println("Area of Circle "+ 3.14*a*a);
		
	}
}
class TriangleArea implements Area2{

	@Override
	public void Area(Double b, Double l) {
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


