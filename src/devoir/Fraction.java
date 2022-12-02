package devoir;

public class Fraction {
	 
	private int num, den;
	public Fraction() {
		this.num=0;
		this.den=1;
	}
	
	public Fraction(int a, int b) throws ErrdenException{
		
		this.num=a;
		if(b==0){throw new ErrdenException();}
		else this.den=b;
		
	}
	
	public Fraction(Fraction F) {
		this.num=F.num;
		this.den=F.den;
	}
	
	public void setnum(int n) {num=n;	}
	public void setden(int d) throws ErrdenException{
		if(d==0) {throw new ErrdenException();}
		else den=d;	}
	public int getnum() {return num;}
	public int getden() {return den;}
	public void affiche() {
		System.out.println("Je suis une fraction, ma valeur est : ("+num/this.Simplifier()+ "/"+den/this.Simplifier()+") ");
	}
	public Fraction Add(Fraction F2) {
		Fraction F= new Fraction();
		F.num=(this.num*F2.den +F2.num*this.den);
		F.den=(this.den*F2.den);
		F.num/=F.Simplifier();
		F.den/=F.Simplifier();
		return F;
	}
	public Fraction Dif(Fraction F2) {
		Fraction F= new Fraction();
		F.num=(this.num*F2.den -F2.num*this.den);
		F.den=(this.den*F2.den);
		F.num/=F.Simplifier();
		F.den/=F.Simplifier();
		return F;
	}
	public Fraction Pro( Fraction F2) {
		Fraction F= new Fraction();
		F.num=(this.num*F2.num);
		F.den=(this.den*F2.den);
		F.num/=F.Simplifier();
		F.den/=F.Simplifier();
		return F;
	}
	public Fraction Div(Fraction F2) {
		Fraction F= new Fraction();
		//if()
		F.num=(this.num*F2.den);
		F.den=(this.den*F2.num);
		F.num/=F.Simplifier();
		F.den/=F.Simplifier();
		return F;
	}
	public int Simplifier() {
		int c;
		int a=this.num;
		int b=this.den;
		while(a!=0) {
		if(a>=b){ a-=b;}
		else { 
			c=a;
			a=b;
			b=c;
			a-=b;
		}	
		}
		return b;	
	}
}
	

	
