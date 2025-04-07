public class MainAlbero {
    public static void main(String[] args) {

        NodoAlberoBinario radice = new NodoAlberoBinario(new Tipo("A"));
        NodoAlberoBinario sinistro = new NodoAlberoBinario(new Tipo("B"));
        NodoAlberoBinario destro = new NodoAlberoBinario(new Tipo("C"));

        radice.setLeftChild(sinistro);
        radice.setRightChild(destro);

        AlberoBinario albero = new AlberoBinario(radice);

        System.out.println("Vista Simmetrica:");
        albero.vistaSimmetrica();

        System.out.println("\nVisita anticipata:");
        albero.vistaAnticipata();

        System.out.println("\nVisita differita:");
        albero.vistaDifferita();
    }
}