import java.util.Scanner;
public class TemperatureConverterapp {

	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("enter temperature convertor in degree-f");
		double f=Sc.nextDouble();
		TemperatureConverter temperatureConverter = new TemperatureConverter();
		double temp=temperatureConverter.convertFahrenheitToCelsius(f);
		System.out.println(temp);

	}

}
