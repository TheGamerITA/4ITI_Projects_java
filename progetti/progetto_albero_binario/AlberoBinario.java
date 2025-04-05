public class AlberoBinario {

    public AlberoBinario(NodoAlberoBinario radice) {
    }
    protected NodoAlberoBinario ptr;//nodo della radice

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
}
