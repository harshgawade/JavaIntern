import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) {
        
        int num1 ,num2;

        Scanner sc =new Scanner(System.in);

        System.out.println("Enter the First number:");
        num1=sc.nextInt();
        System.out.println("Enter the Second number:");
        num2=sc.nextInt();
        

        System.out.println("Which operation you have to performed[+ , - , * , /]");

        char op= sc.next().charAt(0);
        
        switch(op)
         {
             case '+':
               System.out.println("The Addition is:"+(num1+num2));
               break;

            case '-':
               System.out.println("The Subtraction is:" +(num1-num2));
               break;

            case '*':
               System.out.println("The Multiplication is:"+(num1*num2));
               break;

            case '/':
               System.out.println("The Division is:" + (num1/num2));
               break;

            default:
               System.out.println("Invalid Input");
         }

    }
}
  
        