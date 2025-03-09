import java.util.Scanner;
public class do_wile_loop
{
    public static void main(String[] args)
    {
        char option;
        Scanner keyboard=new Scanner(System.in);
        do
        {
            int factorial=1;
            int count=1;
            int factorial_number;
            System.out.println("Please enter positive number and get factorial");
            factorial_number=keyboard.nextInt();
            while(count<=factorial_number)
            {
                factorial=factorial*count;
                count++;
            }
            System.out.println("Factorial of "+ factorial_number+" is : "+ factorial);
            System.out.println("Do you want to continue program y/n");
            option=keyboard.next().charAt(0);
        }while(option=='y');
        System.out.println(" Thanks ");
        keyboard.close();
    }
}