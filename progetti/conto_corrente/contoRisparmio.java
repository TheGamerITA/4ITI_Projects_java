public class contoRisparmio extends contoCorrente{
    protected int risparmi;

    public contoRisparmio(String nomeProprietario, int saldoIniziale) {
        super(nomeProprietario, saldoIniziale);
    }

    public int getRisparmi() {
        return risparmio;
    }
    
    
    public void setRisparmi(int risparmio) {
        this.risparmio = risparmio;
    }
    
    public void risparmia(int importo){
        importo = (int) (saldo * 0.10); //prendiamo il 10% del saldo
        risparmi += importo; //salviamo il totale di quanto abbiamo salvato
        saldo -= importo; //togliamo quanto abbiamo salvato nel saldo
        System.out.println("A questo giro hai messo da parte:" + importo);
        System.out.println("In totale hai messo da parte: " + risparmi);
        System.out.println("In banca hai ancora: " + getSaldo());
    }
}
