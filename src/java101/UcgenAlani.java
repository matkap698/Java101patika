package java101;
import java.util.Scanner;
/*
�� kenar uzunlu�u bilinen ��genin alan�n� hesaplayan Java program�
Form�l :  u say�s� �evrenin yar�s� ve a, b, c ��genin kenar uzunluklar�
Alan = u * (u - a) * (u - b) * (u - c)
*/



public class UcgenAlani {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Birinci kenar uzunlu�unu giriniz.");
		a = input.nextInt();
		System.out.print("�kinci kenar uzunlu�unu giriniz.");
		b = input.nextInt();
		System.out.print("���nc� kenar uzunlu�unu giriniz.");
		c = input.nextInt();
		
		input.close();
		
		float u = (a + b + c) / 2f;
		float alan = u * (u - a) * (u - b) * (u - c);
		
		System.out.println("��genin Alan�: " + alan);
	}

}
