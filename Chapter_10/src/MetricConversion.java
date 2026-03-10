import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;

public class MetricConversion {

	private JFrame frame;
	private JTextField Display;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 300, 150);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox Units = new JComboBox();
		Units.setModel(new DefaultComboBoxModel(new String[] {"Inches to Centimeters", "Feet to Meters", "Gallons to Liters", "Pounds to Kilograms"}));
		Units.setForeground(SystemColor.inactiveCaptionText);
		Units.setBackground(SystemColor.activeCaptionBorder);
		Units.setBounds(25, 27, 235, 22);
		frame.getContentPane().add(Units);
		
		JLabel lblNewLabel = new JLabel("Select a conversion type:");
		lblNewLabel.setBounds(25, 11, 146, 14);
		frame.getContentPane().add(lblNewLabel);
		
		Display = new JTextField();
		Display.setBounds(25, 69, 235, 20);
		frame.getContentPane().add(Display);
		Display.setColumns(10);
	
	
	Units.addActionListener(new ActionListener() {
		String UserOutput = " ";
		
		@Override
		public void actionPerformed(ActionEvent e) {
			if (Units.getSelectedItem().equals("Inches to Centimeters")) {
				UserOutput = "1 Inch = 2.54 Centimiters";
			}
			else if(Units.getSelectedItem().equals("Feet to Meters")) {
				UserOutput = "1 Foot = 0.3048 Meters";
			}
			else if(Units.getSelectedItem().equals("Gallons to Liters")) {
				UserOutput = "1 Gallon = 4.5461 Liters";
			}
			else if(Units.getSelectedItem().equals("Pounds to Kilograms")) {
				UserOutput = "1 Pound = 0.4536 Kilograms";
			}
			
			Display.setText(UserOutput);
			
		};
	});
}};
