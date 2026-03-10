import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SemesterAvg {

	private JFrame frame;
	private JTextField Grade1;
	private JTextField Grade2;
	private JTextField Grade3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAvg window = new SemesterAvg();
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
	public SemesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.getContentPane().setForeground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Grade1 = new JTextField();
		Grade1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				
				/* Make the first grade box clean when user enters their first grade*/
				if (Grade1.getText().equals("Your first grade:"))
					Grade1.setText("");
			}
		});
		Grade1.setText("Your first grade:");
		Grade1.setBounds(10, 46, 130, 20);
		frame.getContentPane().add(Grade1);
		Grade1.setColumns(10);
		
		Grade2 = new JTextField();
		Grade2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				/* Make the second grade box clean when user enters their second grade*/
				if (Grade2.getText().equals("Your second grade:"))
					Grade2.setText("");
			}
		});
		Grade2.setText("Your second grade:");
		Grade2.setColumns(10);
		Grade2.setBounds(10, 77, 130, 20);
		frame.getContentPane().add(Grade2);
		
		Grade3 = new JTextField();
		Grade3.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				/* Make the third grade box clean when user enters their third grade*/
				if (Grade3.getText().equals("Your third grade:"))
					Grade3.setText("");
			}
		});
		Grade3.setText("Your third grade:");
		Grade3.setColumns(10);
		Grade3.setBounds(10, 108, 130, 20);
		frame.getContentPane().add(Grade3);
		
		JTextArea Average = new JTextArea();
		Average.setLineWrap(true);
		Average.setBounds(168, 44, 244, 84);
		frame.getContentPane().add(Average);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				/*Receive all the data needed to process*/
				String grade1 = Grade1.getText();
				String grade2 = Grade2.getText();
				String grade3 = Grade3.getText();
				
				/*Convert the String into float for easier calculation*/
				float g1 = Float.parseFloat(grade1);
				float g2 = Float.parseFloat(grade2);
				float g3 = Float.parseFloat(grade3);
				
				/*Set the condition for impossible grades*/
				if(g1>100 || g1<0) {
					Average.setText("Error! Please put the right grade of yours.");
				}
				else if(g2>100 || g2<0) {
					Average.setText("Error! Please put the right grade of yours.");
				}
				else if(g3>100 || g3<0) {
					Average.setText("Error! Please put the right grade of yours.");
				}
				else {
					/*Take the average of all three grades*/
					float average = (g1+g2+g3)/3;
					
					/*Reform the average into two average places (in case the average has long decimal value)*/
					DecimalFormat df = new DecimalFormat("#.##");
					
					/*Show user the average*/
					Average.setText("Your first grade is: " + grade1 + System.lineSeparator()
					  + "Your second grade is: "+ grade2 + System.lineSeparator()
					  + "Your third grade is: "+ grade3 + System.lineSeparator()
					  + "  " + System.lineSeparator()
					  + "***Your average is: "+ df.format(average) + "***");


				}
				
			}
		});
		Submit.setFont(new Font("Serif", Font.PLAIN, 14));
		Submit.setBounds(35, 210, 105, 28);
		frame.getContentPane().add(Submit);
	
	}
}
