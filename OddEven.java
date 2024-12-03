import java.util.Scanner;
public class OddEven
{
    public static void main(String[]args)
    {
    System.out.println("Enter a number");
    Scanner scan = new Scanner(System.in);
    int Num = scan.nextInt();
    int Output = (Num%2);

        if
            (Output%2 == 0)
        {
            System.out.println("The number Even.");
        }
        else 
        {
            System.out.println("The number is Odd.");
        }

        scan.close();
    }
}