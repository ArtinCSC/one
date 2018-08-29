package one;

public class Fraction {
	private int num;
	private int den;
	
	Fraction (int n, int d)
	{
		num = n;
		den = d;
	}
	
	public Fraction add(Fraction f)
	{
		Fraction r = new Fraction(num, den);
		r. num = this.num * f.den + this.den * f.num;
		r.den = this.den * f.den;
		return r;
		
	}
public Fraction subs(Fraction f){
	Fraction r = new Fraction(num, den);
	r.num = this.num * f.den - this.den * f.num;
	r.den = this.den * f.den;
	return r;
}
public Fraction mult(Fraction f){
	Fraction r = new Fraction(num, den);
	r.num = this.num * f.num;
	r.den = this.den * f.den;
	return r;
}
public Fraction dvit(Fraction f){
	Fraction r = new Fraction(num, den);
	r.num = this.num * f.den;
	r.den = this.den * f.num;
	return r;
}
public String toString() {

	
	return (num + "/" + den);
}

}
