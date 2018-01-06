package ornekler;
import java.util.Arrays;
import java.util.Scanner;
public class Örnek31 {

	public static void main(String[] args) {
		//Klavyeden girilen 10 sayıdan en büyüğünü ve en küçüğünü bulan program
		Scanner tara = new Scanner(System.in);
		int [] sayi = new int[10];
		for(int i=0; i<10; i++)
		{
			System.out.print((i+1) + ". sayınızı giriniz: ");
			sayi[i] = tara.nextInt();
		}
		tara.close();
		Arrays.sort(sayi);
		System.out.println("En küçük sayı: " + sayi[0] + ". En büyük sayı: " + sayi[9]);
	}

}
