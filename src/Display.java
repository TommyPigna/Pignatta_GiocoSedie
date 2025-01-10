/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe che visualizza lo stato delle sedie.
 * Estende {@link Thread} per aggiornare continuamente lo stato.
 * @author tommaso pignatta
 */
class Display extends Thread

{
	private Posto sedie[];
	private boolean endgame; //Indica se il gioco è terminato

        /** 
         * Costruttore che inizializza il display con un array di sedie.
         * 
         * @param sedie array di sedie da controllare
         * 
         */
        
	public Display(Posto sedie[]) {


		this.sedie = new Posto[sedie.length];

		for (int s = 0; s < sedie.length; s++)
			this.sedie[s] = sedie[s];
	}

        /**
         * Metodo che viene eseguito quando il thread viene avviato.
         * Mostra lo stato delle sedie e verifica se il gioco è terminato
         * 
         */
	public void run() {

		try {
			while (!endgame) {
				int count = 0;

				sleep((int) (Math.random() * 250)); //Il thread viene sospeso per un tempo casuale

				for (int i = 0; i < sedie.length; i++) {
				
					if (sedie[i].libero())
						System.out.print("0"); //La sedia è libera
					else {
						count++;
						System.out.print("*"); //La sedia è occupata
					}
				}
				System.out.println();
                                
                                //Verifica se tutte le sedie sono occupate
                                endgame = (count == sedie.length);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}