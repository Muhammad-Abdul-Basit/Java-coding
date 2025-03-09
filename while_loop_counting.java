import java.util.Scanner;
public class while_loop_counting
{
    public static void main(String[] args)
    {
        double max_counting_number;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter the number for counting");
        max_counting_number=keyboard.nextDouble();
        int count=0;
        while(count<=max_counting_number)
        {
            System.out.print(count+ " ");
            count++;
        }
        keyboard.close();
    }
}