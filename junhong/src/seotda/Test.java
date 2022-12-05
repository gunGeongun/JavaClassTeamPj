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
		shuf.cardShuffle(shuffleDeck); // 移대�� ����
		cardDiv.Div(shuffleDeck, user, com); //移대�� 遺�諛�
		String userScore = score.Score(user); // �����댁�� 移대�� 議깅낫 ����
		String comScore = score.Score(com); //而댄�⑦�� 移대�� 議깅낫 ����
		int userScorePrize = score.scorePrize(userScore); // �����댁�� ���� 媛�
		int comScorePrize = score.scorePrize(comScore); //而댄�⑦�� ���� 媛�
		String gameResult = result.result(userScorePrize,comScorePrize); // 寃��� 寃곌낵
		System.out.println("Player 移대�� �� " + Arrays.toString(user));
		System.out.println(Arrays.toString(user));
		System.out.println("Computer 移대�� �� " + Arrays.toString(com));
		System.out.println("Player 議깅낫"+ userScore);
		System.out.println("Computer 議깅낫"+ comScore);
		System.out.println("Player �� ���� " + userScorePrize);
		System.out.println("Computer �� ���� " + comScorePrize);
		System.out.println("寃곌낵�� " + gameResult);
		
	

	}

}
