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
		cardDiv.Div(shuffleDeck, user, com); //카드 분배
		String userScore = score.Score(user); // 플레이어 카드 족보 확인
		String comScore = score.Score(com); //컴퓨터 카드 족보 확인
		int userScorePrize = score.scorePrize(userScore); // 플레이어 점수 값
		int comScorePrize = score.scorePrize(comScore); //컴퓨터 점수 값
		String gameResult = result.result(userScorePrize,comScorePrize); // 게임 결과
		
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
