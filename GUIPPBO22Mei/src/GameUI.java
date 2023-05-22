import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameUI extends JFrame {
    private JLabel backgroundLabel;
    private JLabel characterLabel;
    private JLabel textLabel;
    private int characterX, characterY;

    // constructor
    public GameUI(){
        setTitle("Game frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setResizable(false);
        characterX = 350;
        characterY = 300;

        // set image background
        ImageIcon bgImg = new ImageIcon("src/Assets/bg.jpeg");
        backgroundLabel = new JLabel(bgImg);
        backgroundLabel.setBounds(0, 0, 800, 600);
        add(backgroundLabel);
        // set chara
        ImageIcon characterImage = new ImageIcon("src/Assets/character.png");
        characterLabel = new JLabel(characterImage);
        characterLabel.setBounds(characterX, characterY, 100, 167);
        backgroundLabel.add(characterLabel);
        // set image
        textLabel = new JLabel("Hello! Welcome to My Game!");
        textLabel.setFont(new Font("Arial", Font.BOLD, 13));
        textLabel.setForeground(Color.WHITE);
        textLabel.setBounds(350, 200, 200, 30);
        backgroundLabel.add(textLabel);

        // key listener untuk menggganti posisi dari carakter
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode();
                switch (keyCode){
                    case KeyEvent.VK_UP:
                        characterY -= 10;
                        break;
                    case KeyEvent.VK_DOWN:
                        characterY += 10;
                        break;
                    case KeyEvent.VK_RIGHT:
                        characterX += 10;
                        break;
                    case KeyEvent.VK_LEFT:
                        characterX -= 10;
                        break;
                    default:
                        break;
                }
                characterLabel.setLocation(characterX, characterY);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });





        // set visible
        setVisible(true);
    }

}
