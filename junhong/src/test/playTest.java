package test;
import CPUai.*;
import play.*;
import seotda.*;
import Data.*;

public class playTest {
	public static void main(String[] args) {
		PlayerMoney playerMoney = new PlayerMoney();
		CPUstate ComMoney = new CPUstate();
		BettingMoney betMoney = new BettingMoney();
		CPUbet CPUBet = new CPUbet();
		final int cardSize = 2;
		int[] user = new int[cardSize];
		int[] com = new int[cardSize];
		
		Card deck = new Card();
		Shuffle shuf = new Shuffle();
		cardScore score = new cardScore();
		CardDivision cardDiv = new CardDivision();
		winner result = new winner();
		int[] shuffleDeck = deck.card;
		shuf.cardShuffle(shuffleDeck);
		cardDiv.Div(shuffleDeck, user, com); //ī�� �й�
		String userScore = score.Score(user); // �÷��̾� ī�� ���� Ȯ��
		String comScore = score.Score(com); //��ǻ�� ī�� ���� Ȯ��
		int userScorePrize = score.scorePrize(userScore); // �÷��̾� ���� ��
		int comScorePrize = score.scorePrize(comScore); //��ǻ�� ���� ��
		String gameResult = result.result(userScorePrize,comScorePrize); // ���� ���
		
		while(betMoney.getCycle() != 3) {
			while(betMoney.getCall() != 2) {
				int exBettedMoney = 500;
				if(betMoney.getHis() == 0) {
					int CPUMoney = CPUBet.CPUplay(ComMoney.getCPUMoney(), betMoney.getCycle(), comScorePrize, exBettedMoney, betMoney.getMoney(), bethistory)
				}
			}
		}
	}
}
