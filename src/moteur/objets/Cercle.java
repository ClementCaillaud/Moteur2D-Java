package moteur.objets;

import java.awt.Color;
import java.awt.Graphics;

public class Cercle extends GameObject 
{
	private Color couleur;
	private int dimensionX;
	private int dimensionY;

	public Cercle(String nom, int positionX, int positionY, Color couleur, int dimensionX, int dimensionY) 
	{
		super(nom, positionX, positionY);
		this.couleur = couleur;
		this.dimensionX = dimensionX;
		this.dimensionY = dimensionY;
	}
	
	@Override
	public void dessiner(Graphics g)
	{
		g.setColor(couleur);
		g.fillOval(positionX, positionY, dimensionX, dimensionY);
	}
	
}
