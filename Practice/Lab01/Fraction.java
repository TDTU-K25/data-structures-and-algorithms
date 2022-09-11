public class Fraction {
    private int numer;
    private int denom;

    public Fraction() {
        this(0, 1);
    }

    public Fraction(int x, int y) {
        numer = x;
        denom = y;
    }

    public Fraction(Fraction f) {
        this.numer = f.numer;
        this.denom = f.denom;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numer, denom);
    }

    public boolean equals(Object f) {
        if (f instanceof Fraction) {
            Fraction temp = (Fraction) f;
            return (this.numer == temp.numer && this.denom == temp.denom);
        } else {
            return false;
        }
    }
}