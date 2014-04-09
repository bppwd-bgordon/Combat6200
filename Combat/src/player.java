import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

//Sprite Array Values
	// 0 == right
	// 1 == downRight
	// 2 == down
	// 3 == downLeft
	// 4 == left
	// 5 == upLeft
	// 6 == up
	// 7 == upRight

public class player 
{
// Instance variables
	private int _speed;
	private boolean _alive;
	private int _deadTime;
	private int rotation;
	public BufferedImage[] _spriteSheet = new BufferedImage[8];
	public BufferedImage _mySprite = null;
	
	
// Constructor
	public player(int playerNo, int x, int y)
	{
		// Initializes instance variables
		_speed = 5;
		_alive = true;
		_deadTime = 3000; // Milliseconds
		
		// Slices the spritesheet
		try {
			_spriteSheet = sliceSheet();
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
	//Slice sprite sheet
	private BufferedImage[] sliceSheet() throws IOException
	{
		BufferedImage bigImg = ImageIO.read(new File("player.png"));
		
		final int width = 9;
		final int height = 9;
		final int rows = 2;
		final int columns = 4;
		BufferedImage[] sprites = new BufferedImage[rows * columns];
		
		for (int i = 0; i < rows; i++)
		{
			for(int j = 0; j < columns; j++)
			{
				sprites[(i * columns) + j] = bigImg.getSubimage(
					j * width,
					i * height,
					width,
					height
				);
			}
		}
		
		return sprites;
	}
	
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
