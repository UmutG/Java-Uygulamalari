package ornekler;
import java.util.Scanner;
public class Örnek04 {
	public static void main(String[] args) {
		//Klavyeden girilen üç basamaklı sayının rakamları çarpımının, rakamları toplamına bölümünden kalanı bulan program
		int sayi, yuzler, onlar, birler;
		Scanner tara = new Scanner(System.in);
		System.out.print("3 basamaklı sayıyı giriniz: ");
		sayi = tara.nextInt();
		tara.close();
		yuzler = sayi/100;
		onlar = (sayi-yuzler*100)/10;
		birler = (sayi-(yuzler*100)-onlar*10);
		int carpim = yuzler*onlar*birler, toplam = yuzler+onlar+birler;
		System.out.print("Kalan = " + (carpim%toplam));
	}

}
