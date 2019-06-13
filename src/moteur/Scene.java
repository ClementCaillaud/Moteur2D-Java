package moteur;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

import moteur.objets.GameObject;

public class Scene extends JPanel implements Runnable
{
	private static final long serialVersionUID = -5259680052889543468L;
	private ArrayList<GameObject> listeGameObjects;
	private double fps;
	
	public Scene()
	{
		this.listeGameObjects = new ArrayList<GameObject>();
		this.fps = 0.0;
	}
	
	public void ajouter_game_object(GameObject objet)
	{
		this.listeGameObjects.add(objet);
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		for (GameObject gameObject : listeGameObjects) 
		{
			gameObject.dessiner(g);
		}
	}

	@Override
	public void run() 
	{
		while(true)
		{	
			try 
			{
				long t1 = System.nanoTime();
				repaint();//On redessine la fenêtre
				Thread.sleep(20);//On temporise
				long t2 = System.nanoTime();
				fps = 1.0 / (t2-t1) * 1000000000.0;
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}
	
	public double get_fps()
	{
		return fps;
	}
}
