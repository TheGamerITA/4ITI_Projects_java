public class MainAlbero {
    public static void main(String[] args) {
        
        NodoAlberoBinario radice = new NodoAlberoBinario(new Tipo("A"));
        NodoAlberoBinario sinistra = new NodoAlberoBinario(new Tipo("B"));
        NodoAlberoBinario destra = new NodoAlberoBinario(new Tipo("C"));

        radice.setLeftChild(sinistra);
        radice.setRightChild(destra);

        System.out.println("Radice: " + radice.getInfo().getValore());
        System.out.println("Figlio sinistro: " + radice.getLeftChild().getInfo().getValore());
        System.out.println("Figlio destro: " + radice.getRightChild().getInfo().getValore());
    }
}

