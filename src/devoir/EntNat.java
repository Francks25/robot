package devoir;
import java.util.Scanner;
public class EntNat {
	
	private int n;
	
	public EntNat(int a) throws ErrConstException {
		if(a<0) {
			throw new ErrConstException();
		}
		else this.n=a;
	}
	public int getN() {return n;}

}
