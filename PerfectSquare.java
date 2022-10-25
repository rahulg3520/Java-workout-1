import java.util.Scanner;

public class PerfectSquare {

    public static void main(String args[])
    {
        int low=0;

        int high=0;

        System.out.println("Enter the lower range:");

        Scanner sc=new Scanner(System.in);

        low=sc.nextInt();

        System.out.println("Enter the higher range:");

        high=sc.nextInt();

        for(int i=low;i<=high;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(Math.pow(j,2)==i)
                {
                    System.out.println(i);
                    break;
                }

            }
        }

    }
}
