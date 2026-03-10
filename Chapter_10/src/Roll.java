import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class Roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll window = new Roll();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		
		ImageIcon die1 = new ImageIcon("../Chapter_10/src/No.1.png");
		ImageIcon die2 = new ImageIcon("../Chapter_10/src/No.2.png");
		ImageIcon die3 = new ImageIcon("../Chapter_10/src/No.3.png");
		ImageIcon die4 = new ImageIcon("../Chapter_10/src/No.4.png");
		ImageIcon die5 = new ImageIcon("../Chapter_10/src/No.5.png");
		ImageIcon die6 = new ImageIcon("../Chapter_10/src/No.6.png");
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 350, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 350, 200);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel FDice = new JLabel("");
		FDice.setBounds(35, 11, 100, 100);
		panel.add(FDice);
		
		JButton Gamble = new JButton("Roll Dice");
		Gamble.setBounds(118, 120, 89, 23);
		panel.add(Gamble);
		
		JLabel SDice = new JLabel("");
		SDice.setBounds(197, 11, 100, 100);
		panel.add(SDice);
	
	
	Gamble.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			int FirstRandom = (int)(6 * Math.random() + 1);
			int SecondRandom = (int)(6 * Math.random() + 1);
			
			/*First dice values*/
			if(FirstRandom == 1) {
				FDice.setIcon(die1);
			}
			else if(FirstRandom == 2) {
				FDice.setIcon(die2);
			}
			else if(FirstRandom == 3) {
				FDice.setIcon(die3);
			}
			else if(FirstRandom == 4) {
				FDice.setIcon(die4);
			}
			else if(FirstRandom == 5) {
				FDice.setIcon(die5);
			}
			else if(FirstRandom == 6) {
				FDice.setIcon(die6);
			}
			
			/*Second dice values*/
			if(SecondRandom == 1) {
				SDice.setIcon(die1);
			}
			else if(SecondRandom == 2) {
				SDice.setIcon(die2);
			}
			else if(SecondRandom == 3) {
				SDice.setIcon(die3);
			}
			else if(SecondRandom == 4) {
				SDice.setIcon(die4);
			}
			else if(SecondRandom == 5) {
				SDice.setIcon(die5);
			}
			else if(SecondRandom == 6) {
				SDice.setIcon(die6);
			}
		};
	});
	}	
};

