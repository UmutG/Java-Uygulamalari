package ornekler;
import java.util.Scanner;
public class Örnek04 {
	public static void main(String[] args) {
		//Klavyeden girilen üç basamaklı sayının rakamları çarpımının, rakamları toplamına bölümünden kalanı bulan program
		//Negatif hesaplamasını daha sonra ekleyeceğim
		int sayi, yuzler, onlar, birler;
		Scanner tara = new Scanner(System.in);
			do {
				sayi=0;
				System.out.print("3 basamaklı sayıyı giriniz: ");
				sayi = tara.nextInt();
			}
			while(String.valueOf(sayi).length() != 3);
			tara.close();
			yuzler = sayi/100;
			onlar = (sayi-yuzler*100)/10;
			birler = (sayi-(yuzler*100)-onlar*10);
			int carpim = yuzler*onlar*birler, toplam = yuzler+onlar+birler;
			System.out.print("Kalan = " + (carpim%toplam));
	}

}
