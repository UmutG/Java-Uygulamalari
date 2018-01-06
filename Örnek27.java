package ornekler;
import java.util.Random;
public class Örnek27 {
	public static void main(String[] args) {
		//Rastgele üretilen 150-350 arasındaki sayılardan tek ve çift olanların sayısını bulan program
		Random rast = new Random();
		int tek=0, cift=0;
		System.out.println("Rastgele atılan sayılar:");
		for(int i=1; i<=10; i++)
		{
			int a = rast.nextInt(350-150) + 150;
			if(a%2==0)
				cift++;
			else
				tek++;
			System.out.println(a);
		}
		System.out.println("Çift olanların sayısı: " + cift);
		System.out.println("Tek olanların sayısı: " + tek);
	}
}
