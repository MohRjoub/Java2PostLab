

class Complex  implements Comparable<Complex>,Cloneable{

   private double a;
   private double b;


    public Complex() {
    	this.a = 0;
        this.b = 0;
    }
    
    public Complex(double a) {

        this.a = a;
        this.b = 0;
    }
    
    public Complex(double a, double b) {

        this.a = a;
        this.b = b;
    }


    public double getRealPart() {
		return a;
	}

	public double getImaginaryPart() {
		return b;
	}

	
	public String toString() {
    	if(b==0)
    		return String.valueOf(a);
        return String.format("%.2f + %.2fi", a, b);
    }


    public Complex add(Complex other) {
        return new Complex(this.a + other.a, this.b + other.b);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.a - other.a, this.b - other.b);
    }

    public Complex multiply(Complex other) {
        return new Complex(this.a * other.a - this.b * other.b, this.a * other.b + this.b * other.a);
    }

    public Complex divide(Complex other) {
    
        if (other.a == 0 && other.b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        } else {
            return new Complex((this.a * other.a + this.b * other.b) / (other.a * other.a + other.b * other.b), 
            		(this.b * other.a - this.a * other.b) / (other.a * other.a + other.b * other.b));
        }
    }
    public double abs() {
		return Math.sqrt(this.a * this.a + this.b * this.b);
    	
    }

	@Override
	public int compareTo(Complex o) {
		return (int) (this.abs()-o.abs());
	}
	
	@Override
	 public Complex clone() {
       
        try {
            Complex copy = (Complex) super.clone();
            copy.a = this.a;
            copy.a = this.a;
            return copy;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
        
    }

	@Override
	public boolean equals(Object obj) {
		Complex other = (Complex) obj;
		return Double.doubleToLongBits(a) == Double.doubleToLongBits(other.a)
				&& Double.doubleToLongBits(b) == Double.doubleToLongBits(other.b);
	}
	
	
	
	
	
	
}
