package java101;
import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) 
	{
		Scanner girdi = new Scanner(System.in);
		float armut, elma, muz, domates, patlican;
		
		System.out.print("Ka� kg armut al�nd�?: ");
		armut = girdi.nextFloat();
		System.out.print("Ka� kg elma al�nd�?: ");
		elma = girdi.nextFloat();
		System.out.print("Ka� kg muz al�nd�?: ");
		muz = girdi.nextFloat();
		System.out.print("Ka� kg domates al�nd�?: ");
		domates = girdi.nextFloat();
		System.out.print("Ka� kg patl�can al�nd�?: ");
		patlican = girdi.nextFloat();
		
		girdi.close();
		
		float toplam = (armut * 2.14f) + (elma * 3.67f) + (muz * 0.95f) + (domates * 1.11f) + (patlican * 5.0f);
		System.out.println("Toplam Tutar: " + toplam + " TL");
	}

}
