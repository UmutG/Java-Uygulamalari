package ornekler;
import java.util.Scanner;
public class Örnek40 {
	public static void main(String[] args)
	//Ödevin %25'i, vizenin %35'i ve finalin %40'ını alan, ortalamayı veren program
	{
		int odev, vize, fnl;
		double ort;
		Scanner tara = new Scanner(System.in);
		System.out.print("Ödevden aldığınız not: ");
		odev = tara.nextInt();
		System.out.print("Vizeden aldığınız not: ");
		vize = tara.nextInt();
		System.out.print("Finalden aldığınız not: ");
		fnl = tara.nextInt();
		ort = ((odev*0.25)+(vize*0.35)+(fnl*0.40));
		tara.close();
		System.out.print("Ortalamanız = " + ort);
	}

}
