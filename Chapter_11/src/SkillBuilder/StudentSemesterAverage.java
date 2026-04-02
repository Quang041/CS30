
package SkillBuilder;

import java.awt.EventQueue;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JComboBox;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTextArea;

public class StudentSemesterAverage {

	private JFrame frame;
	private JTextField Student;
	private JTextField Grade;
	private JTextField Semester;
	private JTextField g1;
	private JTextField g2;
	private JTextField g3;
	private JTextField g4;
	private JTextField average;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentSemesterAverage window = new StudentSemesterAverage();
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
	public StudentSemesterAverage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(10, 11, 110, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Grade Level:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(10, 42, 110, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Semester Number:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_2.setBounds(10, 72, 128, 20);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Grade 1:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_3.setBounds(10, 103, 78, 20);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Grade 2:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_4.setBounds(10, 139, 78, 20);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Grade 3:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_5.setBounds(10, 177, 78, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Grade 4:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_6.setBounds(10, 216, 78, 20);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Average:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(10, 266, 78, 20);
		frame.getContentPane().add(lblNewLabel_7);
		
		Student = new JTextField();
		Student.setBounds(170, 12, 306, 20);
		frame.getContentPane().add(Student);
		Student.setColumns(10);
		
		Grade = new JTextField();
		Grade.setColumns(10);
		Grade.setBounds(170, 43, 306, 20);
		frame.getContentPane().add(Grade);
		
		Semester = new JTextField();
		Semester.setColumns(10);
		Semester.setBounds(170, 73, 306, 20);
		frame.getContentPane().add(Semester);
		
		g1 = new JTextField();
		g1.setColumns(10);
		g1.setBounds(170, 104, 306, 20);
		frame.getContentPane().add(g1);
		
		g2 = new JTextField();
		g2.setColumns(10);
		g2.setBounds(170, 140, 306, 20);
		frame.getContentPane().add(g2);
		
		g3 = new JTextField();
		g3.setColumns(10);
		g3.setBounds(170, 178, 306, 20);
		frame.getContentPane().add(g3);
		
		g4 = new JTextField();
		g4.setColumns(10);
		g4.setBounds(170, 217, 306, 20);
		frame.getContentPane().add(g4);
		
		average = new JTextField();
		average.setBounds(170, 268, 306, 20);
		average.setVisible(false);
		frame.getContentPane().add(average);
		average.setColumns(10);
		
		JTextArea display = new JTextArea();
		display.setFont(new Font("Monospaced", Font.PLAIN, 10));
		display.setBounds(10, 305, 466, 105);
		display.setVisible(false);
		frame.getContentPane().add(display);
		
		JButton save = new JButton("Save to File");
		save.setFont(new Font("Tahoma", Font.BOLD, 16));
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double grade1 = Double.parseDouble(g1.getText());
				double grade2 = Double.parseDouble(g2.getText());
				double grade3 = Double.parseDouble(g3.getText());
				double grade4 = Double.parseDouble(g4.getText());
				double average_ = (grade1+grade2+grade3+grade4)/4;
				
				String average_real = Double.toString(average_);
				average.setVisible(true);
				average.setText(average_real);
				
				FileWriter out;
				BufferedWriter writeFile;
				try {
				out = new FileWriter("DataFile.txt", true);
				writeFile = new BufferedWriter(out);
				
				
				writeFile.write("Student: " + Student.getText() + "|");
				writeFile.write("Grade: " + Grade.getText() + "|");
				writeFile.write("Semester: " + Semester.getText() + "|");
				writeFile.write("Grade: " + g1.getText() + ", " + g2.getText() + ", " + g3.getText() + ", " + g4.getText() + "|");
				writeFile.write("Average: " + average_real + ".");
				writeFile.newLine();
				
				writeFile.close();
				out.close();
				
				
				JOptionPane.showMessageDialog(null, "Save Data Successfully!");
				
				} catch (IOException ex) {
					System.out.println("Problem writing to file");
					System.out.println("IOException: " + ex.getMessage());
				}
				
			}
		});
		save.setBounds(46, 421, 148, 31);
		frame.getContentPane().add(save);
		
		JButton view = new JButton("View File Contents");
		view.setFont(new Font("Tahoma", Font.BOLD, 16));
		view.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				FileReader in = new FileReader("DataFile.txt");
				BufferedReader buffer = new BufferedReader(in);
				
				String line;
				String output = "";
				
				while ((line = buffer.readLine()) != null) {
					output = output + line + "\n";
				}
				display.setVisible(true);
				display.setText(output);
				
				} catch (IOException ex) {
					System.out.println("Cannot access to the file.");
					System.out.println("IOException: " + ex.getMessage());
				}
			}
		});
		view.setBounds(248, 421, 204, 31);
		frame.getContentPane().add(view);
	}
}
