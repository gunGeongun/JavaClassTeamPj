package play;
import play.Betting;

public class playersBetting {
	Betting bet = new Betting();
	public int playersBet(int choice, int playerMoney, int bettedMoney, int exbettedMoney) {
		if (choice == 3) {
			return bet.half(playerMoney, bettedMoney);
		}else if(choice == 2) {
			return bet.call(playerMoney, exbettedMoney);
		}else {
			return bet.die();
		}
	}
}
