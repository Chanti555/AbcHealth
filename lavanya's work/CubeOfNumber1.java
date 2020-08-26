package oopsprograms;
//program demonstrated setters and getters

//subtraction of two numbers (class=data+constructor+method)
public class CubeOfNumber1 
{	
	//data
	private double num1;
	//setters-- used to set values to objects individually 
	public void setNum1(double num1)
	{
		this .num1 = num1;
	
	}
	
	//getter----used  to get values from object individually
	public double getNum1()
	{
		return num1;
	}
	
	 	//business method
	private double printCubeResult()
	
	{
		System.out.println("--------------------submethod entry------------------------");	
		  double result;
		  result= num1*num1*num1;
		 // System.out.println(result);
		  //if we print result we have to make return type  as void
		  return result;
	}
//tesing the application
	
	public static void main(String[] args)
	{
		System.out.println("--------------------main entry------------------------");
		//object creation
		CubeOfNumber1 ob1=new CubeOfNumber1();//calling default constructor
		ob1.setNum1(56);
		
		System.out.println(ob1.getNum1());
	
		//calling method
			System.out.println(ob1.printCubeResult());
	
			ob1.setNum1(75);
			
		
			System.out.println(ob1.getNum1());
			
			//calling method
				System.out.println(ob1.printCubeResult());

		System.out.println("--------------------main exit------------------------");
		
	}

}
