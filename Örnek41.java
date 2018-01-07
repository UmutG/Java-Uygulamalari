package ornekler;
import java.util.Scanner;
public class Örnek41 {
	public static void main(String[] args) {
		//Girilen sayının tersini yazan program
		Scanner tara = new Scanner(System.in);
		System.out.print("Sayınızı giriniz: ");
		int sayi = tara.nextInt();
		tara.close();
		int ters = 0, gec = 0;
        while(sayi > 0){
        	gec = sayi%10;
        	ters = ters * 10 + gec;
            sayi = sayi/10;
        }
        System.out.print("Sayınızın tersi: " + ters);
	}
}
