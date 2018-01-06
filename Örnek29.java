package ornekler;
import java.util.Arrays;
import java.util.Scanner;
public class Örnek29 {
	public static void main(String[] args) {
		//Klavyeden alınan int türden üç sayı arasındaki büyüklük - küçüklük ilişkisini
		//küçükten büyüğe doğru < ve = simgeleriyle gösteren program
		Scanner tara = new Scanner(System.in);
		int [] sayi = new int[3];
		int i=3;
		while (i!=0)
		{
			System.out.print((4-i) + ". sayıyı giriniz: ");
			sayi[3-i] = tara.nextInt();
			i--;
		}
		Arrays.sort(sayi);
		if(sayi[0]==sayi[1] && sayi[1]==sayi[2])
			System.out.println(sayi[0] + "=" + sayi[1] + "=" + sayi[2]);
		else if (sayi[0]==sayi[1] && sayi[1]!=sayi[2])
			System.out.println(sayi[0] + "=" + sayi[1] + "<" + sayi[2]);
		else if (sayi[0]!=sayi[1] && sayi[1]==sayi[2])
			System.out.println(sayi[0] + "<" + sayi[1] + "=" + sayi[2]);
		else
			System.out.println(sayi[0] + "<" + sayi[1] + "<" + sayi[2]);
			tara.close();
	}
}