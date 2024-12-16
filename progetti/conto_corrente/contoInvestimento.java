public class contoInvestimento extends contoCorrente {
    protected int numeroAzioni; //numero di azioni in cui investi
    protected int soldi; //soldi che guadagni o perdi dagl'investimenti
    protected int percentualeDaInvestire; //percentuale di soldi che hai guadagnato che puoi rinvestire ancora
    protected int percentualeSoldi; //trasforma la percentuale in soldi ovvero da una percentuale a numero
    protected int saldoInvestimenti; //saldo nel account di 1000 euro utilizzato per far avvenire l'eccezione
    
        //to do eccezione se stiamo perdendo troppi soldi in azioni
        public contoInvestimento(String nomeProprietario, int saldoAttuale){
            super(nomeProprietario, saldoAttuale);
            this.saldoInvestimenti = saldoAttuale;
        }
    
        public void investi() throws persiTroppiSoldi{
            numeroAzioni = (int) (Math.random() * 100);
            if((int) (Math.random() * 100) < 50){
                soldi = (int) (Math.random() * 1000); //scelta casuale dei soldi moltiplicata per 1000 almeno da avere numeri con 3 cifre
                
           if(soldi > saldoInvestimenti/2){
                System.out.println("Saldo disponibile: " + saldoInvestimenti + " ---- Saldo Rimanente: " + (saldoInvestimenti-soldi));
                throw new persiTroppiSoldi("Abbiamo perso troppi soldi esattamente: " + soldi + " Euro, piu' del 50% del saldo");
            }
           
            System.out.println("Hai investito in: " + numeroAzioni + " azioni");
            System.out.println("Hai perso: " + soldi + " EURO");
            System.out.println("Puoi rinvestire lo 0% dei soldi guadagnati");
        }else{
            soldi = (int) (Math.random() * 1000); //scelta casuale dei soldi moltiplicata per 1000 almeno da avere numeri con 3 cifre
            percentualeDaInvestire = (int) (Math.random() * 10);
            percentualeSoldi = (soldi * percentualeDaInvestire)/100;
            System.out.println("Hai investito in: " + numeroAzioni + " azioni");
            System.out.println("Hai guadagnato: " + soldi + " EURO");
            System.out.println("Puoi investire il " + percentualeDaInvestire + "% dei soldi guadagnati ovvero " + percentualeSoldi + " Euro");
        }
    }

    public void setSaldoInvestimenti(int saldoInvestimenti) {
        this.saldoInvestimenti = saldoInvestimenti;
    }
}