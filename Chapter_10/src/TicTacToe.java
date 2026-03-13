import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
 
public class TicTacToe {
 
    private JFrame frame;
    private boolean turn = true;
    private TTT game = new TTT();
 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
 
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TicTacToe window = new TicTacToe();
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
    public TicTacToe() {
        initialize();
    }
 
    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
 
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
 
        JPanel panel = new JPanel();
        panel.setBackground(SystemColor.activeCaptionBorder);
        panel.setBounds(0, 0, 434, 261);
        frame.getContentPane().add(panel);
        panel.setLayout(null);
        
        
        JLabel Display = new JLabel("");
        Display.setBounds(61, 206, 128, 32);
        panel.add(Display);
        Display.setText("");
    
        
        //Button 1//
        JButton Button1 = new JButton("");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 0, 0)) {
                    Button1.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button1.setBounds(24, 35, 102, 32);
        Button1.setVisible(false);
        panel.add(Button1);
 
        //Button 2//
        JButton Button2 = new JButton("");
        Button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 0, 1)) {
                    Button2.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button2.setBounds(162, 35, 102, 32);
        Button2.setVisible(false);
        panel.add(Button2);
 
        //Button 3//
        JButton Button3 = new JButton("");
        Button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 0, 2)) {
                    Button3.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button3.setBounds(305, 35, 102, 32);
        Button3.setVisible(false);
        panel.add(Button3);
 
        //Button 4//
        JButton Button4 = new JButton("");
        Button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 1, 0)) {
                    Button4.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button4.setBounds(24, 92, 102, 32);
        Button4.setVisible(false);
        panel.add(Button4);
 
        //Button 5//
        JButton Button5 = new JButton("");
        Button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 1, 1)) {
                    Button5.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button5.setBounds(162, 92, 102, 32);
        Button5.setVisible(false);
        panel.add(Button5);
 
        //Button 6//
        JButton Button6 = new JButton("");
        Button6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 1, 2)) {
                    Button6.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button6.setBounds(305, 92, 102, 32);
        Button6.setVisible(false);
        panel.add(Button6);
 
        //Button 7//
        JButton Button7 = new JButton("");
        Button7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 2, 0)) {
                    Button7.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button7.setBounds(24, 149, 102, 32);
        Button7.setVisible(false);
        panel.add(Button7);
 
        //Button 8//
        JButton Button8 = new JButton("");
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 2, 1)) {
                    Button8.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button8.setBounds(162, 149, 102, 32);
        Button8.setVisible(false);
        panel.add(Button8);
 
        //Button 9//
        JButton Button9 = new JButton("");
        Button9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
 
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                } else {
                    player = "0";
                    Display.setText("X turn");
                }
 
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 2, 2)) {
                    Button9.setText(player);
                    turn = !turn;
 
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if (!winner.equals(" ")) {
                        Display.setText("Winner is " + winner);
                    }
                }
            }
        });
        Button9.setBounds(305, 149, 102, 32);
        Button9.setVisible(false);
        panel.add(Button9);
        
        
        JButton Button = new JButton("Start");
        Button.setFont(new Font("Tw Cen MT", Font.PLAIN, 24));
        Button.setBounds(218, 206, 102, 32);
        Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            
            if (Button.getText().equals("Start")) {
            	Display.setText("X turn");
            	Button1.setVisible(true);
            	Button2.setVisible(true);
            	Button3.setVisible(true);
            	Button4.setVisible(true);
            	Button5.setVisible(true);
            	Button6.setVisible(true);
            	Button7.setVisible(true);
            	Button8.setVisible(true);
            	Button9.setVisible(true);
            	Button.setText("Restart");
            }
            else if (Button.getText().equals("Restart")) {
            	turn = true;
            	game = new TTT();
            	Display.setText("");
            	Button1.setVisible(false);
            	Button1.setText("");
            	Button2.setVisible(false);
            	Button2.setText("");
            	Button3.setVisible(false);
            	Button3.setText("");
            	Button4.setVisible(false);
            	Button4.setText("");
            	Button5.setVisible(false);
            	Button5.setText("");
            	Button6.setVisible(false);
            	Button6.setText("");
            	Button7.setVisible(false);
            	Button7.setText("");
            	Button8.setVisible(false);
            	Button8.setText("");
            	Button9.setVisible(false);
            	Button9.setText("");
            	Button.setText("Start");
            }
                
                
            }
        });
        panel.add(Button);
 
    }
 
}









