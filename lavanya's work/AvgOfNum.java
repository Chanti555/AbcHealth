package oopsprograms;

public class AvgOfNum {

	//data
	private double num1,num2,num3;
	//contructor
	public  AvgOfNum (double num1,double num2,double num3)
	{ 
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	 	//method
	private double printAvgResult()
	{
		  double result;
		  
		  //average=sum/count
		  result= (num1+num2+num3)/3;
		 // System.out.println(result);
		  //if we print result we have to make return type  as void
		  return result;
	}
//tesing the application
	
	public static void main(String[] args)
	{
		//object creation
		AvgOfNum avg1=new AvgOfNum(125,75,55);
		//calling method
		
		System.out.println(avg1.printAvgResult());
		AvgOfNum avg2=new AvgOfNum(25,120,58);
		System.out.println(avg2.printAvgResult());
		

	}

}


