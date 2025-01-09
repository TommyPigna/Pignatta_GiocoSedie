/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Classe che rappresenta un posto, ovvero una sedia.
 * 
 * @author tommaso pignatta
 */
class Posto

{
	private boolean occupato; // Indica se la sedia è occupata
        /**
         * Costruttore che inizializza il posto come non occupato.
         */
	public Posto()

	{
		occupato = false;
	}
        
        /**
         * Controlla se il posto è libero.
         * 
         * @return true se è il posto è libero, altrimenti false 
         */

	public synchronized boolean libero() {
		return (!occupato);
	}
        
        /**
         * Tenta di occupare il posto.
         * 
         * @return true se l'occupazione ha successo, altrimenti false se il posto è già stato occupato. 
         */

	public synchronized boolean occupa() {
		if (occupato)
			return false;
		else
			return occupato = true;
	}
}
