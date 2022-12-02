package devoir;
import java.lang.Exception;
import java.util.Scanner;

import devoir.ErrdenException;

public class AffichageFraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S=new Scanner(System.in);
		try {
			Fraction F= new Fraction();
			
			System.out.println("Veuillez entrer un numerateur svp");
			int a=S.nextInt();
			System.out.println("Veuillez entrer un dénominateur svp");
			int b=S.nextInt();
			Fraction F1= new Fraction(a,b);
			F1.affiche();
			/*Fraction F2= new Fraction(3,6);	
			F=F1.Add(F2);
			F.affiche();*/
	}
		catch(ErrdenException E)
		{
			System.out.println("navre le denominateur doit etre Non NUL");
			System.exit(-1);}
		}

}
