package demo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import moteur.Direction;

public class BonhommeEvent implements KeyListener
{
	private Bonhomme b;
	
	public BonhommeEvent(Bonhomme b)
	{
		this.b = b;
	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		int codeDeLaTouche = e.getKeyCode();
		switch (codeDeLaTouche) // Les valeurs sont contenue dans KeyEvent. Elles commencent par VK_ et finissent par le nom de la touche
        {
            case KeyEvent.VK_UP: // si la touche enfoncée est celle du haut
                b.deplacer(Direction.HAUT, b.get_vitesse());
                break;
            case KeyEvent.VK_LEFT: // si la touche enfoncée est celle de gauche
                b.deplacer(Direction.GAUCHE, b.get_vitesse());
                break;
            case KeyEvent.VK_RIGHT: // si la touche enfoncée est celle de droite
            	b.deplacer(Direction.DROITE, b.get_vitesse());
                break;
            case KeyEvent.VK_DOWN: // si la touche enfoncée est celle du bas
            	b.deplacer(Direction.BAS, b.get_vitesse());
                break;
        }
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
