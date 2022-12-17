package test;
import CPUai.*;
import Data.CPUstate;
import seotda.*;
import play.*;

public class cputest {
	public static void main(String[] args) {
		for (int i = 0; i<5 ; i++) {
			if(i == 3) {
				System.out.println(i);
				continue;
			}else {
				System.out.println(i+1);
			}
			System.out.println(i);
		}
	}
}
