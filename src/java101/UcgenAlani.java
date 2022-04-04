package java101;
import java.util.Scanner;
/*
Üç kenar uzunluðu bilinen üçgenin alanýný hesaplayan Java programý
Formül :  u sayýsý çevrenin yarýsý ve a, b, c üçgenin kenar uzunluklarý
Alan = u * (u - a) * (u - b) * (u - c)
*/



public class UcgenAlani {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Birinci kenar uzunluðunu giriniz.");
		a = input.nextInt();
		System.out.print("Ýkinci kenar uzunluðunu giriniz.");
		b = input.nextInt();
		System.out.print("Üçüncü kenar uzunluðunu giriniz.");
		c = input.nextInt();
		
		input.close();
		
		float u = (a + b + c) / 2f;
		float alan = u * (u - a) * (u - b) * (u - c);
		
		System.out.println("Üçgenin Alaný: " + alan);
	}

}
