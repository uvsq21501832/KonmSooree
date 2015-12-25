package edu.ip.konmsooree;

import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PanneauCentreSaisie extends JPanel{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//declaration des objets du panneau
    JLabel destination;
    JLabel sooree;
    JTextField champDestination;
    JTextField champSooree;
    
    public PanneauCentreSaisie(){
        
        //definition des caracteristiques du panneau
        this.setSize(new Dimension(400,190));
        
        //creation des objets du panneau
        //taille des label
        Font font=new Font("",Font.BOLD, 20);
        
        destination=new JLabel("      Destination    ");
        destination.setFont(font);
        sooree=new JLabel("        Sooree     ");
        sooree.setFont(font);
        
       // JLabel trait=new JLabel("------------------------------------------------------------------------------\n");
        font=new Font("Lucida Calligraphy",Font.BOLD, 16);
        champDestination=new JTextField(15);
        champDestination.setFont(font);
        champSooree=new JTextField(15);
        champSooree.setFont(font);
        champDestination.setPreferredSize(new Dimension(300,40));
        champSooree.setPreferredSize(new Dimension(300,40));
        
        this.add(destination);
        this.add(champDestination);
        this.add(sooree);
        this.add(champSooree);
    }
    
}
