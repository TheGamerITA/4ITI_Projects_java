
import java.util.Scanner;

public class mainBank {
    protected static int importo;
    protected static int risparmio;
    
    public static void main(String[] args) throws persiTroppiSoldi {

        //Utlizzo l'eccezione try-catch per no far temire bruscamente il programma

        try (Scanner scanner = new Scanner(System.in)) {
            contoCorrente conto = new contoCorrente("Lorenzo Neri", 1000);
            contoRisparmio conto2 = new contoRisparmio("Lorenzo Neri", 1000);
            contoInvestimento conto3 = new contoInvestimento("Lorenzo Neri", 1000);

            while(true) {
                System.out.println("Scegli un'opzione: ");
                System.out.println("- 1 - Visualizza Dati");
                System.out.println("- 2 - Deposita");
                System.out.println("- 3 - Preleva");
                System.out.println("- 4 - Controlla Conto Risparmio");
                System.out.println("- 5 - Applica Risparmio");
                System.out.println("- 6 - Investi");
                System.out.println("- 7 - Esci");
                int scelta2 = scanner.nextInt();

                switch (scelta2) {
                    case 1 -> {
                        System.out.println("Saldo attuale: " + conto.getSaldo() + " euro");
                        System.out.println("Nome del proprietario: " + conto.getNomeProprietario());
                    }
                    case 2 -> {
                        System.out.println("Scrivi quanto vuoi depositare: ");
                        importo = scanner.nextInt();
                        conto.deposita(importo);
                    }
                    case 3 -> {
                        System.out.println("Scrivi quanto vuoi prelevare: ");
                        importo = scanner.nextInt();
                        conto.preleva(importo);
                    }
                    case 4 ->{ 
                        System.out.println("Saldo attuale: " + conto2.getSaldo() + " euro");
                        System.out.println("Nome del proprietario dell'account Risparmio: " + conto2.getNomeProprietario());
                    }
                    case 5 ->{
                        conto2.risparmia(importo);
                    }
                    case 6 ->{
                        try {
                            conto3.investi();
                        } catch (persiTroppiSoldi e) {
                            System.out.println(e.getMessage());
                        }
                    }
                    default -> throw new AssertionError();
                }
            }
        } catch (AssertionError e) {
            //forza il lancio dell'eccezione quando un'opzione non valida viene immessa
            System.out.println("Grazie e arrivederci");
        }
    }
}
