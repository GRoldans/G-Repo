import java.util.Scanner;
public class ContractualRegular
{
    public static void main(String[]args)
    {
        System.out.println("Enter Employee Name:");
        Scanner scan = new Scanner(System.in);
        String EmpName = scan.nextLine();
        System.out.println(EmpName);
        System.out.println("Enter your ID number");
        String IdNum = scan.nextLine();
        System.out.println(IdNum);
        System.out.println("Enter Hours of Work:");
        Double Workhours = scan.nextDouble();
        System.out.println("enter Work Status [c] for Contractual [r] for Regular:");
        char Workstatus = scan.next().charAt(0);

        if (Workstatus == 'C' || Workstatus == 'c')
        {
            Double GrossIncome = Workhours * 50;
            int SSS = 200;
            int PhilHealth = 250;
            Double NetIncome = GrossIncome - SSS - PhilHealth;
            System.out.println("Your Deductions are:");
            System.out.println("SSS: "+SSS);
            System.out.println("PhilHealth: "+PhilHealth);
            System.out.println("Your Gross Salary is: " +GrossIncome);
            System.out.println("Your Net Salary is: " + NetIncome);
        }
        else if (Workstatus == 'R'|| Workstatus == 'r')
        {
            Double GrossIncome = Workhours * 250;
            int SSS = 300;
            int PhilHealth = 300;
            int Pagibig = 300;
            Double Tax = GrossIncome * .05;
            Double NetIncome = GrossIncome - SSS - PhilHealth - Tax;
            System.out.println("Your Deductions are:");
            System.out.println("SSS: "+SSS);
            System.out.println("PhilHealth: "+PhilHealth);
            System.out.println("Pagibig: "+Pagibig);
            System.out.println("Tax: "+Tax);
            System.out.println("Your Gross Salary is: " +GrossIncome);
            System.out.println("Your Net Salary is: " + NetIncome);
        }
        else
        {
            System.out.println("Invalid Input");
        }
        scan.close();
    }
}