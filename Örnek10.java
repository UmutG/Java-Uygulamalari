package ornekler;
import java.util.Scanner;
public class Örnek10 {
	public static void main(String[] args) {
		{
			//Adı ve soyadı girilen kişinin baş harflerini ekrana yazdıran program
			Scanner tara = new Scanner(System.in);
			String ad, soyad;
			System.out.print("Adınızı giriniz: ");
			ad = tara.next();
			System.out.print("Soyadınızı giriniz: ");
			soyad = tara.next();
			tara.close();
			System.out.print("Baş harfleri: " + ad.charAt(0) + soyad.charAt(0));
		}
	}
}
