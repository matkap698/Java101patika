package java101;
import java.util.Scanner;


public class DaireAlani {

	public static void main(String[] args) 
	{
		double pi = 3.14;
		double yaricap, merkez_aci;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yar��ap�n� giriniz: ");
		yaricap = input.nextFloat();
		
		double alan = pi * yaricap * yaricap;
		
		System.out.println(yaricap + " Yar��apl� dairenin alan�: " + alan);
		System.out.println(yaricap + " Yar��apl� dairenin �evresi :" + (2 * pi * yaricap));
		
		System.out.print("Daire diliminin merkez a�� �l��s�n� giriniz: ");
		merkez_aci = input.nextFloat();
		
		input.close();
		
		System.out.println("Merkez a��s�n�n �l��s� " + merkez_aci + " derece olan daire diliminin alan�: " + alan *  (merkez_aci / 360));
		
		
	}

}
