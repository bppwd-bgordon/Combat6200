import java.awt.image.BufferedImage;


public class SpriteSheet {
	
	public BufferedImage spriteSheet;
	
	public SpriteSheet(BufferedImage ss)
	{
		this.spriteSheet = ss;
	}
	
	public BufferedImage getSprite(int x, int y, int width, int height)
	{
		BufferedImage sprite = spriteSheet.getSubimage(x, y, width, height);
		return sprite;
	}
}

// Might not need this class