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
	
	/**
	 * Déplace l'objet dans une direction
	 * @param direction
	 */
	public void deplacer(Direction direction, float vitesse)
	{
		switch(direction)
		{
			case HAUT: 
				positionY -= vitesse;
				break;
			case BAS: 
				positionY += vitesse;
				break;
			case GAUCHE:
				positionX -= vitesse;
				break;
			case DROITE:
				positionX += vitesse;
				break;
		}
	}
	
	/**
	 * Dessine l'objet, doit être override
	 * @param g
	 */
	public void dessiner(Graphics g){}
	
	public int get_position_x()
	{
		return positionX;
	}
	
	public int get_position_y()
	{
		return positionY;
	}
	
	public void set_position(int x, int y)
	{
		positionX = x;
		positionY = y;
	}
}
