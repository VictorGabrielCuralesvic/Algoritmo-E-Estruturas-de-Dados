package trabalho;

public class trabalho1 implements ITrabalho01 {

    private ITAD[] equipe;
    private int quantidade = 0;
    private int tamanho;

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public void criaLista(int tamanho) {
        equipe = new StreetFighter[tamanho];
        this.tamanho = equipe.length;
        
    }

    @Override
    public ITAD[] getLista() {
        return equipe;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public ITAD get(int index) {
        ITAD item = equipe[index];
        return item;
    }

    @Override
    public void set(ITAD tad, int index) {
        equipe[index] = tad;
        
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        if (quantidade < tamanho) {
            equipe[quantidade] = tad;
            quantidade++;
        }

    }

    @Override
    public void inserirNoInicio(ITAD tad) {
        if(quantidade < tamanho) {
            for(int i = quantidade; i > 0; i--) {
                equipe[i] = equipe[i - 1];
            }
            equipe[0] = tad;
            quantidade++;
        }
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if(posicao < 0 || posicao >= getQuantidade()) return;
        for(int a = getQuantidade() - 1; a > posicao; a = a - 1) {
            System.out.println("Pondo " + (a - 1) + " em " + a);
            equipe[a] = equipe[a - 1];
        }
        equipe[posicao] = tad;
        quantidade = quantidade + 1;
    }

    @Override
    public ITAD removerNoInicio() {
        ITAD tad = equipe[0];
        for(int i = 0; i < quantidade; i++) {
            if(i + 1 == quantidade){
                equipe[i] = null;
            } else {
                equipe[i] = equipe[i+1];
            }
        }
        quantidade--;
        return tad;
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        if (posicao >= 0 && posicao < quantidade) {
            ITAD tad = equipe[posicao];
            for (int i = posicao; i < quantidade; i++) {
                if (i + 1 == quantidade) {
                    equipe[i] = null;
                } else {
                    equipe[i] = equipe[i + 1];
                }
            }
            quantidade--;
            return tad;
        }
        return null;
    }

    @Override
    public ITAD removerNoFim() {
        return removerNoMeio(quantidade);
    }


    @Override
    public String print() {
        String texto = "[";
        for (int a = 0; a < tamanho; a = a + 1){
            if(equipe[a] != null) {
                texto += equipe[a].print();
            } else {
                texto += "null";
            }
            texto += (a == tamanho - 1)?"]":" -///- ";
        }
        return texto;
    }
}
