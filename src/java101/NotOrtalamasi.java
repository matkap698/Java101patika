package java101;
import java.util.Scanner;

/*
6 dersin not ortalamasýný hesaplayan ve buna göre 
sýnýfýn geçilip geçilemediðini belirleyen Java programý
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
		
		System.out.print("Türkçe Notunuzu Giriniz: ");
		tur = input.nextInt();
		
		System.out.print("Tarih Notunuzu Giriniz: ");
		tar = input.nextInt();
		
		System.out.print("Müzik Notunuzu Giriniz: ");
		muz = input.nextInt();
		
		input.close();
		
		int toplam = mat + fiz + kim + tur + tar + muz;
		double ortalama = toplam / 6.0;
		
		String durum = (ortalama >= 60) ? "Sýnýfý Geçtiniz." : "Sýnýfta Kaldýnýz.";
		System.out.print("Ortalamaniz: ");
		System.out.println(ortalama);
		System.out.println(durum);
	}

}
