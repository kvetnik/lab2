package lab1;
public class MainClass{
    public static void main(final String[] args){
        Fraction a = new Fraction(1,2);
        Fraction b = new Fraction(1,4);
        System.out.println(a.toString());
        System.out.println(b.toString());

        System.out.print("a + b = ");
        System.out.println(Fraction.sum(a, b).toString());  
        
    }
        
}