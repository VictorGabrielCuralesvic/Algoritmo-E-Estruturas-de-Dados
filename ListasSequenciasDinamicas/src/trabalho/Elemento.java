package trabalho;

public class Elemento implements ITAD {

    private ITAD tad;
    private Elemento proximo;
    private Elemento anterior;

    @Override
    public ITAD getTAD() {
        return tad;
    }

    public void setTad(ITAD tad) {
        this.tad = tad;
    }

    public Elemento getProximo() {
        return proximo;
    }

    public void setProximo(Elemento proximo) {
        this.proximo = proximo;
    }

    public Elemento getAnterior() {
        return anterior;
    }

    public void setAnterior(Elemento anterior) {
        this.anterior = anterior;
    }

    @Override
    public int getId() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setId(int id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String getCampo01() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void setCampo01(String campo01) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public float getCampo02() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setCampo02(float campo02) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean isCampo03() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void setCampo03(boolean campo03) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
