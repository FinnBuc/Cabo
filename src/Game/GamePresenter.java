package Game;

import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GamePresenter extends JFrame {

    JButton caboButton;
    JButton drawPile;
    JButton discardPile;
    JLabel gameText;
    JButton p1c1Button;
    JButton p1c2Button;
    JButton p1c3Button;
    JButton p1c4Button;
    JButton p2c1Button;
    JButton p2c2Button;
    JButton p2c3Button;
    JButton p2c4Button;
    JButton p3c1Button;
    JButton p3c2Button;
    JButton p3c3Button;
    JButton p3c4Button;
    JButton p4c1Button;
    JButton p4c2Button;
    JButton p4c3Button;
    JButton p4c4Button;
    JButton[] p1Buttons = new JButton[4];
    JButton[] p2Buttons = new JButton[4];
    JButton[] p3Buttons = new JButton[4];
    JButton[] p4Buttons = new JButton[4];
    private int playerNumber;


    public GamePresenter(int playersLength) {
        playerNumber = playersLength;
        setTitle("Cabo");
        setSize(2560, 1440);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        //gameText
        gameText = new JLabel("Willkommen bei Cabo!");
        gameText.setHorizontalAlignment(JLabel.CENTER);
        gameText.setVerticalAlignment(JLabel.TOP);
        gameText.setBorder(new LineBorder(Color.BLACK));
        gameText.setVisible(true);
        gameText.setFont(new Font("Dialog", 0, 50));
        add(gameText);

        //caboButton
        caboButton = new JButton("Cabo!");
        caboButton.setBounds(2360, 1280, 100, 61);
        add(caboButton);

        //drawPile
        drawPile = new JButton("Draw");
        drawPile.setBounds(1180, 660, 80, 120);
        add(drawPile);

        //discardPile
        discardPile = new JButton("Test");
        discardPile.setBounds(1300, 660, 80, 120);
        add(discardPile);

        //PlayerArrays
        p1c1Button = new JButton("Card1");
        p1c2Button = new JButton("Card2");
        p1c3Button = new JButton("Card3");
        p1c4Button = new JButton("Card4");
        p1Buttons[0] = p1c1Button;
        p1Buttons[1] = p1c2Button;
        p1Buttons[2] = p1c3Button;
        p1Buttons[3] = p1c4Button;
        for (int i = 0; i < 4; i++) {
            p1Buttons[i].setBounds(1060 + 120 * i, 930, 80, 120);
            add(p1Buttons[i]);
        }

        p2c1Button = new JButton("Card1");
        p2c2Button = new JButton("Card2");
        p2c3Button = new JButton("Card3");
        p2c4Button = new JButton("Card4");
        p2Buttons[0] = p2c1Button;
        p2Buttons[1] = p2c2Button;
        p2Buttons[2] = p2c3Button;
        p2Buttons[3] = p2c4Button;
        for (int i = 0; i < 4; i++) {
            p2Buttons[i].setBounds(1060 + 120 * i, 390, 80, 120);
            add(p2Buttons[i]);
        }

        if (playerNumber > 2) {
            p3c1Button = new JButton("Card1");
            p3c2Button = new JButton("Card2");
            p3c3Button = new JButton("Card3");
            p3c4Button = new JButton("Card4");
            p3Buttons[0] = p3c1Button;
            p3Buttons[1] = p3c2Button;
            p3Buttons[2] = p3c3Button;
            p3Buttons[3] = p3c4Button;
            for (int i = 0; i < 4; i++) {
                p3Buttons[i].setBounds(860, 500 + 120 * i, 120, 80);
                add(p3Buttons[i]);
            }
            if (playerNumber > 3) {
                p4c1Button = new JButton("Card1");
                p4c2Button = new JButton("Card2");
                p4c3Button = new JButton("Card3");
                p4c4Button = new JButton("Card4");
                p4Buttons[0] = p4c1Button;
                p4Buttons[1] = p4c2Button;
                p4Buttons[2] = p4c3Button;
                p4Buttons[3] = p4c4Button;
                for (int i = 0; i < 4; i++) {
                    p4Buttons[i].setBounds(1580, 500 + 120 * i, 120, 80);
                    add(p4Buttons[i]);
                }
            }
        }
    }

    public void setDiscardPile(JButton discardPile) {
        this.discardPile = discardPile;
    }

    public void setGameText(JLabel gameText) {
        this.gameText = gameText;
    }

    public void setP1c1Button(JButton p1c1Button) {
        this.p1c1Button = p1c1Button;
    }

    public void setP1c2Button(JButton p1c2Button) {
        this.p1c2Button = p1c2Button;
    }

    public void setP1c3Button(JButton p1c3Button) {
        this.p1c3Button = p1c3Button;
    }

    public void setP1c4Button(JButton p1c4Button) {
        this.p1c4Button = p1c4Button;
    }

    public void setP2c1Button(JButton p2c1Button) {
        this.p2c1Button = p2c1Button;
    }

    public void setP2c2Button(JButton p2c2Button) {
        this.p2c2Button = p2c2Button;
    }

    public void setP2c3Button(JButton p2c3Button) {
        this.p2c3Button = p2c3Button;
    }

    public void setP2c4Button(JButton p2c4Button) {
        this.p2c4Button = p2c4Button;
    }

    public void setP3c1Button(JButton p3c1Button) {
        this.p3c1Button = p3c1Button;
    }

    public void setP3c2Button(JButton p3c2Button) {
        this.p3c2Button = p3c2Button;
    }

    public void setP3c3Button(JButton p3c3Button) {
        this.p3c3Button = p3c3Button;
    }

    public void setP3c4Button(JButton p3c4Button) {
        this.p3c4Button = p3c4Button;
    }

    public void setP4c1Button(JButton p4c1Button) {
        this.p4c1Button = p4c1Button;
    }

    public void setP4c2Button(JButton p4c2Button) {
        this.p4c2Button = p4c2Button;
    }

    public void setP4c3Button(JButton p4c3Button) {
        this.p4c3Button = p4c3Button;
    }

    public void setP4c4Button(JButton p4c4Button) {
        this.p4c4Button = p4c4Button;
    }

}

