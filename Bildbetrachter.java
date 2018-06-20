import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

/**
 * Bildbetrachter ist die Hauptklasse der Bildbetrachter-Anwendung. Sie
 * erstellt die GUI der Anwendung, zeigt sie an und initialisiert alle
 * anderen Komponenten.
 * 
 * Erzeugen Sie ein Exemplar dieser Klasse, um die Anwendung zu starten.
 * 
 * @author Michael Kölling und David J Barnes 
 * @version 0.1
 */
public class Bildbetrachter 
{
    private JFrame fenster;
    
    /**
     * Erzeuge einen Bildbetrachter und zeige seine GUI auf
     * dem Bildschirm an.
     */
    public Bildbetrachter()
    {
        fensterErzeugen();
    }
    public void actionPerformed(ActionEvent e)
    {
    // System.out.println("Menueintrag: " + e.getActionCommand());
     /*
     if(e.getActionCommand().equals("open"))
     {
      System.out.println("version 2.1");
      }
     */ 
    }
     
    // ---- Swing-Anteil zum Erzeugen des Fensters mit allen Komponenten ----
    
    /**
     * Erzeuge das Swing-Fenster samt Inhalt.
     */
    private void fensterErzeugen()
    {
        fenster = new JFrame("Bildbetrachter");
        Container contentPane = fenster.getContentPane();
        
        JMenuBar menuzeile = new JMenuBar();
        fenster.setJMenuBar(menuzeile);
        
        
         JMenu datei = new JMenu("datei");
         menuzeile.add(datei);
         
         JMenu Einstellungen = new JMenu("Einstellungen");
         menuzeile.add(Einstellungen);
         
         JMenu hilfe = new JMenu("hilfe");
         menuzeile.add(hilfe);
         
        
        JMenuItem open = new JMenuItem("open");
        //openActionListener offnenActionListener = new openActionListener();
        open.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("offnen ner Datei");
            }
        }
        
        );
        datei.add(open);
        
        JMenuItem startseite = new JMenuItem("startseite");
        //startseiteActionListener startActionListener = new startseiteActionListener()
        startseite.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("hier ist startseite");
            }
        }
        );
        datei.add(startseite);
        
        JMenuItem close = new JMenuItem("close");
        //closeActionListener beendenActionListener = new closeActionListener()
        //close.addActionListener(new closeActionListener()
        
        //als anonyme innere klasse braucht new ActionListener kein nameEeee
        close.addActionListener(new ActionListener()
         {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("close dieser datei");
            }
         });
        datei.add(close); 
        
        JMenuItem klickhier = new JMenuItem("klickhier");
        //startseiteActionListener startActionListener = new startseiteActionListener()
        startseite.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("klick open to start and close to close");
            }
        }
        );
        hilfe.add(klickhier);
        
        //JLabel Label = new JLabel("klick me");
       // contentPane.add(Label);
        
        JButton button = new JButton("please close hier");
        contentPane.add(button);
        
        fenster.pack();
        fenster.setVisible(true);
    }   
    /*////////////////////////////////////////////
     * wird alls oben als anonyme innere klasse geschrieben
     * /////////////////////////////////////////////////////
     * class openActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("offnen ner Datei");
      }
    } 
    class startseiteActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("hier ist startseite");
      }
    }   
    class closeActionListener implements ActionListener
    {
      public void actionPerformed(ActionEvent e)
      {
        System.out.println("close dieser datei");
      }
    } */  
}
