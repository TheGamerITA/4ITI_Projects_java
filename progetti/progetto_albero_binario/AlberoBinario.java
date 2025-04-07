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

    public void vistaAnticipata() {//richiamiamo il metodo
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

    public void vistaDifferita(){//richiamiamo il metodo
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
}
