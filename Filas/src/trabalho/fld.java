package trabalho;

public class fld implements ITrabalho04 {

    private Elemento inc;
    private int qtdd = 0;

    @Override
    public String getEstudante() {
        
        return "Victor Gabriel Vieira Fechine Tavares";

    }

    @Override
    public Elemento getLista() {
       
        return inc;

    }

    @Override
    public int getQuantidade() {
        
        return qtdd;

    }

    @Override
    public void enqueue(ITAD tad) {

        Elemento a = new Elemento();

        a.setTad(tad);

        if  (inc == null) {
            inc = a;
        } else {
            Elemento b = inc;
            while (b.getProximo() != null) {
                b = b.getProximo();
            }
            b.setProximo(a);
        }
        qtdd = qtdd + 1;
    }

    @Override
    public ITAD dequeue() {
        if (inc == null)
        return null;

        ITAD tad = inc.getTad();
        inc = inc.getProximo();
        qtdd = qtdd - 1;
        return tad;
    }

    @Override
    public ITAD consulta() {
        return inc.getTad();
    }

    @Override
    public String print() {
        String a = " - ";
        if (inc == null) {
            a += "null";
        } else {
            Elemento b = inc;

            do {
                a += "(" + b.getTad().print() + ")";
                b = b.getProximo();
            } while (b != null);
        }

        return a;

    }
    
}
