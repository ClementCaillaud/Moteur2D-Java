package demo;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import moteur.Direction;
import moteur.Fenetre;
import moteur.Scene;
import moteur.objets.Cercle;
import moteur.objets.Sprite;
import moteur.objets.Texte;

public class Demo 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("Lancement de la démo...");
		
		Cercle c = new Cercle("C1", 50, 100, Color.BLUE, 50, 50);
		Cercle c2 = new Cercle("C2", 100, 50, Color.RED, 10, 80);
		Texte texte = new Texte("FPS", 10, 20, Color.BLACK, "0 FPS");
		Sprite s = new Sprite("I1", 200, 200, 50, 50, ImageIO.read(new File("img_test.png")));
		
		Scene scene = new Scene();
		scene.ajouter_game_object(c);
		scene.ajouter_game_object(c2);
		scene.ajouter_game_object(texte);
		scene.ajouter_game_object(s);
		
		Fenetre fenetre = new Fenetre(600, 600, "Démo moteur 2D");
		fenetre.charger_scene(scene);
		
		Thread t1 = new Thread(scene);
		t1.start();
		
		while(true)
		{
			try 
			{
				c.deplacer(Direction.BAS);
				c.deplacer(Direction.DROITE);
				texte.set_texte(Math.round(scene.get_fps()) + " FPS");
				Thread.sleep(10);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
