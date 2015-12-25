package edu.ip.konmsooree;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanneauBasSaisie extends JPanel{
    
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//declaration des objets du panneau
    JButton kosser;
    JButton annuler;
    JButton fermer;
    
    public PanneauBasSaisie(){
        
        //definition des caracteristiques du panneau
        this.setSize(new Dimension(710,70));
        this.setLayout(new FlowLayout());
        
        //creation des objets du panneau
        kosser=new JButton("Kosser");
        annuler=new JButton("Effacer");
        fermer=new JButton("fermer");
        fermer.setLocation(10, 10);
        
        //ajout des objets au panneau
        this.add(kosser);
        this.add(annuler);
        this.add(fermer);
        
        //enregistrer
        kosser.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
            //recuperation des donnees saisies
            Sooree.destination=KonmSooree.fenSaisie.panneauCentre.champDestination.getText();
            //renvoie du sooree
            KonmSooree.fenSaisie.panneauCentre.champSooree.setText(Sooree.kooser(Sooree.destination));
              }
        });
        
        
        //annuler
        fermer.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        
        
        
        //fermer
        annuler.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
            	KonmSooree.fenSaisie.panneauCentre.champSooree.setText("");
            	KonmSooree.fenSaisie.panneauCentre.champDestination.setText("");
                
            	
            }
        });
        
    }
     @Override
  public void paintComponent(Graphics g){
        
        try{
            Image img=ImageIO.read(new File("ciel.jpg"));
            g.drawImage(img, 0,0, 1200, 100, this);
        }catch(IOException e){
        }
         g.setColor(Color.red);
    }
    
}
