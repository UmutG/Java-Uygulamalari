package ornekler;
public class Örnek14 {
	public static void main(String[] args) {
		//1 ile 100 arasýndaki sayýlarýn pozitif tam bölenlerini bulan program
		for(int i=1; i<=100; i++)
		{
			System.out.println(i + " rakamýnýn/\nsayýsýnýn bölenleri:\n--------------------");
			for(int j=1; j<=100; j++)
			{
				if(i%j==0)
					System.out.println(j);
			}System.out.println("--------------------");
		}
	}
}