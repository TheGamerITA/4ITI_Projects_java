package esercizi.lista_vera;

public class main {
    public static void main(String[] args) {
        Liste Lista = new Liste();
        Tipo oggetto1 = new Tipo("oggetto", 1);
        Tipo roccia = new Tipo("roccia", 2);
        Tipo nanoDaGiardino = new Tipo("NanoDaGiardino", 3);
        Tipo legno = new Tipo("legno", 4);


        Lista.InserisciDavanti(oggetto1);
        Lista.InserisciDavanti(roccia);
        Lista.printlist();
        Lista.eliminaInTesta();
        Lista.printlist();
        Lista.inserisciInCoda(nanoDaGiardino);
        Lista.inserisciInCoda(legno);
        Lista.printlist();
        Lista.eliminaInCoda();
        Lista.printlist();
        Lista.inserisciInOrdine(legno);
        Lista.printlist();
        Lista.elimina(oggetto1);
        Lista.printlist();
    }
}
