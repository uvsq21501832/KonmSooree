package edu.ip.konmsooree;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

public class InterfaceSaisie extends JFrame{
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//declaration du panneau principal
    Container panneauPrincipal;
    
    //declaration des panneaux
    PanneauEnteteSaisie panneauEntete;
    PanneauCentreSaisie panneauCentre;
    PanneauBasSaisie panneauBas;
    
    public InterfaceSaisie(){
        
        this.setSize(410, 270);
        
        //creation du panneau prinipal
        panneauPrincipal=this.getContentPane();
        panneauPrincipal.setLayout(new BorderLayout());
        
        //creation des autres panneaux 
        panneauEntete=new PanneauEnteteSaisie();
        panneauCentre=new PanneauCentreSaisie();
        panneauBas=new PanneauBasSaisie();
        
        
        //ajout des aux panneaux au panneau principal
        panneauPrincipal.add(panneauEntete,BorderLayout.NORTH);
        panneauPrincipal.add(panneauCentre,BorderLayout.CENTER);
        panneauPrincipal.add(panneauBas,BorderLayout.SOUTH);
        
        
        //definition des proprietés de la fenetre
        this.setResizable(false);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
}
