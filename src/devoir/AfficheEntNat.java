package devoir;

import java.util.Scanner;

import devoir.ErrConstException;

public class AfficheEntNat {
	public static void main(String args[])
	{
		Scanner S =new Scanner(System.in);
		try {
			System.out.println("Veuillez entrer un nombre positif ou null svp");
			int a=S.nextInt();
			EntNat E= new EntNat(a);
			System.out.println("Le nombre saisi est"+ E.getN());	
		}
		catch(ErrConstException C)
		{
			System.out.println("ERREUR DE CONSTRUCTION");
			System.exit(-1);
		}
	}
}
