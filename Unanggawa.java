import java.util.Scanner;
public class Unanggawa
{
    public static void main(String[]args)
    {
        System.out.println("type in your first name:");
        Scanner churva = new Scanner(System.in);
        String firstname = churva.nextLine();
        System.out.println("type in your last name:");
        String lastname = churva.nextLine();
        String fullname = (firstname +" "+ lastname);
        System.out.println("Hello," +fullname);
        int myNum = 15; //try mag final aoutput ng int(myNum which is 20 ang dapat output)
        myNum = 20;
        System.out.println(myNum);
        
        churva.close();
    }
}