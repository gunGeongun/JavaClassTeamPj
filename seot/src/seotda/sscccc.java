package seotda;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class sscccc {
	public int b = 0;

	private JFrame frame;


	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					sscccc window = new sscccc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public sscccc() {
		initialize();
	}

	
	private void initialize() {
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
		
		ImageIcon img = new ImageIcon("/background.png");
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 128, 0));
		frame.setBounds(100, 100, 810, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		JButton newBtn = new JButton("\uD14C\uC2A4\uD2B8");
		
		newBtn.setBounds(166, 262, 116, 50);
		frame.getContentPane().add(newBtn);
		
		JTextPane moneytxt = new JTextPane();
		moneytxt.setText("10000");
		moneytxt.setBounds(12, 152, 152, 36);
		frame.getContentPane().add(moneytxt);
		
		JButton btnNewButton = new JButton("\uB2E4\uC774");
		btnNewButton.setBounds(330, 262, 116, 50);
		frame.getContentPane().add(btnNewButton);
		
		JLabel moneyLabel = new JLabel("\uD310\uB3C8");
		moneyLabel.setBounds(22, 127, 57, 15);
		frame.getContentPane().add(moneyLabel);
		
		JLabel cpuCard = new JLabel("cpu\uCE74\uB4DC\uD328");
		cpuCard.setBounds(200, 23, 57, 15);
		frame.getContentPane().add(cpuCard);
		
		JTextPane cpuCardText = new JTextPane();
		cpuCardText.setBounds(269, 17, 116, 21);
		frame.getContentPane().add(cpuCardText);
		
		JLabel userCard = new JLabel("user\uCE74\uB4DC\uD328");
		userCard.setBounds(156, 377, 69, 15);
		frame.getContentPane().add(userCard);
		
		JTextPane userCardText = new JTextPane();
		userCardText.setBounds(250, 371, 139, 21);
		frame.getContentPane().add(userCardText);
		
		JTextPane cpuCardValue = new JTextPane();
		cpuCardValue.setBounds(416, 17, 98, 21);
		frame.getContentPane().add(cpuCardValue);
		
		JTextPane userCardValue = new JTextPane();
		userCardValue.setBounds(427, 371, 87, 21);
		frame.getContentPane().add(userCardValue);
		
		JTextPane finalResultValue = new JTextPane();
		finalResultValue.setBounds(271, 127, 191, 87);
		frame.getContentPane().add(finalResultValue);
		
		JLabel finalResult = new JLabel("\uCD5C\uC885 \uACB0\uACFC");
		finalResult.setBounds(311, 99, 57, 15);
		frame.getContentPane().add(finalResult);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setIcon(new ImageIcon(sscccc.class.getResource("/seotda/images.jpg")));
		btnNewButton_1.setBounds(12, 300, 132, 120);
		frame.getContentPane().add(btnNewButton_1);
		newBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				userCardText.setText(userScore);
				userCardValue.setText(Integer.toString(userScorePrize));
				cpuCardText.setText(comScore);
				cpuCardValue.setText(Integer.toString(comScorePrize));
				finalResultValue.setText(gameResult);
			
				
			}
		});
		
	
		
	}
}
