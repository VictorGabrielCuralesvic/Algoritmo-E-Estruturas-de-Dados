package trabalho;


import java.util.Random;

class StreetFighter implements ITAD {

    private int id;
    private String lutadores;
    private boolean especial;

    public StreetFighter() {
        Random randomico = new Random();

        String[] lutador = {"Chun-Li","Cammy","Juri","Sakura"};
        lutadores = lutador[randomico.nextInt(lutador.length)];
        especial = randomico.nextBoolean();
        id = randomico.nextInt(100);
    }

    @Override
    public ITAD getTAD() {
        return this;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
        
    }

    @Override
    public String getCampo01() {
        return lutadores;
    }

    @Override
    public void setCampo01(String campo01) {
        this.lutadores = campo01;
        
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
        return especial;
    }

    @Override
    public void setCampo03(boolean campo03) {
        this.especial = campo03;
        
    }

    @Override
    public String print() {
        return String.format("id:%d, lutadores:%s, especial:%b",getId(),getCampo01(),isCampo03());
    }
    
}


public class lista1 implements ITrabalho07 {

    private Elemento inicio;
    private Elemento fim;
    private int quantidade = 0;

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void inserirNoInicio(ITAD tad) {
        Elemento novo = new Elemento();
        novo.setTad(tad);
        if(inicio == null) {
            inicio = novo;
            fim = novo;
        }else{
            novo.setProximo(inicio);
            inicio.setAnterior(novo);
            inicio = novo;
        }
        quantidade = quantidade + 1;
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        Elemento novo = new Elemento();
        novo.setTad(tad);
        if(inicio == null) {
            inicio = novo;
            fim = novo;
        }else{
            novo.setAnterior(fim);
            fim.setProximo(novo);
            fim = novo;
        }
        quantidade = quantidade + 1;
        
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if(posicao < 1 || posicao > quantidade)
        return;

        Elemento novo = new Elemento();
        novo.setTad(tad);
        Elemento auxiliar = inicio;
        int cursor = 1;
        while(cursor < posicao) {
            auxiliar = auxiliar.getProximo();
            cursor = cursor + 1;
        };
        novo.setProximo(auxiliar);
        novo.setAnterior(auxiliar.getAnterior());
        Elemento anterior = auxiliar.getAnterior();
        anterior.setProximo(novo);
        auxiliar.setAnterior(novo);
        quantidade = quantidade + 1;
        
    }

    @Override
    public ITAD removerNoInicio() {
        if(inicio == null)
        return null;
        ITAD tad = inicio.getTAD();
        inicio = inicio.getProximo();
        inicio.setAnterior(null);
        quantidade = quantidade - 1;
        
        return tad;
    }

    @Override
    public ITAD removerNoFim() {
        if(fim == null)
        return null;
        ITAD tad = fim.getTAD();
        fim = fim.getAnterior();
        fim.setProximo(null);
        quantidade = quantidade - 1;

        return tad;
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        if(posicao > quantidade || posicao < 1) {
            return null;
        }
        Elemento auxiliar = inicio;
        int cursor = 0;
        while(cursor < posicao) {
            auxiliar = auxiliar.getProximo();
            cursor = cursor + 1;
        };
        Elemento proximo = auxiliar.getProximo();
        Elemento anterior = auxiliar.getAnterior();

        if(posicao == 0) {
            removerNoInicio();
        }
        if(posicao == quantidade - 1) {
            removerNoFim();
        } else {
            anterior.setProximo(proximo);
            proximo.setAnterior(anterior);
            quantidade = quantidade - 1;
        }
        return auxiliar.getTAD();
    }

    @Override
    public ITAD get(int posicao) {
        if(posicao >= quantidade - 1) {
        return null;
        }
        Elemento auxiliar = null;
        int doinicio = posicao - 0;
        int dofim = quantidade - posicao;
        if(doinicio < dofim) {
            System.out.println("do inicio");
            auxiliar = inicio;
            int cursor = 1;
            while(cursor < posicao) {
                auxiliar = auxiliar.getAnterior();
                cursor = cursor - 1;
            }
        }
        return auxiliar.getTAD();
    }

    @Override
    public Elemento getElemento(int posicao) {
        Elemento auxiliar = inicio;
        int cursor = 0;
        while(cursor < posicao) {
            auxiliar = auxiliar.getProximo();
            cursor = cursor + 1;
        };
        auxiliar.toString();
        return auxiliar;
    }

    @Override
    public String print() {
        String texto = "lista" + quantidade;
        Elemento cursor = inicio;
        while(cursor != null) {
            texto += "\n" + cursor.getTAD().print();
            cursor = cursor.getProximo();
        }
        return texto;
    }
    
}
