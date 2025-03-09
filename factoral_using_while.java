import java.util.Scanner;
public class factoral_using_while
{
    public static void main(String[] args)
    {
        int factorial=1;
        int count=1;
        int factorial_number;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter positive number and get factorial");
        factorial_number=keyboard.nextInt();
        while(count<=factorial_number)
        {
            factorial=factorial*count;
            count++;
        }
        System.out.print("Factorial of "+ factorial_number+" is : "+ factorial);
        keyboard.close();;
    }
}