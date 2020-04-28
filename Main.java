public class Main
{
	public static void main(String[] args) {
		Coda tail = new Coda();
        int valore;

        System.out.printf("La coda è vuota ? %s\n", tail.controllo() ? "Si" : "No");
        tail.stampa();
        System.out.println();

        
        tail.insert(1);
        
         System.out.printf("La coda è vuota ? %s\n", tail.controllo() ? "Si" : "No");
        tail.stampa();
        System.out.println();

        tail.insert(2);
        
        System.out.printf("La coda è vuota ? %s\n", tail.controllo() ? "Si" : "No");
        tail.stampa();
        System.out.println();
        
        tail.insert(3);
        
        System.out.printf("La coda è vuota ? %s\n", tail.controllo() ? "Si" : "No");
        tail.stampa();
        System.out.println();
        
        tail.insert(4);
        
        System.out.printf("La coda è vuota ? %s\n", tail.controllo() ? "Si" : "No");
        tail.stampa();
        System.out.println();

        
        if (!tail.controllo()) {
            valore = tail.eliminazione();
            System.out.printf("Elemento: %d(uscita)\n", valore);
        }
     
       System.out.printf("La coda è vuota ? %s\n", tail.controllo() ? "Yes" : "No");
        tail.stampa();
        System.out.println();

       if (!tail.controllo()) {
            valore = tail.eliminazione();
            System.out.printf("Elemento: %d(uscita)\n", valore);
        }
     
       System.out.printf("La coda è vuota ? %s\n", tail.controllo() ? "Yes" : "No");
        tail.stampa();
        System.out.println();

    

	}
}
