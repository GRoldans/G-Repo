public class JavaStrings 
{
    public static void main(String[] args) 
    {
        //String Length
        String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + alpha.length());

        //Upper/lowercase
        String txt= "Hello World";
        System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt.toLowerCase());   // Outputs "hello world"

        //findingchar
        String locate = "Please locate where 'locate' occurs!";
        System.out.println(locate.indexOf("locate")); // Outputs 7


    }
}