/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pandora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author 
 */
public class Pandora {

    /**
     * @param args the command line arguments
     */
    // TODO code application logic here
        JFrame frame; //Déclaration de la fenêtre
        JFrame frame2;
        JFrame frame3;
        JFrame frame4;
        JFrame frame4bis;
        JFrame frame5;
        JFrame frame5bis;
        JFrame frame6;
        JFrame frame7;
        JFrame frame8;
        JFrame frame9;
        JFrame frame10;
        JFrame frame11;
        

        // Déclaration des chemins de tous les images utilisées 
        private static final String intro = "/pandora/introduction_forêt.jpg";
        private static final String foret = "/pandora/forêt.jpg";
        private static final String entreeCabane = "/pandora/cabane_fermee.jpg";
        private static final String entreeGrotte = "/pandora/grotte_entree.jpg";
        private static final String grotte ="/pandora/grotte.jpg";
        private static final String cabane = "/pandora/cabane-int.jpg";
        private static final String foretAraignee = "/pandora/forêt-araignee.jpg";
        private static final String mine = "/pandora/mine.jpg";
        private static final String foretSanglier = "/pandora/forêt-sanglier.jpg";
        private static final String clairiere = "/pandora/clairiere.jpg";
        private static final String mur = "/pandora/mur.jpg";
        private static final String foretBoss = "/pandora/boss_foret.jpg";
        private static final String jardin = "/pandora/maison.jpg";
        private static final String entreeMaisonChien = "/pandora/entree_maison.jpg";
        private static final String miroir = "/pandora/miroir.jpg";
        private static final String entreeMaisonVide = "/pandora/entree_maison_vide.jpg";
        private static final String acide = "/pandora/salle_acide.jpg";
        private static final String salleCommune = "/pandora/piece_commune.jpg";
        private static final String caveFermee = "/pandora/porte_cave_fermee.jpg";
        private static final String couloir = "/pandora/couloir.jpg";
        private static final String biblio = "/pandora/biblio.jpg";
        private static final String livre = "/pandora/livre.jpg";
        private static final String bossMaison = "/pandora/boss_maison.jpg";
        private static final String parchemin = "/pandora/parchemin.jpg";
        private static final String bossCave = "/pandora/boss_cave.jpg";
        private static final String cave = "/pandora/cave_nounours.jpg";
        private static final String fin = "/pandora/fin.jpg";

        public Pandora(){  
            
            // Création du bouton pour quitter le jeu depuis le menu de départ
            JButton button = new JButton("Quit"); // création du bouton
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose(); //ferme la fenêtre
                }
            });
            
            // Création du bouton pour commencer le jeu
            JButton buttonS = new JButton("Start"); //création bouton start
            buttonS.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame.dispose(); // rend invisible le menu
                    frame2.setVisible(true); // rend visible la première pièce du jeu
                    
                }
            });
            
            // Création du panel pour le menu de départ
            JPanel panel = new JPanel(); //création du panel
            panel.setBackground(Color.white); //fond du panel
            panel.setLayout(null);
            panel.add(button); //ajout du bouton quit dans le panel
            panel.add(buttonS); // ajout du bouton start dans le panel
            
            // Caractéristiques des boutons du menu
            button.setBounds(325, 250, 120, 40); //placer le bouton, sa taille (x, y, largeur, hauteur)
            button.setBackground(new java.awt.Color(182, 102, 210)); //couleur du bouton
            buttonS.setBounds(325, 200, 120, 40);
            buttonS.setBackground(new java.awt.Color(182, 102, 210));
            
            // Création d'un label pour charger une image
            JLabel lab = new javax.swing.JLabel(); //création label
            lab.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/logo_jeux.jpg"))); //import de l'image dans le label
            panel.add(lab); //ajout du label dans le panel
            lab.setBounds(125, 0, 500, 200); // taille et placement du label
            
            // Caractéristiques de la fenêtre du menu de départ
            frame = new JFrame(); // nouvelle fenêtre
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame.add(panel); // ajout du panel dans la fenêtre
            frame.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame.pack();
            frame.setLocation(200,200); //localisation de la fenêtre
            frame.setVisible(true); //fenêtre visible
            
//-----------------------------------------2eme fenetre introduction----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonBas = new JButton();   
            
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel2 = new JPanel();
            panel2.setVisible(true);
            panel2.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab2 = new JLabel();
            lab2.setIcon(new javax.swing.ImageIcon(getClass().getResource(intro))); // chargement de l'image d'intro
            
            // Quand on clique sur le bouton bas 
            boutonBas.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame2.dispose();
                    frame3.setVisible(true);
                }
            });
                        
            // Ajout des boutons de direction dans le panel
            panel2.add(boutonBas); 
            
            // Création de JscrollPane pour pouvoir ajouter une zone de texte
            JScrollPane text = new JScrollPane();
            panel2.add(text);
            text.setBounds(175, 150, 400, 100);
            
            JLabel zoneTexte = new JLabel();
            zoneTexte.setText("<html>You are a lost little girl that wakes up in a dark forest.<br> Someone left her here. <br> You must find your way through…</html>");
            zoneTexte.setHorizontalAlignment(SwingConstants.CENTER);
            text.setViewportView(zoneTexte);
            
            panel2.add(lab2); //ajout du label dans le panel
            lab2.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonBas.setBounds(350, 335, 50, 50); 
            boutonBas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheBas.jpg"))); // chargement de l'image pour le bouton            

			//Caractéristiques de la fenêtre 
            frame2 = new JFrame();
            frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame2.add(panel2); // ajout du panel dans la fenêtre          
            frame2.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame2.pack();
            frame2.setLocation(200,200); //localisation de la fenêtre
			
//-----------------------------------------3eme fenetre foret----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonBas3 = new JButton();  
            JButton boutonDroit3 = new JButton(); 
            JButton boutonGauche3 = new JButton(); 
            JButton boutonHaut3 = new JButton();
            
            //Création de boutons objets
            JButton boutonBriquet = new JButton();
            JButton boutonCouteau = new JButton();
            
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel3 = new JPanel();
            panel3.setVisible(true);
            panel3.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab3 = new JLabel();
            lab3.setIcon(new javax.swing.ImageIcon(getClass().getResource(foret))); // chargement de l'image d'intro
            
            // Quand on clique sur le bouton bas 
            boutonBas3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame3.dispose();
                    frame6.setVisible(true);
                }
            });
//            
//            // Quand on clique sur le bouton gauche 
            boutonGauche3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame3.dispose();
                    frame5.setVisible(true);
                }
            });
            
            // Quand on clique sur le bouton droit
            boutonDroit3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame3.dispose();
                    frame4.setVisible(true);
                }
            });
            
            //Quand on clique sur le bouton haut
            boutonHaut3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    frame3.dispose();
                    frame2.setVisible(true);
                }
            });
                        
            // Ajout des boutons de direction dans le panel
            panel3.add(boutonBas3); 
            panel3.add(boutonDroit3); 
            panel3.add(boutonGauche3);
            panel3.add(boutonBriquet);
            panel3.add(boutonCouteau);
            panel3.add(boutonHaut3);
            
            panel3.add(lab3); //ajout du label dans le panel
            lab3.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonBas3.setBounds(350, 335, 50, 50); 
            boutonBas3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheBas.jpg"))); // chargement de l'image pour le bouton
            boutonDroit3.setBounds(680, 175, 50, 50); 
            boutonDroit3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheDroite.jpg")));
            boutonGauche3.setBounds(5, 175, 50, 50); 
            boutonGauche3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheGauche.jpg")));
            boutonHaut3.setBounds(350, 5, 50, 50); 
            boutonHaut3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheHaut.jpg")));
            
            boutonBriquet.setBounds(250, 335, 36, 50); 
            boutonBriquet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/lighter.jpg")));
            boutonCouteau.setBounds(550, 335, 110, 30); 
            boutonCouteau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/knife.jpg")));

			//Caractéristiques de la fenêtre 
            frame3 = new JFrame();
            frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame3.add(panel3); // ajout du panel dans la fenêtre          
            frame3.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame3.pack();
            frame3.setLocation(200,200); //localisation de la fenêtre
        
//-----------------------------------------4eme fenetre entree grotte----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonGauche4 = new JButton(); 
            
            JButton boutonOk = new JButton("OK");
            
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel4 = new JPanel();
            panel4.setVisible(true);
            panel4.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab4 = new JLabel();
            lab4.setIcon(new javax.swing.ImageIcon(getClass().getResource(entreeGrotte))); // chargement de l'image d'intro
                        
            // Quand on clique sur le bouton droit
            boutonGauche4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame4.dispose();
                    frame3.setVisible(true);
                }
            });
            
            boutonOk.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame4.dispose();
                    frame4bis.setVisible(true);
                }
            });
            
            // Création de JscrollPane pour pouvoir ajouter une zone de texte
            JScrollPane text4 = new JScrollPane();
            panel4.add(text4);
            text4.setBounds(300, 125, 200, 50);
            
            JLabel zoneTexte4 = new JLabel();
            zoneTexte4.setText("Would you like to use lighter ?");
            zoneTexte4.setHorizontalAlignment(SwingConstants.CENTER);
            text4.setViewportView(zoneTexte4);
            
            JRadioButton radioBoutonYes = new JRadioButton();
            radioBoutonYes.setText("Yes");
            panel4.add(radioBoutonYes);
            radioBoutonYes.setBounds(300, 200, 80, 23);
            
            JRadioButton radioBoutonNo = new JRadioButton();
            radioBoutonNo.setText("No");
            panel4.add(radioBoutonNo);
            radioBoutonNo.setBounds(400, 200, 80, 23);
                        
            // Ajout des boutons de direction dans le panel
            panel4.add(boutonGauche4); 
            panel4.add(boutonOk);
            
            panel4.add(lab4); //ajout du label dans le panel
            lab4.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonGauche4.setBounds(5, 175, 50, 50); 
            boutonGauche4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheGauche.jpg")));
            boutonOk.setBounds(325, 250, 100, 40); 

			//Caractéristiques de la fenêtre 
            frame4 = new JFrame();
            frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame4.add(panel4); // ajout du panel dans la fenêtre          
            frame4.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame4.pack();
            frame4.setLocation(200,200); //localisation de la fenêtre
      
//-----------------------------------------4eme bis fenetre intérieur grotte----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonBas4bis = new JButton(); 
            JButton boutonMainClef = new JButton();
                        
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel4bis = new JPanel();
            panel4bis.setVisible(true);
            panel4bis.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab4bis = new JLabel();
            lab4bis.setIcon(new javax.swing.ImageIcon(getClass().getResource(grotte))); // chargement de l'image d'intro
                        
            // Quand on clique sur le bouton droit
            boutonBas4bis.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame4bis.dispose();
                    frame4.setVisible(true);
                }
            });     
            
            // Quand on clique sur la main avec la clé
            boutonBas4bis.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    
                }
            });
            
            // Ajout des boutons de direction dans le panel
            panel4bis.add(boutonBas4bis);
            panel4bis.add(boutonMainClef);
            
            panel4bis.add(lab4bis); //ajout du label dans le panel
            lab4bis.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonBas4bis.setBounds(350, 335, 50, 50); 
            boutonBas4bis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheBas.jpg")));
            boutonMainClef.setBounds(550, 250, 50, 35); 
            boutonMainClef.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/hand_key.jpg")));

			//Caractéristiques de la fenêtre 
            frame4bis = new JFrame();
            frame4bis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame4bis.add(panel4bis); // ajout du panel dans la fenêtre          
            frame4bis.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame4bis.pack();
            frame4bis.setLocation(200,200); //localisation de la fenêtre
            
//-----------------------------------------5eme fenetre cabane intérieur----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonDroit5 = new JButton(); 
            JButton boutonGun = new JButton();
                        
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel5 = new JPanel();
            panel5.setVisible(true);
            panel5.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab5 = new JLabel();
            lab5.setIcon(new javax.swing.ImageIcon(getClass().getResource(cabane))); // chargement de l'image d'intro
                        
            // Quand on clique sur le bouton droit
            boutonDroit5.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame5.dispose();
                    frame3.setVisible(true);
                }
            });     
                        
            // Ajout des boutons de direction dans le panel
            panel5.add(boutonDroit5);
            panel5.add(boutonGun);
            
            panel5.add(lab5); //ajout du label dans le panel
            lab5.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonDroit5.setBounds(680, 175, 50, 50); 
            boutonDroit5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheDroite.jpg")));
            boutonGun.setBounds(400, 350, 97, 46);
            boutonGun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/gun.jpg")));

            //Caractéristiques de la fenêtre 
            frame5 = new JFrame();
            frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame5.add(panel5); // ajout du panel dans la fenêtre          
            frame5.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame5.pack();
            frame5.setLocation(200,200); //localisation de la fenêtre
            
//-----------------------------------------6eme fenetre foret attaque araignées----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonGauche6 = new JButton(); 
            JButton boutonBas6 = new JButton();
            JButton boutonHaut6 = new JButton();
                        
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel6 = new JPanel();
            panel6.setVisible(true);
            panel6.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab6 = new JLabel();
            lab6.setIcon(new javax.swing.ImageIcon(getClass().getResource(foretAraignee))); // chargement de l'image d'intro
                        
            // Quand on clique sur le bouton gauche
            boutonGauche6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame6.dispose();
                    frame7.setVisible(true);
                }
            }); 
            
            // Quand on clique sur le bouton bas
            boutonBas6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame6.dispose();
                    frame8.setVisible(true);
                }
            });
            
            //Quand on clique sur le bouton haut
            boutonHaut6.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame6.dispose();
                    frame3.setVisible(true);
                }
            });
                        
            // Ajout des boutons de direction dans le panel
            panel6.add(boutonGauche6);
            panel6.add(boutonBas6);
            panel6.add(boutonHaut6);
            
            panel6.add(lab6); //ajout du label dans le panel
            lab6.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonBas6.setBounds(350, 335, 50, 50); 
            boutonBas6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheBas.jpg"))); // chargement de l'image pour le bouton
            boutonGauche6.setBounds(5, 175, 50, 50); 
            boutonGauche6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheGauche.jpg")));
            boutonHaut6.setBounds(350, 5, 50, 50); 
            boutonHaut6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheHaut.jpg")));

            //Caractéristiques de la fenêtre 
            frame6 = new JFrame();
            frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame6.add(panel6); // ajout du panel dans la fenêtre          
            frame6.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame6.pack();
            frame6.setLocation(200,200); //localisation de la fenêtre
            
//-----------------------------------------7eme fenetre mine----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonDroit7 = new JButton(); 
            JButton boutonDynamite = new JButton();
                        
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel7 = new JPanel();
            panel7.setVisible(true);
            panel7.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab7 = new JLabel();
            lab7.setIcon(new javax.swing.ImageIcon(getClass().getResource(mine))); // chargement de l'image d'intro
                        
            // Quand on clique sur le bouton droit
            boutonDroit7.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame7.dispose();
                    frame6.setVisible(true);
                }
            });     
                        
            // Ajout des boutons de direction dans le panel
            panel7.add(boutonDroit7);
            panel7.add(boutonDynamite);
            
            panel7.add(lab7); //ajout du label dans le panel
            lab7.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonDroit7.setBounds(680, 175, 50, 50); 
            boutonDroit7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheDroite.jpg")));
            boutonDynamite.setBounds(350, 250, 51, 122); 
            boutonDynamite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/dynamite.jpg")));
            
            //Caractéristiques de la fenêtre 
            frame7 = new JFrame();
            frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame7.add(panel7); // ajout du panel dans la fenêtre          
            frame7.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame7.pack();
            frame7.setLocation(200,200); //localisation de la fenêtre
 
//-----------------------------------------8eme fenetre foret attaque sanglier----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches) 
            JButton boutonBas8 = new JButton();
            JButton boutonHaut8 = new JButton();
                        
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel8 = new JPanel();
            panel8.setVisible(true);
            panel8.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab8 = new JLabel();
            lab8.setIcon(new javax.swing.ImageIcon(getClass().getResource(foretSanglier))); // chargement de l'image d'intro
                        
            // Quand on clique sur le bouton gauche
            boutonBas8.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame8.dispose();
                    frame9.setVisible(true);
                }
            }); 
            
            //Quand on clique sur le bouton haut
            boutonHaut8.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    frame8.dispose();
                    frame6.setVisible(true);
                }
            });
                                    
            // Ajout des boutons de direction dans le panel
            panel8.add(boutonBas8);
            panel8.add(boutonHaut8);
            
            panel8.add(lab8); //ajout du label dans le panel
            lab8.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonBas8.setBounds(350, 335, 50, 50); 
            boutonBas8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheBas.jpg"))); // chargement de l'image pour le bouton
            boutonHaut8.setBounds(350, 5, 50, 50); 
            boutonHaut8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheHaut.jpg")));
            
            //Caractéristiques de la fenêtre 
            frame8 = new JFrame();
            frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame8.add(panel8); // ajout du panel dans la fenêtre          
            frame8.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame8.pack();
            frame8.setLocation(200,200); //localisation de la fenêtre
  
//-----------------------------------------7eme fenetre clairiere----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonDroit9 = new JButton(); 
            JButton boutonBas9 = new JButton();
            JButton boutonHaut9 = new JButton();
                        
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel9 = new JPanel();
            panel9.setVisible(true);
            panel9.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab9 = new JLabel();
            lab9.setIcon(new javax.swing.ImageIcon(getClass().getResource(clairiere))); // chargement de l'image d'intro
                        
            // Quand on clique sur le bouton droit
            boutonDroit9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame9.dispose();
                    frame10.setVisible(true);
                }
            });  
            
            // Quand on clique sur le bouton bas
            boutonBas9.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame9.dispose();
                    frame11.setVisible(true);
                }
            });
            
            //Quand on clique sur le bouton haut
            boutonHaut9.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    frame9.dispose();
                    frame8.setVisible(true);
                }
            });
                        
            // Ajout des boutons de direction dans le panel
            panel9.add(boutonDroit9);
            panel9.add(boutonBas9);
            panel9.add(boutonHaut9);
            
            panel9.add(lab9); //ajout du label dans le panel
            lab9.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonDroit9.setBounds(680, 175, 50, 50); 
            boutonDroit9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheDroite.jpg")));
            boutonBas9.setBounds(350, 335, 50, 50); 
            boutonBas9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheBas.jpg")));
            boutonHaut9.setBounds(350, 5, 50, 50); 
            boutonHaut9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheHaut.jpg")));

            //Caractéristiques de la fenêtre 
            frame9 = new JFrame();
            frame9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame9.add(panel9); // ajout du panel dans la fenêtre          
            frame9.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame9.pack();
            frame9.setLocation(200,200); //localisation de la fenêtre
            
//-----------------------------------------10eme fenetre mur----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonGauche10 = new JButton(); 
                        
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel10 = new JPanel();
            panel10.setVisible(true);
            panel10.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab10 = new JLabel();
            lab10.setIcon(new javax.swing.ImageIcon(getClass().getResource(mur))); // chargement de l'image d'intro
                        
            // Quand on clique sur le bouton gauche
            boutonGauche10.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame10.dispose();
                    frame9.setVisible(true);
                }
            }); 
            
            // Ajout des boutons de direction dans le panel
            panel10.add(boutonGauche10);
            
            panel10.add(lab10); //ajout du label dans le panel
            lab10.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonGauche10.setBounds(5, 175, 50, 50); 
            boutonGauche10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheGauche.jpg")));

            //Caractéristiques de la fenêtre 
            frame10 = new JFrame();
            frame10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame10.add(panel10); // ajout du panel dans la fenêtre          
            frame10.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame10.pack();
            frame10.setLocation(200,200); //localisation de la fenêtre
            
//-----------------------------------------6eme fenetre boss foret----------------------------------------------------------------------------------            
            // Création des boutons de direction (flèches)
            JButton boutonDroit11 = new JButton();
            JButton boutonHaut11 = new JButton();
                        
            // Création d'un panel pour la 2ème fenetre 
            JPanel panel11 = new JPanel();
            panel11.setVisible(true);
            panel11.setLayout(null);
            
            // Création d'un label pour charger une image
            JLabel lab11 = new JLabel();
            lab11.setIcon(new javax.swing.ImageIcon(getClass().getResource(foretBoss))); // chargement de l'image d'intro
                                  
            // Quand on clique sur le bouton bas
            boutonDroit11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame11.dispose();
                }
            });
            
            // Quand on clique sur le bouton haut
            boutonHaut11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    frame11.dispose();
                    frame9.setVisible(true);
                }
            });
                        
            // Ajout des boutons de direction dans le panel
            panel11.add(boutonDroit11);
            panel11.add(boutonHaut11);
            
            panel11.add(lab11); //ajout du label dans le panel
            lab11.setBounds(0, 0, 750, 430); // taille et placement du label
            
            // Caractéristiques des boutons de direction
            boutonDroit11.setBounds(680, 175, 50, 50); 
            boutonDroit11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheDroite.jpg")));
            boutonHaut11.setBounds(350, 5, 50, 50); 
            boutonHaut11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pandora/flecheHaut.jpg")));

            //Caractéristiques de la fenêtre 
            frame11 = new JFrame();
            frame11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //pour quitter la fenêtre
            frame11.add(panel11); // ajout du panel dans la fenêtre          
            frame11.setPreferredSize(new Dimension(750, 430)); //dimension de la fenêtre
            frame11.pack();
            frame11.setLocation(200,200); //localisation de la fenêtre
            
        }
    
    public static void main(String[] args) {
        new Pandora();
             
            Room Room1 = new Room("Forest Spawn",1);
            Room Room2 = new Room("Forest crosspath",2);
            Room Room3 = new Room("Hunter Cabin",3);
            Room Room4 = new Room("Spider nest",4);
            Room Room5 = new Room("Forest longway",5);
            Room Room6 = new Room("Forest mine",6);
            Room Room7 = new Room("Forest path",7);

            Room1.addExit("South", Room2);

            Room2.addExit("North", Room1);
            Room2.addExit("South", Room5);
            Room2.addExit("West", Room3);
            Room2.addExit("East", Room4);

            Room3.addExit("East", Room2);

            Room4.addExit("West", Room2);

            Room5.addExit("North", Room2);
            Room5.addExit("South", Room7);
            Room5.addExit("West", Room6);

    }
}
