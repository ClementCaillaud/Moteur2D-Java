package moteur;

import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Fenetre extends JFrame
{
	private static final long serialVersionUID = -8795452591197129040L;

	public Fenetre(int tailleX, int tailleY, String nom)
	{
		super();
		setTitle(nom); //On donne un titre à l'application
		setSize(tailleX, tailleY); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(true); //On autorise le redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setVisible(true);
	}
	
	/**
	 * Charger une scène dans la fenêtre
	 * @param scene
	 */
	public void charger_scene(Scene scene)
	{
		setContentPane(scene);//On définit le content pane
	}
	
	public void ajouter_key_listener(KeyListener kl)
	{
		addKeyListener(kl);
	}
}
