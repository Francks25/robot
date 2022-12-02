package devoir;

public class LeMain {
	
	public static void deux2Dix(int n) {
		int e=n ; int c, b=0, d=1;
		while(e!=0) {
			c=e%10;
			b=b+c*d;
			d=d*2;
			e=e/10;			
		}
		System.out.println("le nombre est : "+b);
	}

	/*
	public static int factoriel(int a) {
		int b;
		if(a==0) return 1;
		else {
			b=a*factoriel(a-1);
			return b;	
		}
	}

*/
	public static void main(String[] args) {
		System.out.println("Bonjour entrer un entier positif svp");
		deux2Dix(10111010);
		//System.out.println("Le factoriel = "+factoriel(10));
		
		//deux2Dix(1111111111 );
}}
