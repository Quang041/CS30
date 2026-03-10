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
        Display.setBounds(71, 203, 128, 39);
        panel.add(Display);
        Display.setText("X turn");
       
        //Button 1//
        JButton Button1 = new JButton("");
        Button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 0, 0)) {
                    Button1.setText(player);
                    turn = !turn;
                   
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
       
                }
            }
        });
        Button1.setBounds(24, 35, 102, 32);
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
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 0, 1)) {
                    Button2.setText(player);
                    turn = !turn;
                   
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
       
                }
            }
        });
        Button2.setBounds(162, 35, 102, 32);
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
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 0, 2)) {
                    Button3.setText(player);
                    turn = !turn;
                   
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
       
                }
            }
        });
        Button3.setBounds(305, 35, 102, 32);
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
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 1, 0)) {
                    Button4.setText(player);
                    turn = !turn;
                   
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
       
                }
            }
        });
        Button4.setBounds(24, 92, 102, 32);
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
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 1, 1)) {
                    Button5.setText(player);
                    turn = !turn;
                           
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
               
                }
            }
        });
        Button5.setBounds(162, 92, 102, 32);
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
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 1, 2)) {
                    Button6.setText(player);
                    turn = !turn;
                   
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
       
                }
            }
        });
        Button6.setBounds(305, 92, 102, 32);
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
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 2, 0)) {
                    Button7.setText(player);
                    turn = !turn;
                   
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
       
                }
            }
        });
        Button7.setBounds(24, 149, 102, 32);
        panel.add(Button7);
       
        //BUtton 8//
        JButton Button8 = new JButton("");
        Button8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                /* Determine who is playing at the moment */
                String player;
                if (turn == true) {
                    player = "X";
                    Display.setText("0 turn");
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 2, 1)) {
                    Button8.setText(player);
                    turn = !turn;
                   
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
       
                }
            }
        });
        Button8.setBounds(162, 149, 102, 32);
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
                }
                else {
                    player = "0";
                    Display.setText("X turn");
                }
               
                /* Send the data back to TTT.Java to continue the game */
                if (game.makeMove(player, 2, 2)) {
                    Button9.setText(player);
                    turn = !turn;
                   
                    /* Tell the players who is the winner */
                    String winner = game.winner();
                    if(!winner.equals(" ")) {
                        Display.setText(" Winner is " + winner);
                    }
       
                }
            }
        });
        Button9.setBounds(305, 149, 102, 32);
        panel.add(Button9);
        
        JButton Button = new JButton("Start");
        Button.setBounds(217, 199, 128, 46);
        panel.add(Button);
    }
}









