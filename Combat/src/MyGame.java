import java.awt.Graphics;
import java.awt.event.KeyEvent;


public class MyGame extends Game {

	// Represents the x coordinate of our Rectangle
	public int x = 0;
	public boolean turn = false;
	public KeyEvent e;
	
	// Construct a player object
	player player1 = new player(1);
	//player player2 = new player(2);
	
	
	public MyGame() {}

	
	public void draw(Graphics buffer) {
		buffer.drawImage(player1._mySprite, 100, 300, null);
		//buffer.drawImage(player2._mySprite, 1000, 300, null);
	}
	
	public void update() {
		//Call tank movement methods here!
		player1._mySprite = player1._spriteSheet[player1.keyPressed(e)];
	}
}
