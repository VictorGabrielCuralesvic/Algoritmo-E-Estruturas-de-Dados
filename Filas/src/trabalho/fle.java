package trabalho;

public class fle implements ITrabalho03 {

    private STRF[] personagens;
    private int inc = 0;
    private int fm = 0;
    private  int qtdd = 0;

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public ITAD[] criaLista(int tamanho) {
        personagens = new STRF[tamanho];
        
        return personagens;
    }

    @Override
    public int getQuantidade() {
        return qtdd;
    }

    @Override
    public void enqueue(ITAD tad) {
        if (qtdd == personagens.length) 
        return;

        fm = fm % personagens.length;
        personagens[fm] = (STRF)tad;
        qtdd = qtdd + 1;
        fm = fm + 1;
    }

    @Override
    public ITAD dequeue() {
        if (qtdd == 0)
        return null;

        inc = inc % personagens.length;
        ITAD tad = personagens[inc];
        personagens[inc] = null;
        qtdd = qtdd - 1;
        inc = inc  + 1;

        return tad;
    }

    @Override
    public ITAD consulta() {
        return personagens[inc];
    }

    @Override
    public String print() {
    String a = " - ";
    for (int b = 0; b < personagens.length; b =  b + 1) {
        if (personagens[b] == null) {
            a += "(null)";

        } else {
            a += "(" + personagens[b].print() + ")";
        }
    }

    return a;
    }
    
}
