import java.lang.*;
import java.util.*;
public class TempCon
{
	public static void main(String[] args) {
	    double n,r;
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the temperature");
		n=sc.nextInt();
		System.out.println("the temperaure is in  \n 1.fahrenheit \n 2.Celsius");
		int m=sc.nextInt();
		switch(m){
		    case 1: r=(n-32)*5/9;
		    System.out.println("Celsius temperaure is="+r);
		    break;
		    case 2: r=((9*n)/5)+32;
		    System.out.println("fahrenheit temperaure is="+r);
		    break;
		    default: System.out.println("enter valid choise");
		    break;
		}
	}
}
