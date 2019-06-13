package moteur.objets;

import java.awt.Graphics;

import moteur.Direction;

public abstract class GameObject 
{
	protected int positionX;
	protected int positionY;
	protected String nom;
	
	public GameObject(String nom, int positionX, int positionY)
	{
		this.positionX = positionX;
		this.positionY = positionY;
		this.nom = nom;
	}
	
	public void deplacer(Direction direction)
	{
		switch(direction)
		{
			case HAUT: 
				positionY--;
				break;
			case BAS: 
				positionY++;
				break;
			case GAUCHE:
				positionX--;
				break;
			case DROITE:
				positionX++;
				break;
		}
	}
	
	public void dessiner(Graphics g){}
}
