package ornekler;

public class �rnek13 {
	public static void main(String[] args) {
		//1-1000 aras�ndaki asal say�lar� bulan program
		int sayi;
        for(int i=2; i<=1000; i++)
        {
            sayi=0;
            for(int j=2; j<=i/2; j++)
            {
                if(i%j==0) 
                	sayi++;
            }
            if(sayi==0)
            	System.out.println(i);
        }
	}
}
