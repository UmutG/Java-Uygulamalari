package ornekler;
import java.util.Scanner;
public class Örnek02 {
	public static void main(String[] args) {
		//Klavyeden "Dur" yazılmadığı sürece girilen sayıları toplayan program (WORK IN PROGRESS)
		Scanner tara = new Scanner(System.in);
		int i=0, top=0;
		String dur;
		do
		{
			System.out.print("Sayıyı giriniz (toplamı göstermek için 'Dur' yazınız): ");
			dur = tara.next();
			if(dur.equals("Dur"))
				break;
			else
				i = Integer.parseInt(dur);
			top += i;
		}
		while(top!=Integer.MAX_VALUE);
		tara.close();
		System.out.print("Toplam = " + top);
	}
}
