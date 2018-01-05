package ornekler;
import java.util.Scanner;
public class Örnek10 {
	public static void main(String[] args) {
		{
			Scanner tara = new Scanner(System.in);
			String ad, soyad;
			System.out.print("Adýnýzý giriniz: ");
			ad = tara.next();
			System.out.print("Soyadýnýzý giriniz: ");
			soyad = tara.next();
			tara.close();
			System.out.print("Baþ harfleri: " + ad.charAt(0) + soyad.charAt(0));
		}
	}
}
