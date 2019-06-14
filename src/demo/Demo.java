package demo;

import java.awt.Color;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import moteur.Direction;
import moteur.Fenetre;
import moteur.Scene;
import moteur.objets.Cercle;
import moteur.objets.Texte;

public class Demo 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		System.out.println("Lancement de la démo...");
		
		Texte texte = new Texte("FPS", 10, 20, Color.BLACK, "0 FPS");
		Bonhomme b = new Bonhomme("Le petit bonhomme en mousse", 50, 50, 30, 30, ImageIO.read(new File("img_test.png")));
		BonhommeEvent be = new BonhommeEvent(b);
		
		Scene scene = new Scene();
		scene.ajouter_game_object(texte);
		scene.ajouter_game_object(b);
		
		Fenetre fenetre = new Fenetre(600, 600, "Démo moteur 2D");
		fenetre.charger_scene(scene);
		fenetre.ajouter_key_listener(be);
		
		Thread t1 = new Thread(scene);
		t1.start();
		
		while(true)
		{
			try 
			{
				
				texte.set_texte(Math.round(scene.get_fps()) + " FPS");
				Thread.sleep(0);
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
