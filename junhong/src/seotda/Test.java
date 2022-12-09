package seotda;
import java.util.Arrays;

public class Test {
	public static void gameStart() {
		final int cardSize = 2;
		int[] user = new int[cardSize];
		int[] com = new int[cardSize];
		int[] shuffleDeck = Card.card;
		Shuffle.cardShuffle(shuffleDeck); // 카드 셔플
		CardDivision.Div(shuffleDeck, user, com); //카드 분배
		String userScore = cardScore.Score(user); // 플레이어 카드 족보 확인
		String comScore = cardScore.Score(com); //컴퓨터 카드 족보 확인
		int userScorePrize = cardScore.scorePrize(userScore); // 플레이어 점수 값
		int comScorePrize = cardScore.scorePrize(comScore); //컴퓨터 점수 값
		String gameResult = winner.result(userScorePrize,comScorePrize); // 게임 결과
		System.out.println("Player 카드 패 " + Arrays.toString(user));
		System.out.println("Computer 카드 패 " + Arrays.toString(com));
		System.out.println("Player 족보 " + userScore);
		System.out.println("Computer 족보" + comScore);
		System.out.println("Player 패 점수 " + userScorePrize);
		System.out.println("Computer 패 점수 " + comScorePrize);
		System.out.println("결과는 " + gameResult);
		if (gameResult =="무승부 재경기") {
			System.out.println("무승부 재경기합니다.");
			gameStart();
		}
		
	}
	
	public static void main(String[] args) {
		
		gameStart();
		
	

	}

}
