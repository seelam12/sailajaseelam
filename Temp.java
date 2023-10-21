import java.util.Scanner;
public class  Temp
 {
  private static double tofahrenheit(double celsius){
     return ( celsius * (9.0/5.0) + 32 );
  }
public static void main(String[] args) {
     double celsius = 0.0;
     double fahrenheit = 0.0;
     Scanner scan = new Scanner(System.in);
     System.out.print("Enter the Celsius temperature value = ");
     celsius = scan.nextDouble();
     fahrenheit = tofahrenheit(celsius);
     System.out.println("Fahrenheit temperature value = " +fahrenheit);
     scan.close();
    }
}

