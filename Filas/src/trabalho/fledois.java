package trabalho;

public class fledois implements ITrabalho05 {

    private ITAD[] personagens;
    private int qttd = 0;

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public ITAD[] criaLista(int tamanho) {
        personagens = new STRF[tamanho];
        
        return null;
    }

    @Override
    public int getQuantidade() {
        return qttd;
    }

    @Override
    public void push(ITAD tad) {
        if (qttd == personagens.length) return;
        personagens[qttd] = tad;
        
        qttd = qttd + 1;
        
    }

    @Override
    public ITAD pop() {
        if (qttd == 0) return null;
        ITAD tad = personagens[qttd - 1];
        personagens[qttd - 1] = null;
       
        qttd = qttd - 1;

        return tad;
    }

    @Override
    public ITAD consulta() {
        return personagens[qttd - 1];
    }

    @Override
    public String print() {
        String a = " - ";
        for (int b = 0; b < personagens.length; b = b + 1) {
            if (personagens[b] == null) {
                a += "[null]";
            } else {
                a += "(" + personagens[b].print() + ")";
            }
        }
        
        return a;

    }
    
}
