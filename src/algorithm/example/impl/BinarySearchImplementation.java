package algorithm.example.impl;

/**
 * @author prashant.ameta
 *
 */
public class BinarySearchImplementation {

	boolean targetFound=false;

	public static void main(String[] args) {
		
		int[] arrayOfNumbers = {1,2,3,4,5,6, 7,8,9,10, 11,12, 13,14,15,16, 17,18, 19,20,21,22, 23,24,25,26,27,28, 29,30, 31,32,33,34,35,36, 37,38,39, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

		BinarySearchImplementation binarySearch = new BinarySearchImplementation();
		int i = binarySearch.findTheCorrectGuess(arrayOfNumbers,11);
		System.out.println("The expected Number is "+i);

	}


	/**
	 * @param arrayOfNumbers
	 * @param i
	 * @return
	 */
	private int findTheCorrectGuess(int[] arrayOfNumbers, int i) {
		/*
		 * min is the index for first element in Array
		 *
		 * */
		int min =0;

		/*
		 * max is the index for last element in Array
		 *
		 * */
		int max= arrayOfNumbers.length-1;

		/*
		 * while expected number is not found
		 * */
		while(!targetFound){

			/* 
			 * If max < min, then stop: target is not present in array. Return -1.
			 * 
			 * */
			if(max < min ){
				System.out.println("Number not present");
				return -1;
			}

			/* 
			 * Compute guess as the average of max and min, rounded down (so that it is an integer).
			 * 
			 * */
			int guess= Math.abs((min+max)/2);

			/*
			 * If array[guess] equals target, then stop. You found it! Return guess
			 * 
			 * */
			if(arrayOfNumbers[guess] == i){
				targetFound = true;
				System.out.println("Number Guessed is "+ arrayOfNumbers[guess] +" which must be equal to "+i);
				return i;
			}
			/*
			 * If the guess was too high, that is, array[guess] > target, then set max=guess-1.
			 * 
			 * */
			else if(arrayOfNumbers[guess] > i){
				max=guess-1;
			}
			/*
			 * If the guess was too low, that is, array[guess] < target, then set min= guess+1.
			 * 
			 * */
			else{
				min= guess+1;
			}
		}
		return 0;
	}
}
