import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


public class player
{
// Instance variables
	private int _speed;
	private boolean _alive;
	//private int _deadTime;
	//private int rotation;
	public BufferedImage[] _spriteSheet = new BufferedImage[8];
	public BufferedImage _mySprite = null;
	
	
// Constructor
	public player(int playerNo)
	{
		// Initializes instance variables
		_speed = 5;
		_alive = true;
		//_deadTime = 3000; // Milliseconds
		
		// Slices the spritesheet
		try {
			_spriteSheet = BufferedImageLoader.SliceSheet("Sprites/player8.png", 112, 112, 2, 4);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// Sets rotation for each player
		if(playerNo == 1)
		{
			_mySprite = _spriteSheet[0];
		}
		else if(playerNo == 2)
		{
			_mySprite = _spriteSheet[4];
			
		}
		
	}
	
// Methods
	// Getters
	public int getSpeed(){return this._speed;}
	public boolean getAlive(){return this._alive;}
	
	// Setters
	public void setSpeed(int speed)
	{
		if(speed >= 0 && speed <= 10) this._speed = speed; 
		else return;
	}
	public void kill()
	{
		this._alive = false;
		//Rotate in random direction for _deadTime
	}
	
	//Sprite Array Values
	//0 == right
	//1 == down right
	//2 == down
	//3 == down left
	//4 == left
	//5 == up left
	//6 == up
	//7 == up right
	
	
	public int keyPressed(keyPressed(KeyEvent event)) {
		if(event.getKeyCode() == KeyEvent.VK_W){
			if (event.getKeyCode() == KeyEvent.VK_D)
				return 7;
			else if (event.getKeyCode() == KeyEvent.VK_A)
				return 5;
			else return 6;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_S) {
			if (event.getKeyCode() == KeyEvent.VK_D)
				return 1;
			else if (event.getKeyCode() == KeyEvent.VK_A)
				return 3;
			else return 2;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_D) {
			if (event.getKeyCode() == KeyEvent.VK_W)
				return 7;
			else if (event.getKeyCode() == KeyEvent.VK_S)
				return 1;
			else return 0;
		}
		
		if(event.getKeyCode() == KeyEvent.VK_A) {
			if (event.getKeyCode() == KeyEvent.VK_W)
				return 5;
			else if (event.getKeyCode() == KeyEvent.VK_S)
				return 3;
			else return 4;
		}	
		else return 0;
	}
}
