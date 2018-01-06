package ornekler;
public class Örnek20 {
	public static void ayirt(int[] data){
		System.out.println("Tek sayılar:");
		for(int i=0; i<data.length; i++)
			if(data[i]%2!=0)
				System.out.println(data[i]);
		System.out.println("------------\nÇift sayılar:");
		for(int i=0; i<data.length; i++)
			if(data[i]%2==0)
				System.out.println(data[i]);	
	}
	public static void main(String[] args) {
		//int türden bir dizinin elemanlarını tekler ve çiftler olmak üzere ayrı ayrı yazan program
		int [] dizi = {10,15,12,13,14,41,100};
		ayirt(dizi);	
	}
}
