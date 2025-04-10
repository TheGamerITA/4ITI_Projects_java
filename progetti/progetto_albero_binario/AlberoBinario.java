public class AlberoBinario {
    protected NodoAlberoBinario ptr;//nodo della radice
    public AlberoBinario(NodoAlberoBinario radice) {
        this.ptr = radice;
    }

    public NodoAlberoBinario getPtr() {
        return ptr;
    }

    private void vistaAnticipata(NodoAlberoBinario p){ //metodo ricorsico che usiamo per attraversare l'albero in ordine anticipato
        if(p == null)
            return;
        p.getInfo().esamina(); //Una volta che si ottiene il valore di getInfo invochiamo il metodo esamina 
        if(p.getLeftChild() != null)
            vistaAnticipata(p.getLeftChild()); //figlio destro
        if(p.getRightChild() != null)
            vistaAnticipata(p.getRightChild());//figlio sinistro
    }

    public void vistaAnticipata() {
        vistaAnticipata(ptr);
    }

    private void vistaDifferita(NodoAlberoBinario p){ //metodo ricorsico che usiamo per attraversare l'albero in ordine differito
        if(p == null)
            return;
        if(p.getLeftChild() != null)
            vistaDifferita(p.getLeftChild());//figlio destro
        if(p.getRightChild() != null)
            vistaDifferita(p.getRightChild());//figlio sinistro
        p.getInfo().esamina();//Una volta che si ottiene il valore di getInfo invochiamo il metodo esamina
    }

    public void vistaDifferita(){
        vistaDifferita(ptr);
    }

    private void vistaSimmetrica(NodoAlberoBinario p){
        if(p == null)
            return;
        if(p.getLeftChild() != null)
            vistaSimmetrica(p.getLeftChild());
        esamina(p.getInfo());
        if(p.getRightChild() != null)
            vistaSimmetrica(p.getRightChild());
    }

    public void vistaSimmetrica(){
        vistaSimmetrica(ptr);
    }

    private void esamina(Tipo info) {
        System.out.println("Esaminando: " + info.getValore());
    }

    public void inserisciNodoRicorsivo(Tipo valore) {
        ptr = inserisciRicorsivamente(ptr, new NodoAlberoBinario(valore));
    }

    private NodoAlberoBinario inserisciRicorsivamente(NodoAlberoBinario nodoCorrente, NodoAlberoBinario nuovoNodo) {
        if (nodoCorrente == null) {
            return nuovoNodo; //se viene trovato posto libero allora viene creato il noso
        }

        // Trovato il posto libero decide se metterlo a sinistra o destra
        // Se entrambi i figli sono occupati, prova a scendere ricorsivamente andando a sinistra per semplicità
        if (nodoCorrente.getLeftChild() == null) {
            nodoCorrente.setLeftChild(nuovoNodo);
        } else if (nodoCorrente.getRightChild() == null) {
            nodoCorrente.setRightChild(nuovoNodo);
        } else {
            nodoCorrente.setLeftChild(inserisciRicorsivamente(nodoCorrente.getLeftChild(), nuovoNodo));
        }
        return nodoCorrente;
    }
}
