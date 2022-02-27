import java.util.Scanner;

class Permutation{

    public static int factorial(int number) {
        int fact = 1;
        int i = 1;
        while (i <= number) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first no:");
        int number= sc.nextInt();

        System.out.println("Enter second no:");
        int r = sc.nextInt();

        int comb, per;
        per = factorial(number) / factorial(number - r);

        System.out.println("Permutation: " + per);
        comb = factorial(number) / (factorial(r) * factorial(number- r));
        System.out.println("Combination: " + comb);
    }
}