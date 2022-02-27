import java.util.Scanner;

class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the name:");
        String name = sc.nextLine();

        String reverse = new StringBuffer(name).reverse().toString();
        if (name.equals(reverse))

            System.out.println("It is a palindrome");

        else
            System.out.println("It is not a palindrome");
    }
}