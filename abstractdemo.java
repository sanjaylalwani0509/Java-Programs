 abstract class Figure
{
	double di		
		
		
		dim1=a;
		dim2=b;
	}
	abstract void area();
}

class Rectangle extends Figure
{
	Rectangle(double a,double b)
	{
		super(a,b);
	}
	
	void area()
	{
		double a;
		a=dim1*dim2;
		System.out.println("Area of Rectangle = "+a);
	}
}

class Triangle extends Figure
{
	Triangle(double a,double b)
	{
		super(a,b);
	}
	
	void area()
	{
		double a;
		a=(dim1*dim2)/2;
		System.out.println("Area of Triangle = "+a);
	}
}

class abstractdemo
{
	public static void main(String args[])
	{
		Rectangle r= new Rectangle(10,20);
		r.area();
		Triangle t=new Triangle(20,30);
		t.area();
		
		System.out.println("=============================");
		
		Figure f;
		f=r;
		f.area();
		
		f=t;
		f.area();
	}
}
