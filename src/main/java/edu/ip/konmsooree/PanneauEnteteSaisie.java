package edu.ip.konmsooree;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanneauEnteteSaisie extends JPanel{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//declaration des objet du panneau
    JLabel entete;
    
    public PanneauEnteteSaisie(){
        
        //definition des caracteristiques du panneau
        this.setSize(710,100);
        
        
        
        //creation des objets du panneau
        entete=new JLabel("Bons Sooree");
       // JLabel trait=new JLabel("------------------------------------------------------------------------------");
        Font font=new Font("Cambria",Font.BOLD, 30);
        entete.setFont(font);
        
        //ajout des objets au panneau
        this.add(entete);
        //this.add(trait);
        
        
    }
    
}
