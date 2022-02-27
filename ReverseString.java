import java.util.Scanner;
 
class ReverseString {
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the String:");

       String input= sc.nextLine();
 
        byte[] var = input.getBytes();
 
        byte[] result = new byte[var.length];
 
        for (int i = 0; i < var.length; i++)
            result[i] = var[var.length - i - 1];
 
        System.out.println(new String(result));
    }
}