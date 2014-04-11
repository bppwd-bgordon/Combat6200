import java.awt.event.KeyEvent;

///Controls the movement and direction of the tank. It also feeds these values back to the tank to determine the sprite to use.

//Sprite Array Values
	// 0 == right
	// 1 == downRight
	// 2 == down
	// 3 == downLeft
	// 4 == left
	// 5 == upLeft
	// 6 == up
	// 7 == upRight

public class Move{
	
	public int keyPressed(KeyEvent event) {
		if(event.getKeyCode() == KeyEvent.VK_UP) {
			if (event.getKeyCode() == KeyEvent.VK_RIGHT)
				return 7;
			else if (event.getKeyCode() == KeyEvent.VK_LEFT)
				return 5;
			else return 6;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_DOWN) {
			if (event.getKeyCode() == KeyEvent.VK_RIGHT)
				return 1;
			else if (event.getKeyCode() == KeyEvent.VK_LEFT)
				return 3;
			else return 2;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_RIGHT) {
			if (event.getKeyCode() == KeyEvent.VK_UP)
				return 7;
			else if (event.getKeyCode() == KeyEvent.VK_DOWN)
				return 1;
			else return 0;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_LEFT) {
			if (event.getKeyCode() == KeyEvent.VK_UP)
				return 5;
			else if (event.getKeyCode() == KeyEvent.VK_DOWN)
				return 3;
			else return 4;
		}	
		else return 0;
	}

}
