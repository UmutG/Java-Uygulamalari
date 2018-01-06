package ornekler;
import java.util.Scanner;
public class Örnek35 {
	public static void main(String[] args) {
		//Klavyeden girlen bir sayının kaç basamaklı olduğunu hesaplayan program
		Scanner tara = new Scanner(System.in);
		System.out.print("Sayınızı giriniz: ");
		int sayi = tara.nextInt();
		tara.close();
		int basamak = Integer.toString(sayi).length();
		if(String.valueOf(sayi).charAt(0) == '-')
			basamak-=1;
		System.out.println("Sayınız " + basamak + " basamaklıdır.");
	}
}
