package java101;
import java.util.Scanner;

/*
Fiyat� girilen �r�n�n KDV'li fiyat�n� hesaplayan program.
 */

public class KDVTutari {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("KDV'siz fiyat� giriniz: ");
		int fiyat = input.nextInt();
		
		input.close();
		
		int kdv = (fiyat < 1000) ? 18 : 8;
		double kdv_tutar = fiyat * kdv / 100;
		double kdv_fiyat = fiyat + kdv_tutar;
		
		System.out.print("KDV tutar�: ");
		System.out.println(kdv_tutar);
		System.out.print("KDV'li fiyat: ");
		System.out.println(kdv_fiyat);
	}

}
