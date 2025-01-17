/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import java.util.logging.Logger;

/**
 * Classe principale per simulare il gioco delle sedie.
 * Il programma crea un array di sedie (Posto) e partecipanti, simulando così un gioco
 * in cui i partecipanti cercano di occupare una tra le varie sedie disponibili.
 * Una sedia è rappresentata dalla classe {@link Posto}, mentre i partecipanti vengono gestiti come thread.
 * Un display, invece, visualizza lo stato delle sedie.
 * 
 * @author tommaso pignatta
 */
public class TestGiocoSedie {
    private final static int NUMSEDIE = 15; //Numero di sedie disponibili
    private static Logger logger = Logger.getLogger("GiocoSedie.TestGiocoSedie");
    
    /**
     * Metodo main del programma.
     * Crea un array di sedie e partecipanti, avvia i thread corrispondenti e simula il gioco delle sedie.
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creazione dell'array di sedie
        Posto sedie[] = new Posto[NUMSEDIE];
        

	for (int k = 0; k < sedie.length; k++)
		sedie[k] = new Posto();
        // Creazione e avvio del display
	Display display = new Display(sedie);
	//System.out.println("Sto facendo partire il Display.");
        logger.info("Sto facendo partire il Display.\n");
	display.start();
        // Creazione e avvio dell'array dei partecipanti
	Partecipante array[] = new Partecipante[NUMSEDIE+1];
	for (int i = 0; i < NUMSEDIE + 1; i++) {
		array[i] = new Partecipante(sedie);
                //System.out.println("Sto facendo partire il thread n." + array[i].getId());
                logger.info("Sto facendo partire il thread id: " + array[i].getId()+" name: "+array[i].getId()+"\n");
                array[i].start();
                }
	}
    }
 