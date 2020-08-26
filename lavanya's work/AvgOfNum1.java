package oopsprograms;

public class AvgOfNum1 
{
	//data
	private double num1,num2,num3;
	//contructor
	public void setNum1(double num1)
	{
		this.num1 = num1;
	
	}
	public void setNum2(double num2)
	{
		this.num2=num2;
	}
		public void setNum3(double num3)
		{
			this.num3=num3;
		}
		
		//getter----used  to get values from object individually
		public double getNum1()
		{
			return num1;
		}
		public double getNum2()
		{
			return num2;
		}
		public double getNum3()
		{
			return num3;
		}
	 	
	 	//business method
			
	private double printAvgResult()
	{
		System.out.println("--------------------submethod entry------------------------");
		double result;
		  
		  //average=sum/count
		  result= (num1+num2+num3)/3;
		 
		  return result;
	}
//tesing the application
	
	public static void main(String[] args)
	{
		System.out.println("--------------------main entry------------------------");
	
		//object creation
		AvgOfNum1 avg1=new AvgOfNum1();
		avg1.setNum1(165);
		avg1.setNum2(85);
		avg1.setNum3(75);
		//calling method
		System.out.println(avg1.getNum1());
		System.out.println(avg1.getNum2());
		System.out.println(avg1.getNum3());
		
			System.out.println(avg1.printAvgResult());
			
		System.out.println("--------------------main exit------------------------");

	}
}




