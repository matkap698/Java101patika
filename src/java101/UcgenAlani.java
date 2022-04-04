package java101;
import java.util.Scanner;
/*
Üç kenar uzunluğu bilinen üçgenin alanını hesaplayan Java programı
Formül :  u sayısı çevrenin yarısı ve a, b, c üçgenin kenar uzunlukları
Alan = u * (u - a) * (u - b) * (u - c)
*/



public class UcgenAlani {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Birinci kenar uzunluğunu giriniz.");
		a = input.nextInt();
		System.out.print("İkinci kenar uzunluğunu giriniz.");
		b = input.nextInt();
		System.out.print("Üçüncü kenar uzunluğunu giriniz.");
		c = input.nextInt();
		
		input.close();
		
		float u = (a + b + c) / 2f;
		float alan = u * (u - a) * (u - b) * (u - c);
		
		System.out.println("Üçgenin Alanı: " + alan);
	}

}