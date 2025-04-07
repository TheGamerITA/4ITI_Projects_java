public class Tipo {
    private String valore;

    public Tipo(String valore) {
        this.valore = valore;
    }

    public Tipo(Tipo altro) {
        this.valore = altro.valore;
    }

    public String getValore() {
        return valore;
    }

    public void esamina() {
        System.out.println("Esaminando: " + valore);
    }
}

