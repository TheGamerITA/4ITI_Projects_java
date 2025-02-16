package esercizi.lista_vera;

public class Liste {
    private Nodo head;
    private int elementi;
    
    public Liste(){
        head = null;
        elementi = 0;
    }

    public void InserisciDavanti(Tipo oggetto){
        Nodo Nodo2 = new Nodo(oggetto);
        Nodo2.setLink(head);
        head = Nodo2;
        elementi++;
    }

    public void printlist(){
        if(head != null){
            Nodo nC = head;
            while(nC != null){
                System.out.println("Nome: " + nC.getInfo().Nome + " Numero: " + nC.getInfo().Num);
                nC = nC.getLink();
            }
        }else{
            System.out.println("La lista è vuota");
        }
        System.out.println("----------------------------------------------------------");
    }

    public void eliminaInTesta(){
        if(head == null)
            return;
        head = head.getLink();
        elementi--;
    }

    public void eliminaInCoda(){
        if(head == null)
            return;
            if(head.getLink() == null){
            eliminaInTesta();
            }else{
                Nodo p = head, pp = head.getLink();
                while(pp.getLink() != null){
                    p = pp;
                    pp = pp.getLink();
                }
                p.setLink(null);
                elementi--;
            }
    }

    public void inserisciInCoda(Tipo oggetto){
        Nodo p = head;
        Nodo n = new Nodo(oggetto);

        if(p == null){
            InserisciDavanti(oggetto);
        }else{
            while(p.getLink() != null)
                p = p.getLink();

            n.setLink(null);
            p.setLink(n);
            elementi++;
        }
    }

    public void inserisciInOrdine(Tipo info){
        if(head == null){
            InserisciDavanti(info);
        }else{
            if(info.isBefore(head.getInfo())){ //isBefore() verifica se l'oggetto info precede head.getInfo() in un certo ordinamento
                InserisciDavanti(info);
            }else{
                Nodo p = head;
                Nodo pp = head.getLink();
                Nodo n = new Nodo(info);
                while(pp != null && pp.getInfo().isBefore(info)){
                    p = pp;
                    pp = pp.getLink();
                }
                if(pp == null){
                    InserisciDavanti(info);
                }else{
                    n.setLink(pp);
                    p.setLink(n);
                    elementi++;
                }
            }
        }
    }

    public void elimina(Tipo info){
        if(head == null){
            return;
        }else{
            if(head.getInfo().isEqual(info)){ // isEqual(info) confronta se head.getInfo() è uguale a info
                eliminaInTesta();
            }else{
                Nodo p = head, pp = head.getLink();
                while(pp.getLink() != null && !(pp.getInfo().isEqual(info))){
                    p = pp;
                    pp = pp.getLink();
                }
                if(pp.getInfo().isEqual(info)){
                    p.setLink(pp.getLink());
                    elementi--;
                }
            }
        }
    }
}
