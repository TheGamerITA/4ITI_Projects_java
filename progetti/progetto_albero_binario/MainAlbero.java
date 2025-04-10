import java.util.Scanner;

public class MainAlbero {
    public static void main(String[] args) {

        AlberoBinario albero = new AlberoBinario(new NodoAlberoBinario(new Tipo("A"))); 
        NodoAlberoBinario radice = albero.getPtr();
        radice.setLeftChild(new NodoAlberoBinario(new Tipo("B")));
        radice.setRightChild(new NodoAlberoBinario(new Tipo("C")));

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("\nCosa vuoi fare?");
            System.out.println("1. Inserisci un nodo");
            System.out.println("2. Visita anticipata");
            System.out.println("3. Visita simmetrica");
            System.out.println("4. Visita differita");
            System.out.println("5. Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine();

            switch (scelta) {
                case 1:
                    System.out.print("Scrivi la lettera che vuoi mettere:");
                    String valoreNuovo = scanner.nextLine();// Chiede la lettera all'utente
                    albero.inserisciNodoRicorsivo(new Tipo(valoreNuovo));
                    System.out.println("Ho aggiunto '" + valoreNuovo + "' all'albero!");
                    break;
                case 2:
                    System.out.println("\nVisita anticipata:");
                    albero.vistaAnticipata();
                    break;
                case 3:
                    System.out.println("\nVista Simmetrica:");
                    albero.vistaSimmetrica();
                    break;
                case 4:
                    System.out.println("\nVisita differita:");
                    albero.vistaDifferita();
                    break;
                case 5:
                    scanner.close();
                    break;
        
                default:
                    System.out.println("scelta non valida");
                    break;
            }
        }
    }
}