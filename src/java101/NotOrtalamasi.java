package java101;
import java.util.Scanner;

/*
6 dersin not ortalamas�n� hesaplayan ve buna g�re 
s�n�f�n ge�ilip ge�ilemedi�ini belirleyen Java program�
*/
public class NotOrtalamasi {

	public static void main(String[] args) {
		
		int mat, fiz, kim, tur, tar, muz;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Matematik Notunuzu Giriniz: ");
		mat = input.nextInt();
		
		System.out.print("Fizik Notunuzu Giriniz: ");
		fiz = input.nextInt();
		
		System.out.print("Kimya Notunuzu Giriniz: ");
		kim = input.nextInt();
		
		System.out.print("T�rk�e Notunuzu Giriniz: ");
		tur = input.nextInt();
		
		System.out.print("Tarih Notunuzu Giriniz: ");
		tar = input.nextInt();
		
		System.out.print("M�zik Notunuzu Giriniz: ");
		muz = input.nextInt();
		
		input.close();
		
		int toplam = mat + fiz + kim + tur + tar + muz;
		double ortalama = toplam / 6.0;
		
		String durum = (ortalama >= 60) ? "S�n�f� Ge�tiniz." : "S�n�fta Kald�n�z.";
		System.out.print("Ortalamaniz: ");
		System.out.println(ortalama);
		System.out.println(durum);
	}

}
