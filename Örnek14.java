package ornekler;
public class �rnek14 {
	public static void main(String[] args) {
		//1 ile 100 aras�ndaki say�lar�n pozitif tam b�lenlerini bulan program
		for(int i=1; i<=100; i++)
		{
			System.out.println(i + " rakam�n�n/\nsay�s�n�n b�lenleri:\n--------------------");
			for(int j=1; j<=100; j++)
			{
				if(i%j==0)
					System.out.println(j);
			}System.out.println("--------------------");
		}
	}
}