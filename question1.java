import java.util.*;
public class  question1 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter first number ");
          int first = sc.nextInt();
          System.out.println("Enter Second number ");
          int Second = sc.nextInt();
          System.out.println("Enter Third number ");
          int Third = sc.nextInt();

          if (first==Second && Second==Third && first==Third) {
              System.out.println(" All numbers are equal");
          }
          else if (first!=Second && Second!=Third && first!=Third) {
            System.out.println(" All numbers are diffrent ");
          }
          else{
            System.out.println("Neither  all are equal or diffrent ");
          }

    }
}