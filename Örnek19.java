package ornekler;
public class Örnek19 {
	public static void bul(int[] data) {
		int sayi=data[0];
		for(int i=0; i<data.length; i++)
		{
			if(sayi<data[i])
				sayi=data[i];
		}
		System.out.println("En büyük sayı: " + sayi);
	}
	public static void main(String[] args) {
		//int türden bir dizinin en büyük elemanını bulup ekrana yazan programı
		int [] dizi = {12,99,14,15,16};
		bul(dizi);
	}

}
