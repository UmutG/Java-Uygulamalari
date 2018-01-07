package ornekler;
import java.util.Random;
public class Örnek42 {
	public static void main(String[] args) {
		//Rastgele üretilen 1-999 arasındaki 10 sayının en büyüğünü ve en küçüğünü bulan program
		int ek=Integer.MAX_VALUE, eb=0;
		Random rast = new Random();
		for (int i=1; i<=10; i++)
		{
			int a = rast.nextInt(999);
			System.out.println(i + ". sayı: " + a);
			if(a>=eb)
				eb=a;
			if(a<=ek)
				ek=a;
		}
			System.out.println(ek + " en küçük sayıdır.");
			System.out.print(eb + " en büyük sayıdır.");
	}
}
