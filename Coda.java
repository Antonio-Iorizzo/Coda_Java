class Coda {
    private Nodo head;
    private Nodo tail;
    private int counter;

    public Coda() {
        this.counter = 0;
        this.head = null;
        this.tail = null;
    }

    public boolean controllo() {
        return this.counter == 0;
    }

    public int size() {
        return this.counter;
    }

    public void stampa()
    {
        Nodo n = this.head;

        System.out.printf("[%d] ", this.size());

        while (n != null) {
            System.out.printf("%d-->", n.val);
            n = n.next;
        }
        System.out.printf("NULL\n");
    }

    public void insert(int val)
    {
        Nodo n = new Nodo(val);

        this.counter++;

        if (this.head == null) {
            this.head = n;
        } else {
            this.tail.next = n;
        }

        this.tail = n;
    }

   
    public int eliminazione()
    {
        int val;

        val = this.head.val;

        this.head = this.head.next;

        if (this.head == null) {
            this.tail = null;
        }

        this.counter--;

        return val;
    }
};