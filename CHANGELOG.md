# CHANGELOG

## VERSIONI

### [1.0.0] - Creazione del progetto
* Avvio iniziale del progetto.
* Implementazione delle funzionalità di base del programma:
  * Utilizzo di multithreading per consentire l'esecuzione concorrente dei differenti partecipanti.
  * Definizione della classe `Posto` per rappresentare le sedie.
  * Creazione della classe `Display` per monitorare lo stato delle sedie.
  * Sviluppo della classe `Partecipante` per gestire i thread dei partecipanti.
  * Creazione della classe principale `TestGiocoSedie` per avviare il gioco.

### [1.1.0] - Introduzione della classe Scrittore
* Aggiunta della classe `Scrittore` per salvare i risultati del gioco in un file di testo (Risultato.txt).
* Modifica del metodo `run` nella classe `Partecipante`:
  * Implementazione della funzionalità per registrare l'ID del thread e il posto occupato nel file `risultato.txt`.

### [1.2.0] - Aggiunta della documentazione Javadoc
* Inserimento della documentazione Javadoc per tutte le classi e i metodi:
  * Descrizione complessiva del progetto e delle sue funzionalità.
  * Dettagli sulle classi, i metodi e i vari parametri utilizzati.
  * Miglioramento della leggibilità del codice.
