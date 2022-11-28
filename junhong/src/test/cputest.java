package test;
import CPUai.*;
import play.*;

public class cputest {
	public static void main(String[] args) {
		CPUstate Cstate = new CPUstate();
		Cstate.setCPUMoney();
		int[] his = {3, 2, 3};
		CPUbet Cbet = new CPUbet();
		int CPUmoney = Cbet.CPUplay(Cstate.getCPUMoney(), 1, 1, 100, 300, his);
		System.out.println(CPUmoney);
	}
}
