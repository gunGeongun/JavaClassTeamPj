package seotda;
import java.util.Arrays;

public class Test {
	
	public static void main(String[] args) {
		final int cardSize = 2;
		int[] user = new int[cardSize];
		int[] com = new int[cardSize];
		
		Card deck = new Card();
		Shuffle shuf = new Shuffle();
		cardScore score = new cardScore();
		CardDivision cardDiv = new CardDivision();
		winner result = new winner();
		int[] shuffleDeck = deck.card;
		shuf.cardShuffle(shuffleDeck); // 카드 셔플
		cardDiv.Div(shuffleDeck, user, com); //카드 분배
		String userScore = score.Score(user); // 플레이어 카드 족보 확인
		String comScore = score.Score(com); //컴퓨터 카드 족보 확인
		int userScorePrize = score.scorePrize(userScore); // 플레이어 점수 값
		int comScorePrize = score.scorePrize(comScore); //컴퓨터 점수 값
		String gameResult = result.result(userScorePrize,comScorePrize); // 게임 결과
		System.out.println("Player 카드 패 " + Arrays.toString(user));
		System.out.println("Computer 카드 패 " + Arrays.toString(com));
		System.out.println("Player 족보"+ userScore);
		System.out.println("Computer 족보"+ comScore);
		System.out.println("Player 패 점수 " + userScorePrize);
		System.out.println("Computer 패 점수 " + comScorePrize);
		System.out.println("결과는 " + gameResult);
		
	

	}

}
