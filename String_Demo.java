import java.util.Scanner;
public class String_Demo
{
    public static void main (String[] args)
    {
        String str="programming is the best";
        char character;
        int counter=0;
        int index=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter the Character that you want how many times arrived in string : "+str);
        character=input.next().charAt(0);
        while(index<str.length())
        {
            if(str.charAt(index)==character)
            {
                counter++;
            }
            index++;
        }
        System.out.print(character+" Character frequency in : (" + str+") is : " + counter);
        input.close();
    }
}