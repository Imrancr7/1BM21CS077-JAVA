import java.util.*;
class quadratic{
public static void main(String args[])
{
	Scanner sc =new Scanner(System.in);
      System.out.println("Enter the co_efficents a, b and c:");
	System.out.println("Enter the value of a:");
	double a = sc.nextDouble();
	System.out.println("Enter the value of b:");
	double b = sc.nextDouble();
	System.out.println("Enter the value of c:");
	double c = sc.nextDouble();
	double d= b*b - 4.0*a*c;
	if(d>0)
	{  double r1 = (-b + Math.pow(d,0.5))/(2.0*a);
	   double r2 = (-b - Math.pow(d,0.5))/(2.0*a);
	   System.out.println("The roots are"+r1+"and"+r2);
	}
	else if(d==0)
	{  double r1 = -b/(2.0*a);
	   System.out.println("The roots is"+r1);
	}
      else   
	{ double r1= -b/(2.0*a);
        System.out.println("The roots are imaginary!!");
	}
}
}