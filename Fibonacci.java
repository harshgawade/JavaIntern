import java.util.Scanner;

class Fibonacci
{
    public static void main(String[] args) {
        
        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of n:");
        n=sc.nextInt();

        int Firstno=0;
        int secondno=1;
        System.out.println(Firstno);
        System.out.println(secondno);

        for(int i=2; i<n;i++)
        {
            int thirdno = Firstno + secondno;
            System.out.println(thirdno);
            Firstno = secondno;
            secondno = thirdno;
        }
    }
}