package demo;

import java.awt.Image;

import moteur.objets.Sprite;

public class Bonhomme extends Sprite 
{
	private float vitesse;
	
	public Bonhomme(String nom, int positionX, int positionY, int tailleX, int tailleY, Image image) 
	{
		super(nom, positionX, positionY, tailleX, tailleY, image);
		this.vitesse = 2.5f;
	}
	
	public float get_vitesse()
	{
		return vitesse;
	}
}
