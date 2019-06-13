package moteur.objets;

import java.awt.Color;
import java.awt.Graphics;

public class Texte extends GameObject 
{
	private String texte;
	private Color couleur;

	public Texte(String nom, int positionX, int positionY, Color couleur, String texte) 
	{
		super(nom, positionX, positionY);
		this.texte = texte;
		this.couleur = couleur;
	}
	
	@Override
	public void dessiner(Graphics g)
	{
		g.setColor(couleur);
		g.drawString(texte, positionX, positionY);
	}
	
	public void set_texte(String texte)
	{
		this.texte = texte;
	}

}
