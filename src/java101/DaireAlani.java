package java101;
import java.util.Scanner;


public class DaireAlani {

	public static void main(String[] args) 
	{
		double pi = 3.14;
		double yaricap, merkez_aci;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Dairenin yarýçapýný giriniz: ");
		yaricap = input.nextFloat();
		
		double alan = pi * yaricap * yaricap;
		
		System.out.println(yaricap + " Yarýçaplý dairenin alaný: " + alan);
		System.out.println(yaricap + " Yarýçaplý dairenin çevresi :" + (2 * pi * yaricap));
		
		System.out.print("Daire diliminin merkez açý ölçüsünü giriniz: ");
		merkez_aci = input.nextFloat();
		
		input.close();
		
		System.out.println("Merkez açýsýnýn ölçüsü " + merkez_aci + " derece olan daire diliminin alaný: " + alan *  (merkez_aci / 360));
		
		
	}

}
