package ornekler;
public class Örnek32 {
	public static void main(String[] args) {
		//2 basamaklı birbirinden farklı 3 asal sayının toplamı şeklinde ifade edilebilecek sayının içindeki
		//en büyük ve en küçük asal sayıları bulan program
		int a=11, b=13, c=17, top=a+b+c, say, max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
		for(int i=2; i<=top; i++)
		{
			say=0;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
					say++;
			}
			if(say==0)
				System.out.println(i);
			if(i<min)
				min=i;
			if(i>max)
				max=i;
		}
		System.out.println("Minimum sayı: " + min + ". Maksimum sayı: " + max);
		
	}
}