import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class LaunchPage extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JButton button3;
    LaunchPanel launchPanel;
    JProgressBar progressBar = new JProgressBar(0, 100);
    Timer timer;

    LaunchPage() {

        ImageIcon image = new ImageIcon("launchLogo.png");
        this.setIconImage(image.getImage());

        launchPanel = new LaunchPanel();

        button1 = new JButton("Launch Game");
        button1.setBounds(150, 200, 400, 100);
        button1.addActionListener(this);
        button1.setFont(new Font("Comic Sans MS", Font.BOLD, 55));
        button1.setForeground(Color.cyan);
        button1.setBackground(new Color(0x0760b7));
        button1.setFocusable(false);
        button1.setBorder(BorderFactory.createEtchedBorder());

        button2 = new JButton("How to Play");
        button2.setBounds(150, 320, 400, 100);
        button2.addActionListener(this);
        button2.setFont(new Font("Comic Sans MS", Font.BOLD, 55));
        button2.setForeground(Color.cyan);
        button2.setBackground(new Color(0x0760b7));
        button2.setFocusable(false);
        button2.setBorder(BorderFactory.createEtchedBorder());

        button3 = new JButton("Exit");
        button3.setBounds(150, 440, 400, 100); // Adjust the position as needed
        button3.addActionListener(this);
        button3.setFont(new Font("Comic Sans MS", Font.BOLD, 55));
        button3.setForeground(Color.cyan);
        button3.setBackground(new Color(0x0760b7));
        button3.setFocusable(false);
        button3.setBorder(BorderFactory.createEtchedBorder());

        progressBar.setValue(0);
        progressBar.setBounds(130, 600, 420, 50);
        progressBar.setStringPainted(true);
        progressBar.setFont(new Font("MV Boli", Font.BOLD, 25));
        progressBar.setForeground(new Color(31,62,90));
        progressBar.setBackground(Color.black);
        progressBar.setVisible(false);

        this.add(progressBar);

        launchPanel.setLayout(null);
        launchPanel.setBounds(0, 0, 700, 700);

        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(launchPanel);

        this.setTitle("Launcher");
        this.setSize(700, 700);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void fill() {
        timer = new Timer(10, null);
        timer.addActionListener(new ActionListener() {
            int counter = 0;
    
            public void actionPerformed(ActionEvent e) {
                if (counter <= 100) {
                    progressBar.setValue(counter++);
                } else {
                    progressBar.setVisible(false);
                    GameFrame frame = new GameFrame();
                    timer.stop();
                }
            }
        });
        timer.start();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            progressBar.setVisible(true);
            fill();
        } else if (e.getSource() == button2) {
            JFrame instructionsFrame = new JFrame("How to Play");
            JTextArea textArea = new JTextArea(
                "1. Player 1 is on the left side. They can move their paddle up and down using the 'W' (up) and 'S' (down) keys.\n" +
            "2. Player 2 is on the right side. They can move their paddle up and down using the Up Arrow (up) and Down Arrow (down) keys.\n" +
            "3. The goal for both players is to defend their side from the ball using their paddles.\n" +
            "4. If a player fails to defend their side and the ball passes their paddle, the ball will respawn in the middle and the other player will score 1 point.\n" +
            "5. After every successful pass from a player, the ball's speed increases slightly, adding to the challenge.\n" +
            "6. The player with the most points at the end of the game wins.\n" +
            "7. The game can be paused at any time by pressing the 'Space Bar' key.\n\n" +
            "Remember, the key to winning is quick reflexes and strategic paddle movement. Enjoy the game!"
            );
            textArea.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
            textArea.setEditable(false);
            instructionsFrame.add(textArea);
            instructionsFrame.pack();
            instructionsFrame.setLocationRelativeTo(null);
            instructionsFrame.setResizable(false);
            instructionsFrame.setVisible(true);
        }
        
        else if (e.getSource() == button3) {
            System.exit(0);
        }
    }
    

}