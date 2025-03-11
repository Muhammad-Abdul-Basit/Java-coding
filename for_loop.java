import java.util.Scanner;
public class for_loop
{
    public static void main (String[] args)
    {
        int factorial_number;
        int factorial=1;
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter positive integer and get factorial");
        factorial_number=input.nextInt();
        if(factorial_number<0)
        {
            System.out.println("Please enter positive integer");
        }
        else if(factorial_number==0 || factorial_number==1 )
        {
            System.out.print("Factorial of : "+ factorial_number+" is : "+factorial);
        }
        else
        {
            for(int count=1;count<=factorial_number;count++)
            {
                factorial=factorial*count;
            }
            System.out.print("Factorial of : "+ factorial_number+" is : "+factorial);
        }
    }
}