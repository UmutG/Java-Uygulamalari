package ornekler;
public class �rnek06 {
	public static void main(String[] args) {
		int top=0, bes=0, yedi=0, ikisi=0;
		for(int i=1; i<=1000; i++)
		{
			if(i%5==0)
				bes++;
			if(i%7!=0)
				yedi++;
			if(i%5==0 && i%7!=0)
			{
				ikisi++;
				System.out.println(i + "\n" + "----");
				top+=i;
			}
		}
		System.out.println("Toplam = " + top + ". Be�e tam b�l�nenler = " + bes + " tane. Yediye tam b�l�nemeyenler = " + yedi + " tane. \n"
				+ "Be�e tam b�l�n�p yediye tam b�l�nemeyenlerin say�s�: " + ikisi);
	}
}