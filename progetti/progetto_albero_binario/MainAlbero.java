package PROGETTI.PROGETTO3.AlberoBinario;

public class MainAlbero {
    public static void main(String[] args) {
        Tipo rootValue = new Tipo("Radice");// Creiamo i nodi
        NodoAlberoBinario radice = new NodoAlberoBinario(rootValue);

        NodoAlberoBinario sinistro = new NodoAlberoBinario(new Tipo("Sinistro"));
        NodoAlberoBinario destro = new NodoAlberoBinario(new Tipo("Destro"));

        radice.setLeftChild(sinistro);// Assegniamo il figlio sinistro alla radice
        radice.setRightChild(destro);// Assegniamo il figlio destro alla radice

        sinistro.setLeftChild(new NodoAlberoBinario(new Tipo("Sinistro-Sinistro")));// Aggiungiamo un nuovo livello Sinistro-Sinistro
        sinistro.setRightChild(new NodoAlberoBinario(new Tipo("Sinistro-Destro")));// Aggiungiamo un nuovo livello Sinistro-Destro

        destro.setLeftChild(new NodoAlberoBinario(new Tipo("Destro-Sinistro")));
        destro.setRightChild(new NodoAlberoBinario(new Tipo("Destro-Destro")));

        AlberoBinario albero = new AlberoBinario(radice);// Creiamo l'albero

        System.out.println("Vista anticipata (preorder):");
        albero.vistaAnticipata();

        System.out.println("\nVista differita (postorder):");
        albero.vistaDifferita();
    }
}
