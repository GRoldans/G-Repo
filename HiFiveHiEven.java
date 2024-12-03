import java.util.Scanner;
public class HiFiveHiEven
{
    public static void main(String[]args)
    {
        System.out.println("Enter a number");
        Scanner scan = new Scanner(System.in);
        int Num = scan.nextInt();

        if (Num % 5 == 0) 
        {
            System.out.println("HiFive");
        }
        if (Num % 2 == 0)
        {
            System.out.println("HiEven");
        }
        else
        {
            System.out.println("TRY AGAIN");
        }
        scan.close();
    }
}