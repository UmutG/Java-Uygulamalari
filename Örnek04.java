package ornekler;
import java.util.Scanner;
public class �rnek04 {
	public static void main(String[] args) {
		int sayi, yuzler, onlar, birler;
		Scanner tara = new Scanner(System.in);
			do {
				sayi=0;
				System.out.print("3 basamakl� say�y� giriniz: ");
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
