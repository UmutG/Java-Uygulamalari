package ornekler;
public class Örnek06 {
	public static void main(String[] args) {
		/*1’den 1000’e kadar olan sayılar içerisinde 5’e tam bölunebilen aynı zamanda 7’ye tam bölünemeyen sayıları sayan, 
		toplamlarını hesaplayan ve bu sayıları listeleyen bir program*/
		
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
		System.out.println("Toplam = " + top + ". Beşe tam bölünenler = " + bes + " tane. Yediye tam bölünemeyenler = " + yedi + " tane. \n"
				+ "Beşe tam bölünüp yediye tam bölünemeyenlerin sayısı: " + ikisi);
	}
}
