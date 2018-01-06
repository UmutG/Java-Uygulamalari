package ornekler;
import java.util.Arrays;
import java.util.Scanner;
public class Örnek36 {
	public static void main(String[] args) {
		//Klavyeden girlen 10 tam sayıyı bir diziye atayan ve dizinin 
		//en büyük elemanı ile en küçük elemanın toplamanı ekrana yazan program
		Scanner tara = new Scanner(System.in);
		int [] sayi = new int[10];
		for(int i=0; i<10; i++)
		{
			System.out.print((i+1) + ". sayınızı giriniz: ");
			sayi[i] = tara.nextInt();
		}
		tara.close();
		Arrays.sort(sayi);
		System.out.println("En küçük sayı ile en büyük sayının toplamı: " + (sayi[0] + sayi[9]));
	}

}
