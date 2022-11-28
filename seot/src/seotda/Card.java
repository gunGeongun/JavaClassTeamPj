package seotda;

import java.util.Arrays;
public class Card {
	final public static int[] card  = {1,2,3,4,5,6,7,8,9,10,11,2,33,44,5,6,77,88,99,10};
	int num;
	public Card() {
		this(0);
	}
	public Card(int num) {
		this.num = num;
	}
	int getValue() {
		return card[num];
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(card));
		
	

	}

}
