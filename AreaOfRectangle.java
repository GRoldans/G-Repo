import java.util.Scanner;
public class AreaOfRectangle
{
    public static void main(String[]args)
    {
        System.out.println("To get the area of a reactangle \n Enter the Width");
        Scanner Test = new Scanner(System.in);
        System.out.println(Test);
        Double Width = Test.nextDouble();
        System.out.println("Now enter the Height");
        Double Height = Test.nextDouble();
        Double AreaOfRectangle = Width * Height;
        System.out.println("Width is: " +Width);
        System.out.println("Height is: " +Height);
        System.out.println("The Area Of Rectangle is: "+AreaOfRectangle);

        Test.close();
        }
}