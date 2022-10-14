import java.util.*;
public class VendingMachine {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
       final double num1 = 1.25, num2 = 0.75, num3 = 0.90, num4 = 0.75, num5 = 1.50, num6 = 0.75;


       System.out.println("Enter item number:");
       double item = sc.nextDouble();
       double money = sc.nextDouble();

       if(item == 1){
           double sum = money - num1;
           if(sum >= 0)
            System.out.print("Thank you for buying item 1. Your change is "+sum);
            else {
               double insert = sum * (-1);
               System.out.println("Please insert another " +insert);
                }
       }
        else if(item == 2){
            double sum = money - num2;
            if(sum >= 0)
                System.out.print("Thank you for buying item 2. Your change is "+sum);
            else {
                double insert = sum * (-1);
                System.out.println("Please insert another " +insert);
            }
        }
        else if(item == 3){
            double sum = money - num3;
            if(sum >= 0)
                System.out.print("Thank you for buying item 3. Your change is "+sum);
            else {
                double insert = sum * (-1);
                System.out.println("Please insert another " +insert);
            }
        }
        else if(item == 4){
            double sum = money - num4;
            if(sum >= 0)
                System.out.print("Thank you for buying item 4. Your change is "+sum);
            else {
                double insert = sum * (-1);
                System.out.println("Please insert another " +insert);
            }
        }
        else if(item == 5){
            double sum = money - num5;
            if(sum >= 0)
                System.out.print("Thank you for buying item 5. Your change is "+sum);
            else {
                double insert = sum * (-1);
                System.out.println("Please insert another " +insert);
            }
        }
        else if(item == 6){
            double sum = money - num6;
            if(sum >= 0)
                System.out.print("Thank you for buying item 6. Your change is "+sum);
            else {
                double insert = sum * (-1);
                System.out.println("Please insert another " +insert);
            }
        }
        else
           System.out.print("Invalid input");

    }
}
