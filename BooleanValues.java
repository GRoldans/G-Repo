public class BooleanValues
{
    public static void main(String[]args)
    {
        Boolean IsJavaFun = true;
        Boolean IsFishTasty = false;
        System.out.println(IsJavaFun);
        System.out.println(IsFishTasty);//output is true and false

        int x = 10;
        int y = 9;
        System.out.println(x<y);//output is false

        int xy = 10;
        int yz = 9;
        System.out.println(xy>yz);//output is true

        int MyAge = 32;
        int VotingAge = 18;

        if (MyAge>=VotingAge)
        {
            System.out.println("Old enought to Vote");
        }
        else
        {
            System.out.println("Not old enough to Vote");
        }
            //Short Hand If..Else
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}