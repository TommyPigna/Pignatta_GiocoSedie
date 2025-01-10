/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe che rappresenta un partecipante al gioco.
 * Ogni partecipante tenta di occupare una sedia.
 * 
 * @author tommaso pignatta
 */
class Partecipante extends Thread

{
	Posto sedie[];
        
        /**
         * Costruttore che inizializza il partecipante con un array di sedie.
         * 
         * @param sedie array di sedie su cui il partecipante tenterà di sedersi
         * 
         */

	public Partecipante(Posto sedie[]) {

		this.sedie = sedie;

	}
        
        /**
         * Metodo eseguito quando il thread parte.
         * 
         * Tenta di occupare una sedia disponibile.
         * 
         */

	public void run() {

		try {
			sleep((int) (Math.random() * 1000));
                        // Tenta di occupare una sedia
			for (int i = 0; i < sedie.length; i++) {
				if (sedie[i].occupa()) {
					System.out.println("Sono il Thread " + this.getName()
							+ ". Sono riuscito a sedermi sul posto " + i);
					return;
				}
			}
                        // Nessuna sedia disponibile
			System.out.println("Sono il Thread " + this.getName()
					+ ". Ho perso :((((");

		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}