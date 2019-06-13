package moteur.objets;

import java.awt.Graphics;
import java.awt.Image;

public class Sprite extends GameObject
{
	private Image image;
	private int tailleX;
	private int tailleY;

	public Sprite(String nom, int positionX, int positionY, Image image) 
	{
		super(nom, positionX, positionY);
		this.image = image;
	}
	
	public Sprite(String nom, int positionX, int positionY, int tailleX, int tailleY, Image image) 
	{
		super(nom, positionX, positionY);
		this.image = image;
		this.tailleX = tailleX;
		this.tailleY = tailleY;
	}
	
	@Override
	public void dessiner(Graphics g)
	{
		g.drawImage(image, positionX, positionY, tailleX, tailleY, null);
	}

}
