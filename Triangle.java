import java.util.Scanner;

public class Triangle {

    public static void main(String args[])
    {
        int n=0;

        System.out.println("Enter an integer number");

        Scanner sc=new Scanner(System.in);

        n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.println(i + " ");
            }
            System.out.println();
        }
    }
}
