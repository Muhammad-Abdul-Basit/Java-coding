import java.util.Scanner;
public class if_else
{
    public static void main (String[] args)
    {
        final double fixed_salaray=850.0;
        final double max_working_hour=35.0;
        double over_time_rate_per_hour=30.0;
        double working_hour;
        double salaray;
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Please enter the working hour");
        working_hour=keyboard.nextDouble();
        if(working_hour<=max_working_hour)
        {
            salaray=fixed_salaray;
        }
        else
        {
            salaray=fixed_salaray+(working_hour-max_working_hour) * over_time_rate_per_hour;
        }
        System.out.println("Employee working hour is " + working_hour + " and salaray is : " + salaray);
    }
}