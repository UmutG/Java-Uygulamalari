package ornekler;
import java.util.Scanner;
public class �rnek10 {
	public static void main(String[] args) {
		{
			Scanner tara = new Scanner(System.in);
			String ad, soyad;
			System.out.print("Ad�n�z� giriniz: ");
			ad = tara.next();
			System.out.print("Soyad�n�z� giriniz: ");
			soyad = tara.next();
			tara.close();
			System.out.print("Ba� harfleri: " + ad.charAt(0) + soyad.charAt(0));
		}
	}
}
