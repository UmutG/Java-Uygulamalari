package ornekler;
public class Örnek03 {
	public static void main(String[] args)
	{
		int top=0;
		for(int i=45; i<=225; i++)
		{
			if(i%2==0 && i%7==0)
				top += i;
		}
		System.out.print("Toplam = " + top);
	}
}
