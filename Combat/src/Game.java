import java.awt.BorderLayout;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game
{
    private JFrame frame;
    private GamePanel gamePanel;
    boolean running;
    private MyGame game;    

    protected void start(int width, int height)
    {
    	this.game = (MyGame)this;
    	running = true;
        frame = new JFrame("Java Game Development");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gamePanel = new GamePanel();
        frame.getContentPane().add(BorderLayout.CENTER, gamePanel);
        frame.setResizable(false);
        frame.setSize(width, height);
        frame.setLocationByPlatform(true);
        frame.setVisible(true);
        run();
    }

    class GamePanel extends JPanel
    {
        private static final long serialVersionUID = 1L;
        public void paintComponent(Graphics g) { game.draw(g); }
    }

    private void run()
    {
        while (true)
        {
           game.update();
            try { Thread.sleep(10); }
            catch (Exception e) { e.printStackTrace(); }
            frame.repaint();
        }
    }
}
