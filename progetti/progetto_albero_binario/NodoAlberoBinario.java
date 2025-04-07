public class NodoAlberoBinario {
    protected Tipo info;
    protected NodoAlberoBinario psx;
    protected NodoAlberoBinario pdx;
    
    public NodoAlberoBinario(Tipo info){
        this.info = new Tipo(info);
        psx = null;
        pdx = null;
    }
    
    
    public void setLeftChild(NodoAlberoBinario psx) {
        this.psx = psx;
    }
    
    public NodoAlberoBinario getLeftChild(){
        return psx;
    }

    public void setRightChild(NodoAlberoBinario pdx) {
        this.pdx = pdx;
    }
    
    public NodoAlberoBinario getRightChild() {
        return pdx;
    }
    
    public void setInfo(Tipo info){
        this.info = new Tipo(info);
    }

    public Tipo getInfo(){
        return new Tipo(info);
    }
}