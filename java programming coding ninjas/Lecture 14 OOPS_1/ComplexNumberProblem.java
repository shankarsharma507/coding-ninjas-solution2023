// A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).
// Implement the Complex numbers class that contains following functions -
// 1. constructor
// You need to create the appropriate constructor.
// 2. plus -
// This function adds two given complex numbers and updates the first complex number.
// e.g.
// if C1 = 4 + i5 and C2 = 3 +i1
// C1.plus(C2) results in: 
// C1 = 7 + i6 and C2 = 3 + i1
// 3. multiply -
// This function multiplies two given complex numbers and updates the first complex number.
// e.g.
// if C1 = 4 + i5 and C2 = 1 + i2
// C1.multiply(C2) results in: 
// C1 = -6 + i13 and C2 = 1 + i2
// 4. print -
// This function prints the given complex number in the following format :
// a + ib
// Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.

/******************
 * Following is the main function we are using internally.
 * Refer this for completing the ComplexNumbers class
 * 
 
 public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int real1 = s.nextInt();
		int imaginary1 = s.nextInt();

		int real2 = s.nextInt();
		int imaginary2 = s.nextInt();

		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		int choice = s.nextInt();
		 
		if(choice == 1) {
			// Add
			c1.plus(c2);
			c1.print();
		}
		else if(choice == 2) {
			// Multiply
			c1.multiply(c2);
			c1.print();
		}
		else {
			return;
		}
	}
 ******************/

public class ComplexNumbers {
	// Complete this class

    
     int real;
     int imaginary;

    public ComplexNumbers(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void plus(ComplexNumbers other) {
        this.real += other.real;
        this.imaginary += other.imaginary;
    }

    public void multiply(ComplexNumbers other) {
        int newReal = this.real * other.real - this.imaginary * other.imaginary;
        int newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        this.real = newReal;
        this.imaginary = newImaginary;
    }

    public void print() {
        if (this.imaginary >= 0) {
            System.out.println(this.real + " + i" + this.imaginary);
        } else {
            System.out.println(this.real + " - i" + (-this.imaginary));
        }
    }

	
}
