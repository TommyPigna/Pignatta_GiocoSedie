# Gioco delle Sedie 

## DESCRIZIONE
Il programma simula un gioco delle sedie, dove diversi partecipanti cercano di occupare delle sedie disponibili. Ogni partecipante viene eseguito come un thread e cerca di occupare una delle sedie disponibili. Il gioco termina quando tutte le sedie sono occupate. Il programma include anche un display che mostra lo stato corrente delle sedie e registra i risultati in un file di testo.

## COMPONENTI DEL PROGRAMMA

### 1. **Classe `Posto`**
La classe `Posto` rappresenta una singola sedia. Gestisce lo stato di occupazione della sedia, che può essere:
- **Libera**: La sedia non è occupata.
- **Occupata**: La sedia è occupata da un partecipante.

Metodi principali:
- `libero()`: Verifica se il posto è libero.
- `occupa()`: Tenta di occupare il posto, restituendo `true` se l'operazione ha successo, altrimenti `false`.

### 2. **Classe `Partecipante`**
La classe `Partecipante` rappresenta un partecipante al gioco. Ogni partecipante tenta di occupare una sedia. Ogni partecipante è un thread che, dopo un'attesa casuale, tenta di occupare una sedia disponibile.

Metodi principali:
- `run()`: Viene eseguito quando il thread parte. Il partecipante cerca di occupare una sedia, e se ci riesce, scrive nel file di log. Se non trova una sedia disponibile, segnala che ha perso.

### 3. **Classe `Display`**
La classe `Display` è un thread che visualizza continuamente lo stato delle sedie. Ogni volta che aggiorna lo stato, mostra se una sedia è libera o occupata:
- `0` per una sedia libera.
- `*` per una sedia occupata.

Il thread continua a stampare lo stato fino a quando tutte le sedie sono occupate, momento in cui termina il gioco.

### 4. **Classe `Scrittore`**
La classe `Scrittore` è responsabile della scrittura dei risultati in un file di log. Ogni volta che un partecipante si siede su una sedia, la sua azione viene registrata nel file di testo specificato.

Metodi principali:
- `scrivi(long id, int posto)`: Scrive nel file di testo che il partecipante con l'ID `id` ha occupato la sedia `posto`.

### 5. **Classe `TestGiocoSedie`**
La classe principale del programma. Inizializza un array di sedie, crea e avvia i partecipanti come thread, e avvia anche il thread del display che visualizzerà lo stato delle sedie.

## COME FUNZIONA

1. **Inizializzazione**: Il programma crea un array di oggetti `Posto` (sedie). Ogni partecipante è un thread che cerca di occupare una sedia.
2. **Display**: Un thread separato visualizza lo stato corrente delle sedie, stampando "0" per le sedie libere e "*" per quelle occupate.
3. **Partecipanti**: Ogni partecipante (thread) tenta di sedersi. Se una sedia è disponibile, il partecipante la occupa e scrive il risultato in un file di log. Se non trova una sedia, segnala che ha perso.
4. **Fine del Gioco**: Il gioco termina quando tutte le sedie sono occupate. Il display si ferma e i partecipanti che non sono riusciti a sedersi vengono informati della loro sconfitta.

## ESECUZIONE

Per eseguire il programma, è sufficiente compilare ed eseguire la classe `TestGiocoSedie`.

1. Compilare tutte le classi nel progetto.
2. Eseguire la classe `TestGiocoSedie`.

### Esempio di esecuzione:
Sto facendo partire il Display. Sto facendo partire il thread id: 1 name: 1 Sto facendo partire il thread id: 2 name: 2 ... Sono il Thread 1. Sono riuscito a sedermi sul posto 5 Sono il Thread 2. Sono riuscito a sedermi sul posto 3 ...

### File di Log:
Ogni partecipante che occupa una sedia scrive il proprio ID e il posto occupato nel file `Risultato.txt`:
Il Thread 1 occupa il posto 5. Il Thread 2 occupa il posto 3. ...

## REQUISITI

- JDK 8 o superiore per compilare ed eseguire il programma.
- Un ambiente di sviluppo Java come IntelliJ IDEA, Eclipse o una configurazione a riga di comando.

## CONSIDERAZIONI

- Il programma utilizza thread per simulare il gioco delle sedie, il che significa che il comportamento potrebbe variare a causa dell'esecuzione concorrente.
- La sincronizzazione è utilizzata per gestire correttamente l'accesso concorrente alle sedie.
  
## AUTORE

Questo programma è stato sviluppato da **TOMMASO PIGNATTA**.
