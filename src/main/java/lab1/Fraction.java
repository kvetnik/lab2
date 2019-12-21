package lab1;

public class Fraction {
    private int n,d;
    public Fraction(){}
    //f
    /** 
     * Create a new Fraction with specified numeration and denomimator
     * @param n
     * @param d
     * @return 
     */
    public Fraction(int n, int d){
        if (d == 0) {
            throw new IllegalArgumentException("Can't be divided by zero");
        }else{
             this.n = n;
             this.d = d;
        }
    }
    private static int gcd(int a,int b) {
        int x = Math.abs(a);
        int y = Math.abs(b);
        while(x!=y && x>0 && y>0){
            while(x>y){
                x-= y;
            }
            while(x<y){
                y-= x;
            }
        }
        return x;
    }
    private static Fraction reduce(Fraction a){
        int temp = gcd(a.n, a.d);
        a.n /= temp;
        a.d /= temp;
        return a;
    }
    public static Fraction sum(Fraction a, Fraction b){
        int rezN = a.n * b.d + b.n * a.d;
        int rezD = a.d * b.d;
        Fraction c = reduce(new Fraction(rezN, rezD));
        return c;
    }

    public static Fraction multiply(Fraction a, Fraction b){
        int rezN = a.n * b.n;
        int rezD = a.d * b.d;
        Fraction c = reduce(new Fraction(rezN,rezD));
        return c;
    }

    public static Fraction division(Fraction a, Fraction b){
        int rezN = a.n * b.d;
        int rezD = a.d * b.n;
        Fraction c = reduce(new Fraction(rezN,rezD));
        return c;
    }
}
