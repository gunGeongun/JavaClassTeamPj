package seotda;

import java.util.Random;
public class Shuffle {
	final public static int CardSize = 20; 
	
	public static void cardShuffle(int array[]) {
	        Random rd = new Random();
	        for (int i = array.length-1; i > 0; i--) {
	            int j = rd.nextInt(array.length);
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    
	}
	
	
	public static void main(String[] args) {

	}

}
