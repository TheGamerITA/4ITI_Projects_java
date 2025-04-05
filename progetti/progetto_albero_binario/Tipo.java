public class Tipo {

    public Tipo(Tipo info) {
    }

    protected String valore;
    
    public Tipo(String valore) {
        this.valore = valore;
    }
    
    public String getValore() {
        return valore;
    }

    public void esamina() {
        System.out.println("Esaminando: " + valore);
    }
    
}
