package java101;
import java.util.Scanner;

public class Taksimetre {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		int mesafe;
		float km_ucreti = 2.20f;
		
		System.out.print("Taksi ile gidilen mesafeyi(km) giriniz: ");
		mesafe = input.nextInt();
		
		input.close();
		
		float ucret = (mesafe * km_ucreti <= 20) ? 20 : (mesafe * km_ucreti);
		
		System.out.println("Taksiye ödenecek tutar: " + ucret + "TL");
	}
}
