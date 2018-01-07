package ornekler;
import java.util.Random;
import java.util.Scanner;
public class Örnek22 {
	public static void main(String[] args)
	//1'den 100'e kadar 10 haklı sayı tahmin oyunu (kullanıcı bilgilendirilir)
	{
		Random a = new Random();
		int rast = a.nextInt(100);
		Scanner tara = new Scanner(System.in);
		for (int i=10; i>=0; i--)
		{
			System.out.print("Tahmininizi giriniz: ");
			int tahmin = tara.nextInt();
			if(tahmin == rast)
			{
				System.out.print("Tahmininiz doğru. Tutulan sayı = " + rast);
				break;
			}
			else if(i==0)
				System.out.println("Tahmin hakkınız bitti. Tutulan sayı: " + rast);
			else if(tahmin>rast)
				System.out.println("Tahminin sayıdan büyük. Sayıyı düşür.");
			else if(tahmin<rast)
				System.out.println("Tahminin sayıdan küçük. Sayıyı yükselt.");
		}
		tara.close();
	}
}
