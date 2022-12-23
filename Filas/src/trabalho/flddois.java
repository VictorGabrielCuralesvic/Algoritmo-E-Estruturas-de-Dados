package trabalho;

public class flddois implements ITrabalho06 {

    private Elemento inc;
    private int qttd = 0;

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
        return qttd;
    }

    @Override
    public void push(ITAD tad) {
        Elemento a = new Elemento();
        a.setTad(tad);
        if (inc == null) {
            inc = a;
        } else {
            Elemento b = inc;
            while (a.getProximo() != null) {
                b = b.getProximo();
            }

            b.setProximo(a);

        }

        qttd = qttd - 1;
        
    }

    @Override
    public ITAD pop() {
        
        if (inc == null) {
            inc = null;

        }
        Elemento b = inc;
        Elemento antes = inc;
        while (b.getProximo() != null) {
            antes = b;
            b = b.getProximo();
        }
        ITAD tad = b.getTad();
        antes.setProximo(null);

        qttd = qttd - 1;

        return tad;
    }

    @Override
    public ITAD consulta() {
        
        if (inc == null) {
            return null;
        }

        Elemento b = inc;
        while (b.getProximo() != null) {
            b = b.getProximo();
        }
        
        ITAD tad = b.getTad();

        return tad;
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
