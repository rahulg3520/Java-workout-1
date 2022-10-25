import java.util.Scanner;

public class Temperature {

    public static void main(String args[])
    {
        int F=0;
        float C=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter temperature value in fahrenheit:");

        F=sc.nextInt();

        C=(F-32)*5/9;

        System.out.println("Temperature value in celsius is "+ C);

    }
}
