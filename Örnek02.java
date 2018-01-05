package ornekler;
import java.util.Scanner;
public class Örnek02 {
	public static boolean sayimi(String s) {
		    return s.matches("[-+]?\\d*\\.?\\d+");
		}
	public static void main(String[] args) {
		//Klavyeden "Dur" yazýlmadýðý sürece girilen sayýlarý toplayan program (WORK IN PROGRESS)
		Scanner tara = new Scanner(System.in);
		int i=0, top=0;
		String dur = null;
		do
		{
			dur = null;
			System.out.print("Sayýyý giriniz: ");
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
