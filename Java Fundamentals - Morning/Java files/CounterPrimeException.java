import java.math.*;

class PrimeException extends Exception {
	private int number;

	PrimeException(int a) {
		number = a;
	}
	public String toString() {
		return "Exception, the numberis prime.The number is " + number;
	}
}


class CounterPrimeException {
	static boolean isPrime(int n) 
    { 	int end_index;
        if (n <= 1) 
            return false; 

  		end_index = (int) Math.sqrt(n) + 1;
        for (int i = 2; i <= end_index; i++) 
            if (n % i == 0){ 
                return false; 
  			}
        return true; 
    }

	static void checkIfPrime(int counter) throws PrimeException {
		System.out.print("Cheking if the number " + counter + " is prime or non prime - ");
		if(isPrime(counter))
			throw new PrimeException(counter);
		System.out.println("Not a Prime Number");
	}

	public static void main(String args[]) {
		for(int counter=1; counter<=100; counter++){
			try {
					checkIfPrime(counter);
				}
			catch (PrimeException e) {
				System.out.println("Caught " + e);
			}
		}
	}
}