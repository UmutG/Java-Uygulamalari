package ornekler;
import java.util.Scanner;
public class �rnek02 {
	public static boolean sayimi(String s) {
		    return s.matches("[-+]?\\d*\\.?\\d+");
		}
	public static void main(String[] args) {
		//Klavyeden "Dur" yaz�lmad��� s�rece girilen say�lar� toplayan program (WORK IN PROGRESS)
		Scanner tara = new Scanner(System.in);
		int i=0, top=0;
		String dur = null;
		do
		{
			dur = null;
			System.out.print("Say�y� giriniz: ");
			dur = tara.nextLine();
			if(sayimi(dur)==false);
			{
				i = Integer.parseInt(dur);
			}
			top += i;
		}
		while(dur!="Dur");
		tara.close();
		System.out.print("Toplam = " + top);
	}
}
