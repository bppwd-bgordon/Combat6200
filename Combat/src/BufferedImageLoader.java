import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class BufferedImageLoader {
	
	// For single images
	public static BufferedImage LoadImage(String path) throws IOException
	{
		BufferedImage img = ImageIO.read(new File(path));
		return img;
	}
	
	// For sprite sheets
	public static BufferedImage[] SliceSheet(String path, int width, int height, int rows, int columns) throws IOException
	{
		BufferedImage bigImg = ImageIO.read(new File(path));
		
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
}