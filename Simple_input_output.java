import java.util.Scanner;
public class Simple_input_output
{
    public static void main(String[] args)
    {
        int no1,no2,sum;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter first number");
        no1=keyboard.nextInt();
        System.out.println("Please enter second number");
        no2=keyboard.nextInt();
        sum=no1+no2;
        System.out.println(no1+" + "+ no2+" = "+ sum);
    }
}