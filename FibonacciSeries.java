import java.util.Scanner;

class Rec
{
    public static int fib(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
}

public class FibonacciSeries {

    public static void main(String args[])
    {
        System.out.println("Enter a number for fibonacci series:");

        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        int num=0;

        for(int i=0;i<=n;i++)
        {
            num =Rec.fib(i);

            if(num<=n) {
                System.out.println(num);
            }
            else
            {
                break;
            }
        }

    }

}
