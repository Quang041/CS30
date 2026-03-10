import java.awt.EventQueue;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;




public class BreakAPlate {

	private boolean start = false;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		ImageIcon Placeholder = new ImageIcon("../Chapter_10/src/Placeholder.png");
		ImageIcon background = new ImageIcon("../Chapter_10/src/plates.png");
		ImageIcon all_broken = new ImageIcon("../Chapter_10/src/all_broken_plates.png");
		ImageIcon two_broken = new ImageIcon("../Chapter_10/src/two_broken_plates.png");
		ImageIcon tiger = new ImageIcon("../Chapter_10/src/tiger_plush.png");
		ImageIcon sticker = new ImageIcon("../Chapter_10/src/sticker.png");
		
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		panel.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton Gamble = new JButton("Start Game");
		Gamble.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Gamble.setBounds(35, 186, 117, 34);
		panel.add(Gamble);
		
		JLabel Display = new JLabel("");
		Display.setBounds(137, 40, 270, 71);
		panel.add(Display);
		
		JLabel Prize = new JLabel("");
		Prize.setBounds(231, 139, 117, 111);
		panel.add(Prize);
		
		
		Gamble.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String Start = e.getActionCommand();
				if(Start.equals("Start Game")) {
					start = true;
					Gamble.setText("Play Game");
					Display.setIcon(background);
				}
					
					Random random = new Random();
					int Firstrandom = random.nextInt(2);
					int Secondrandom = random.nextInt(2);
					int Thirdrandom = random.nextInt(2);
					
					if(Start.equals("Play Game")) {
						if(Firstrandom == 1 || Secondrandom == 1 || Thirdrandom == 1) {
							Display.setIcon(all_broken);
							Gamble.setText("Play Again");
							Prize.setIcon(tiger);
							
						}
						else {
							Display.setIcon(two_broken);
							Gamble.setText("Play Again");
							Prize.setIcon(sticker);
						}
					}
					
					
					if(Start.equals("Play Again")) {
						Display.setIcon(null);
						Gamble.setText("Play Game");
						Prize.setIcon(null);
					}
					
					
					
				
				
				
				
				
				
			};
	});
	}
};
