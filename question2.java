import java.util.Scanner;

public class question2 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number ");
         int num = sc.nextInt();
         if (num%2==0) {
            System.out.println("it is even number ");
         }
         else{
            System.out.println("it is odd number");
         }
        
         for (int i = num; i >= 0; i--) {
            if (i % 2 == (num % 2)) { 
              System.out.println(i);
            }
          }
        
         
    }
}


