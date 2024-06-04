// Java Program to Handle multiple exception
import java.io.*;
import java.util.Scanner;

class question5 {
	public static void main(String[] args)
	{
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a number ");
          int a = sc.nextInt();
          System.out.println("Enter b number");
          int b = sc.nextInt();
		try {
	     
			  int result = a/b;
              
		}
		catch (Exception result) {
			System.out.println(
				"Zero cannot divide any number");
		}
        finally {
            sc.close();
            System.out.println("Code execution completed (try or catch)"); 
        }
       
		
	}
}
