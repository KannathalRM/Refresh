package Bmi;

import java.util.Scanner;

public class bmicalc {
	
private void cal() {{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter weight in lb");
	double weight = s.nextDouble();
	weight=(int) (weight/2.2);
	System.out.println("Enter height in inch");
	double height = s.nextDouble();
	height= (height*0.0254);
	Double BMI=(Double)(weight/(Math.pow(height, 2)));
System.out.println("BMI is: "+BMI);
	if(BMI<18.5)
	{
		System.out.println("Underweight");
		}
	else if(BMI>=18.5 && BMI<=24.9)
		System.out.println("Healthy weight");
   else if(BMI>=25.0 && BMI<=29.9)
     {
	   System.out.println("Overweight");
}
   else if(BMI>=30.0)
   {System.out.println("Obesity");
   }
}}
public static void main(String[] args) {
	bmicalc b=new bmicalc();
	b.cal();
}
}
