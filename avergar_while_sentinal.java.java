import java.util.Scanner;
public class avergar_while_sentinal
{
    public static void main(String[] args)
    {
        double sentinal=0.0;
        Scanner input=new Scanner(System.in);
        System.out.println(" Please enter numbers, give avergae of number.");
        System.out.println(" Enter 0.0 after last number ");
        double number=input.nextDouble();
        int count=0;
        double sum=0;
        while(number!=sentinal)
        {
            sum=sum+number;
            count++;
            number=input.nextDouble();
        }
        System.out.print("Averrage of "+ count + " numbers is : "+(sum/count));
    }
}