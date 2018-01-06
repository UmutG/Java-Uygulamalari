package ornekler;
import java.util.Arrays;
import java.util.Scanner;
public class Örnek26 {
	public static void main(String[] args) {
		//Klavyeden girilen tamsayı değerlerin, toplam sayısını, en büyüğünü, en küçüğünü ve ortalamasını hesaplayan program
		Scanner tara = new Scanner(System.in);
		int sayi, top=0;
		System.out.print("Kaç adet sayı gireceksiniz: ");
		sayi = tara.nextInt();
		int [] sayilar = new int[sayi];
		for(int i=0; i<sayi; i++)
		{
			System.out.print((i+1) + ". sayınızı giriniz: ");
			sayilar[i] = tara.nextInt();
			top += sayilar[i];
		}
		Arrays.sort(sayilar);
		System.out.println("Toplam: " + top + ". En büyük sayı: " + sayilar[sayi-1] + 
				". En küçük sayı: " + sayilar[0] + ". Ortalama: " + (double)top/sayi);
		tara.close();
		}
}
