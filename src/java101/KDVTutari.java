package java101;
import java.util.Scanner;

/*
Fiyatý girilen ürünün KDV'li fiyatýný hesaplayan program.
 */

public class KDVTutari {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.print("KDV'siz fiyatý giriniz: ");
		int fiyat = input.nextInt();
		
		input.close();
		
		int kdv = (fiyat < 1000) ? 18 : 8;
		double kdv_tutar = fiyat * kdv / 100;
		double kdv_fiyat = fiyat + kdv_tutar;
		
		System.out.print("KDV tutarý: ");
		System.out.println(kdv_tutar);
		System.out.print("KDV'li fiyat: ");
		System.out.println(kdv_fiyat);
	}

}
