package ornekler;
import java.util.Scanner;
public class Örnek18 {
	public static void main(String[] args) {
		//Klavyeden girilen Celcius sıcaklık değerini Fahrenheit'a çeviren program
		Scanner tara = new Scanner(System.in);
		System.out.print("Sıcaklık değerini giriniz (ondalıklıysa ',' ile ayırınız): ");
		double cel = tara.nextDouble();
		double fah = (cel*1.8)+32;
		tara.close();
		System.out.println(cel + " ℃ = " + fah + "℉");
	}
}
