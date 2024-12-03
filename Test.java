import java.util.Scanner;
public class Test 
{
    public static void main(String[] args) 
    {
        
        System.out.println("Par, ano pangalan mo?");

        Scanner scan = new Scanner(System.in);
            String name = scan.nextLine();
            System.out.println("Ikaw pala si " + name + " kamusta ka?");
            System.out.println("Ilang taon ka na " + name + "?");
            String age = scan.nextLine();
            System.out.println( age + "? Wow, hindi halata!");
    
    // Close the scan(Scanner Name)
    scan.close();   
    }
}