package esercizi.lista_vera;

public class Nodo {
    private Tipo info;
    private Nodo link;

    public Nodo(Tipo oggetto){
        info = oggetto;
        link = null;
    }

    public Tipo getInfo(){
        return info;
    }

    public void setLink(Nodo link){
        this.link = link;
    }

    public Nodo getLink(){
        return link;
    }
}
