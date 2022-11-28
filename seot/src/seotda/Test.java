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
		shuf.cardShuffle(shuffleDeck); // ī�� ����
		cardDiv.Div(shuffleDeck, user, com); //ī�� �й�
		String userScore = score.Score(user); // �÷��̾� ī�� ���� Ȯ��
		String comScore = score.Score(com); //��ǻ�� ī�� ���� Ȯ��
		int userScorePrize = score.scorePrize(userScore); // �÷��̾� ���� ��
		int comScorePrize = score.scorePrize(comScore); //��ǻ�� ���� ��
		String gameResult = result.result(userScorePrize,comScorePrize); // ���� ���
		System.out.println("Player ī�� �� " + Arrays.toString(user));
		System.out.println("Computer ī�� �� " + Arrays.toString(com));
		System.out.println("Player ����"+ userScore);
		System.out.println("Computer ����"+ comScore);
		System.out.println("Player �� ���� " + userScorePrize);
		System.out.println("Computer �� ���� " + comScorePrize);
		System.out.println("����� " + gameResult);
		
	

	}

}
