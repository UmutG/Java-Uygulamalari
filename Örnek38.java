package ornekler;
import java.io.*;
import java.util.Scanner;
public class Örnek38{
	public static void main(String[] args) throws IOException{
		//Klasörde bulunan .txt uzantılı dosyayının istenilen satırını okuyan program
		//Dosyanızın UTF-8 ile kaydedildiğinden emin olun.
		Scanner tara = new Scanner(System.in);
		System.out.print("Dosyanızın adını giriniz: ");
		String ad = tara.nextLine();
		File file = new File(ad + ".txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(file));
        int i=0;
        System.out.print("Kaçıncı satır okutulsun? ");
        int a = tara.nextInt();
        tara.close();
        String satir = reader.readLine();
            while (satir!=null) 
            {
            	i++;
            	if(i==a)
                {
            		System.out.println(satir);
            		
                }satir = reader.readLine();
            }
            reader.close();
	}
}
