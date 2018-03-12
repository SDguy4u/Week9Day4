package CW;
import java.util.Scanner;

import javafx.scene.control.Label;

public class W9D4
{
    public static void main(String args[])
    {
       double a, b, c,d;
       char ch;
       Scanner keyboard = new Scanner(System.in);
      
       System.out.print("Enter First Number : ");
       a = keyboard.nextDouble();
       System.out.print("Enter Error Term : ");
       c = keyboard.nextDouble();
       System.out.print("Enter Second Number : ");
       b = keyboard.nextDouble();
       System.out.print("Enter Error Term : ");
       d = keyboard.nextDouble();
       System.out.print("Enter Operator (+, -, *, /) : ");
       ch = keyboard.next().charAt(0);
	   
       if(ch == '+')
       {
    	   String part1 = String.valueOf(a + b);
            String part2 = String.valueOf(c + d);
            String result = (part1 + " \u00b1 " + part2);
            System.out.print("Result = " +result);
       }
       else if(ch == '-')
       {
    	   String part1 = String.valueOf(a - b);
    	   String part2 = String.valueOf(c - d);
    	   String result = (part1 + " \u00b1" + part2);
            System.out.print("Result = " +result);
       }
       else if(ch == '*')
       {
    	   String part1 = String.valueOf(a*b);
    	   String part2 = String.valueOf((c/a+d/b)*a*b);
    	   String result = (part1 + " \u00b1" + part2);
            System.out.print("Result = " +result);
       }
       else if(ch == '/')
       {
    	   String part1 = String.valueOf(a/b);
    	   String part2 = String.valueOf((c/a+d/b)*a*b);
    	   String result = (part1 + " \u00b1" + part2); 
            System.out.print("Result = " +result);
       }
       else
       {
            System.out.print("Wrong Operator !!!");
       }
            
    }
}
