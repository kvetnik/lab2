package lab1;
public class Polynomial extends FractionsArray {
    public Polynomial(final Fraction a, final Fraction b){
        super(a,b);
    }

    public Fraction x(final Fraction x, final Fraction y){
         final Fraction ax = Fraction.multiply(x, this.arrays.get(0));
         final Fraction by = Fraction.multiply(y, this.arrays.get(1));
         return Fraction.sum(ax, by);
    }
}
