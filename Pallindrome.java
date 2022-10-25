import java.util.Scanner;

public class Pallindrome {

    public static void main(String args[])
    {
        System.out.println("Enter a string to check palindrome :");

        Scanner sc=new Scanner(System.in);

        String str= sc.nextLine();

        int n=str.length();
        n=n-1;
        int flag=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==str.charAt(n))
            {
                n--;
                continue;
            }
            else
            {
                flag=1;
                break;
            }

        }

        if(flag==0)
        {
            System.out.println("pallindrome ");
        }
        else
        {
            System.out.println("Not pallindrome ");
        }

    }

}