package twocard;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;

	
public class TwoCard extends JFrame {
	private Image backgroundImage = new  ImageIcon("src/twocard/background.png").getImage();
	private Image player = new ImageIcon("src/twocard/images.jpg").getImage();
	private Image enemy = new ImageIcon("src/twocard/images.jpg").getImage();
	private Image c1 = new ImageIcon("src/twocard/1.png").getImage();
	private Image c2 = new ImageIcon("src/twocard/2.png").getImage();
	private Image c3 = new ImageIcon("src/twocard/3.png").getImage();
	private Image c4 = new ImageIcon("src/twocard/4.png").getImage();
	private Image c5 = new ImageIcon("src/twocard/5.png").getImage();
	private Image c6 = new ImageIcon("src/twocard/6.png").getImage();
	private Image c7 = new ImageIcon("src/twocard/7.png").getImage();
	private Image c8 = new ImageIcon("src/twocard/8.png").getImage();
	private Image c9 = new ImageIcon("src/twocard/9.png").getImage();
	private Image c10 = new ImageIcon("src/twocard/10.png").getImage();
	private Image c11 = new ImageIcon("src/twocard/11.png").getImage();
	private Image c12 = new ImageIcon("src/twocard/12.png").getImage();
	private Image c13 = new ImageIcon("src/twocard/13.png").getImage();
	private Image c14 = new ImageIcon("src/twocard/14.png").getImage();
	private Image c15 = new ImageIcon("src/twocard/15.png").getImage();
	private Image c16 = new ImageIcon("src/twocard/16.png").getImage();
	private Image c17 = new ImageIcon("src/twocard/17.png").getImage();
	private Image c18 = new ImageIcon("src/twocard/18.png").getImage();
	private Image c19 = new ImageIcon("src/twocard/19.png").getImage();
	private Image c20 = new ImageIcon("src/twocard/20.png").getImage();
	private Image c21 = new ImageIcon("src/twocard/21.png").getImage();
	private int playerX, playerY;
	private int playerWidth = player.getWidth(null);
	private int playerHidth = player.getHeight(null);
	private int enemyX, enemyY;
	private int enemyWidth = enemy.getWidth(null);
	private int enemyHidth = enemy.getHeight(null);
	
	int playermoney = 0;
	int oppomoney = 0;
	int beting = 0;
	
	
	
	
	
	
	public TwoCard() {
		
		setTitle("tc game");
		setVisible(true);
		setSize(1280,720);
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton die = new JButton("다이");
		JButton call = new JButton("콜");
		JButton half = new JButton("하프");
		
		add(die);
		add(call);
		add(half);
		
		die.setBounds(470, 600, 130, 75);
		call.setBounds(610, 600, 130, 75);
		half.setBounds(750, 600, 130, 75);
		
		setLayout(null);
		
		ImageIcon icon = new ImageIcon(c21);
		
		Image img = icon.getImage();
		Image changeImg = img.getScaledInstance(100,150, Image.SCALE_DEFAULT);
		ImageIcon changeIcon = new ImageIcon(changeImg);
		
		JLabel p1 = new JLabel(changeIcon);
		JLabel p2 = new JLabel(changeIcon);
		JLabel e1 = new JLabel(changeIcon);
		JLabel e2 = new JLabel(changeIcon);
		
		add(p1);	
		p1.setBounds(500,360,100,150);
		p1.setLayout(null);
		add(p2);	
		p2.setBounds(650,360,100,150);
		p2.setLayout(null);
		add(e1);	
		e1.setBounds(500,140,100,150);
		e1.setLayout(null);
		add(e2);	
		e2.setBounds(650,140,100,150);
		e2.setLayout(null);
		
		
	}
		
	
	
	public void paint(Graphics g) {
		g.drawImage(backgroundImage, 0, 0 , null);
		g.drawImage(player, 300, 550, null);
		g.drawImage(enemy, 300, 40, null);
		g.setColor(Color.WHITE);
		g.setFont(new Font("Arial", Font.BOLD, 40));
		g.drawString("Opponent : "+ oppomoney, 470, 130 );
		g.drawString("player : "+ playermoney, 470, 590 );
		g.drawString("Bet :" + beting, 50, 360 );
		
		
	}
	
	

	public static void main(String[] args) {
		new TwoCard();
		
		
	}

}
