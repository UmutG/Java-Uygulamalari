package ornekler;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Örnek37 {
	public static void main(String[] args) throws IOException{
		//Klasörde bulunan .txt uzantılı dosyayı okuyan program
		//Dosyanızın UTF-8 ile kaydedildiğinden emin olun.
		Scanner tara = new Scanner(System.in);
		System.out.print("Dosyanın adını giriniz: ");
		String ad = tara.nextLine(), satir;
		tara.close();
		ad = ad+".txt";
		try
		{
			BufferedReader oku = new BufferedReader(new FileReader(ad));
			satir = oku.readLine();
			while(satir!=null)
			{
				System.out.println(satir);
				satir = oku.readLine();	
			}oku.close();
		}
		catch(IOException iox)
		{
			System.out.print("Dosya adı geçersiz.");
		}	
	}
}