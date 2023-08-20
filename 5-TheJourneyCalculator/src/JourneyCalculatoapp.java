import java.util.Scanner;
public class JourneyCalculatoapp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter speed and time to calculate speed");
		double speed=sc.nextDouble();
		double time=sc.nextDouble();
		JourneyCalculato journeyCalculato = new JourneyCalculato();
		double distance=journeyCalculato.calculateDistance(speed,time);
		System.out.println(distance);
	

	}

}
