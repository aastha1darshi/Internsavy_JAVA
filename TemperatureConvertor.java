// Temperature convertor
import java.util.Scanner;
public class TemperatureConvertor{

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("FOR FAHRENHIET TO CELSIUS ENTER (1)");
        System.out.println("FOR CELSIUS TO FAHRENHIET ENTER (2)");
        int result = scan.nextInt();

        if(result==1)
        {
            System.out.println("FAHRENHIET TO CELSIUS");
            System.out.println("Enter Fahernhiet value to convert:");
            double value = scan.nextDouble();
            double valueCelsius = (value-32)*1.8;// formula to convert F to C
            System.out.print("Celsius is:");
            System.out.println(Math.round(valueCelsius*10.0)/10.0);// to avoid unnecessary strech of decimal value we use round off
            System.out.println("*****THANKYOU FOR USING*****");
        }

        else if(result==2)
        {
            System.out.println("CELSIUS TO FAHRENHIET"); 
            System.out.println("Enter Celsius value to convert:");
            double value2 = scan.nextDouble();
            double valueFahrenhiet = value2*1.8+32;//formula to convert C to F
            System.out.print("Fahrenhiet is:");
            System.out.println(Math.round(valueFahrenhiet*10.0)/10.0);
            System.out.println("*****THANKYOU FOR USING*****");
        }

        else
        {
            System.out.println("NOT A VALID INPUT, CHOOSE EITHER 1 OR 2");
        }
    }
}