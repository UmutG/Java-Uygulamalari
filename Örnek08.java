package ornekler;
public class Örnek08 {
	public static void main(String[] args){
		// "*" ile baklava dilimini çýkartan program
		for(int i=0;i<5;i++) {
	        for(int j=1;j<5-i;j++) {
	             System.out.print(" ");
	         }
	        for(int k=0;k<=i;k++) {
	            System.out.print("* ");
	        }
	        System.out.println(); 
	        }
		for(int l=4; l>=0; l--)
		{
			for(int m=1; m<5-l; m++)
			{
				System.out.print(" ");
			}
			for(int n=1; n<=l; n++)
			{
				System.out.print(" *");
			}
			System.out.println(" ");
		}
	}
}
