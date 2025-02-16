package esercizi.lista_vera;

public class Tipo {
    protected  String Nome;
    protected  int Num;
    
    public Tipo(String Nome, int Num) {
        this.Nome = Nome;
        this.Num = Num;
    }

    public boolean isBefore(Tipo other) {
        return this.Num < other.Num;
    }

    public boolean isEqual(Tipo other){
        return this.Num == other.Num && this.Nome.equals(other.Nome);
    }
}
