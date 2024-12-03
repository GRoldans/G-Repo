public class Exercise061124
{
    public static void main(String[] args)
    {
        int num = 236348;
        int a = num;
        int rem = 0;
        int sum = 0;
        
        while (num>0)
        {
            rem = num%10;
            sum = sum+rem;
            num/=10;
        }
        System.out.println("given digit: " +a);
        System.out.println("sum of digit: " +sum);
    }
}


