import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Demo {

	private JFrame frame;
	private JTextField FName;
	private JTextField LName;
	private JComboBox Schools;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() 
	{
		ImageIcon CH = new ImageIcon("../Chapter_10/src/CH.png");
		ImageIcon W = new ImageIcon("../Chapter_10/src/western.jpg");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 182, 193));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		FName = new JTextField();
		FName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if (FName.getText().equals("First Name"))
					FName.setText("");
			}
		});
		FName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		FName.setForeground(new Color(0, 0, 128));
		FName.setText("First Name");
		FName.setColumns(10);
		FName.setBounds(20, 12, 108, 35);
		panel.add(FName);
		
		LName = new JTextField();
		LName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) 
			{
				if (LName.getText().equals("Last Name"))
					LName.setText("");
			}
		});
		LName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		LName.setForeground(new Color(0, 0, 128));
		LName.setText("Last Name");
		LName.setColumns(10);
		LName.setBounds(20, 54, 108, 35);
		panel.add(LName);
		
		JComboBox Grades = new JComboBox();
		Grades.setModel(new DefaultComboBoxModel(new String[] {"Select Grade", "Grade 10", "Grade 11", "Grade 12"}));
		Grades.setBounds(20, 100, 108, 22);
		panel.add(Grades);
		
		Schools = new JComboBox();
		Schools.setModel(new DefaultComboBoxModel(new String[] {"Select School", "Crescent Heights High School", "Western High School", "Churchill High School", "Piercing High School"}));
		Schools.setBounds(20, 133, 108, 22);
		panel.add(Schools);
		
		JLabel Label = new JLabel("");
		Label.setBounds(157, 56, 267, 194);
		panel.add(Label);
		
		
		
		JTextArea Display = new JTextArea();
		Display.setWrapStyleWord(true);
		Display.setLineWrap(true);
		Display.setBounds(138, 12, 286, 35);
		panel.add(Display);
		
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String fn = FName.getText();
				String ln = LName.getText();
				String grade = " ";
				String school = " ";
				
				//Grade Level//
				if(Grades.getSelectedItem().equals("Grade 12")) {
					grade = "12";
				}
				else if(Grades.getSelectedItem().equals("Grade 11")) {
					grade = "11";
				}
				else {
					grade = "10";
				}
				
				
				if(Schools.getSelectedItem().equals("Crescent Heights High School")) {
					school = "Crescent Heights High School";
					Label.setIcon(CH);
					
				}
				else if(Schools.getSelectedItem().equals("Western High School")) {
					school = "Western High School";
					Label.setIcon(W);
				}
				else if(Schools.getSelectedItem().equals("Churchill High School")) {
					school = "Churchill High School";
				}
				else {
					school = "Piercing High School";
				}
				
				Display.setText(fn + " " + ln + " " + "is in grade " + grade + " and go to " + school);
				
			}
		});
		Submit.setForeground(new Color(0, 0, 128));
		Submit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Submit.setBounds(20, 166, 94, 35);
		panel.add(Submit);
		
		
		
	}
}
