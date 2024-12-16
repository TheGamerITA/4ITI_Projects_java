public class contoCorrente {
    protected String nomeProprietario;
    protected int saldo;
    protected int risparmio;
    
    public contoCorrente(String nomeProprietario, int saldoAttuale) {
        this.nomeProprietario = nomeProprietario;
        this.saldo = saldoAttuale;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }

    public void deposita(int importa){
        if(importa > 0){
            saldo += importa;
            System.out.println("Hai depositato correttamente: " + importa);
        }else{
            System.out.println("L'importo deve essere superiore a 0");
        }
    }

    public void preleva(int importo){
        if (importo <= 0){
            System.out.println("Il prelievo deve essere superiore a 0");
        }else{
            if (importo <= saldo) {
                saldo -= importo;
                System.out.println("Hai prelevato correttamente: " + importo);
            }else{
                System.out.println("Fondi insufficenti");
            } 
        }
    }
}
