import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class MyGame extends Game {

	// Represents the x coordinate of our Rectangle
	public int x = 0;
	public boolean turn = false;
	
	// Construct a player object
	player player1 = new player(1,100,100);
	
	
	public MyGame() {}

	
	public void draw(Graphics buffer) {
		buffer.drawImage(player1._mySprite, 100, 100, null);
		buffer.setColor(Color.RED);
		buffer.fillRect(x, 100, 50, 50);
		
	}
	
	public void update() {
		//Call tank movement methods here!
		
	}
}
