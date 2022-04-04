package java101;
import java.util.Scanner;

public class VucutKitleEndeksi {

	public static void main(String[] args)
	{
		Scanner girdi = new Scanner(System.in);
		
		float boy, kilo;
		
		System.out.print("Boyunuzu metre cinsinden giriniz: ");
		boy = girdi.nextFloat();
		System.out.print("Kilonuzu kg cinsinden giriniz: ");
		kilo = girdi.nextFloat();
		
		girdi.close();
		
		System.out.println("Beden kitle endeksiniz: " + kilo / (boy * boy));
		
	}

}
