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
	public player(int playerNo, int x, int y)
	{
		// Initializes instance variables
		_speed = 5;
		_alive = true;
		//_deadTime = 3000; // Milliseconds
		
		// Slices the spritesheet
		try {
			_spriteSheet = BufferedImageLoader.SliceSheet("Sprites/player8.png", 225, 225, 2, 4);
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
	
	public void updateRotation()
	{
		//if(rotation == 90) 
	}
}
