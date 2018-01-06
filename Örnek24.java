package ornekler;
import java.util.Scanner;
public class Örnek24 {
	public static void main(String[] args) {
		//Klavyeden girilen int türden bir değeri ekrana ikilik sayı sisteminde yazdırabilen program
		Scanner tara = new Scanner(System.in);
		int sayi;
		String binary;
		System.out.print("Sayınızı giriniz: ");
		sayi = tara.nextInt();
		binary = Integer.toBinaryString(sayi);
		System.out.println("İkilik sistemdeki hali: " + binary);
		tara.close();
	}
}
