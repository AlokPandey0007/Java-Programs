import java.util.Scanner;

public class FindFactorial {
    public  static  void main(String[] args) {
        System.out.println("Enter number to find factorial.");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
    long fact=FindFact(a);
            System.out.println("Factorial of "+a+ " is "+fact);

    }
    public static long FindFact(int a)
    {
        long fact=1;
        while (a>0)
        {
            fact=fact*a;
            a--;
        }
        return fact;
    }
}
