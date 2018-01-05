package ornekler;
public class Örnek03 {
	public static void main(String[] args)
	{
		//45 ile 225 arasındaki çift ve 7'ye bölünebilen sayıların toplamını bulup sonucu ekranda gösteren program
		int top=0;
		for(int i=45; i<=225; i++)
		{
			if(i%2==0 && i%7==0)
				top += i;
		}
		System.out.print("Toplam = " + top);
	}
}
