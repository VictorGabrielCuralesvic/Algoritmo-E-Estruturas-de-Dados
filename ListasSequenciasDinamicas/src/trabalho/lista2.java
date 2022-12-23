package trabalho;

import java.util.Random;

class StreetFighter2 implements ITAD {

    private int id;
    private String lutadores;
    private boolean especial;

    public StreetFighter2() {
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


public class lista2 implements ITrabalho08 {

    private Elemento inicio;
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
        if(quantidade == 0) {
            inicio = novo;
            novo.setProximo(novo);
        } else {
            Elemento cursor = inicio;
            while(cursor.getProximo() != inicio) {
                cursor = cursor.getProximo();
            }
            cursor.setProximo(novo);
            novo.setProximo(inicio);
            inicio = novo;
        }
        quantidade += 1;
        
    }

    @Override
    public void inserirNoFim(ITAD tad) {
        Elemento novo = new Elemento();
        novo.setTad(tad);
        if(quantidade == 0) {
            inicio = novo;
            novo.setProximo(novo);
        } else {
            Elemento cursor = inicio;
            while(cursor.getProximo() != inicio) {
                cursor = cursor.getProximo();
            }
            cursor.setProximo(novo);
            novo.setProximo(inicio);
        }
        quantidade += 1;
        
    }

    @Override
    public void inserirNoMeio(ITAD tad, int posicao) {
        if(posicao <= 1) {
            this.inserirNoInicio(tad);
        }
        if(posicao >= quantidade) {
            this.inserirNoFim(tad);
        }
        Elemento novo = new Elemento();
        novo.setTad(tad);
        Elemento cursor = this.inicio;
        Elemento anterior = cursor;
        for(int a = 0; a < posicao; a = a + 1) {
            anterior = cursor;
            cursor = cursor.getProximo();
        }
        novo.setProximo(cursor);
        anterior.setProximo(novo);
        quantidade += 1;
    }

    @Override
    public ITAD removerNoInicio() {
        if(inicio == null) {
            return null;
        }
        if(inicio == inicio.getProximo()) {
            return null;
        }
        ITAD tad = inicio.getTAD();
        Elemento auxiliar = inicio;
        while(auxiliar.getProximo() != inicio) {
            auxiliar = auxiliar.getProximo();
        }
        auxiliar.setProximo(inicio.getProximo());
        inicio = inicio.getProximo();
        quantidade = quantidade - 1;
        return tad;
    }

    @Override
    public ITAD removerNoFim() {
        if(inicio == null) {
            return null;
        }
        if(inicio == inicio.getProximo()) {
            return null;
        }
        ITAD tad = inicio.getTAD();
        Elemento auxiliar = inicio;
        while(auxiliar.getProximo() != inicio) {
            auxiliar = auxiliar.getProximo();
        }
        if(auxiliar == inicio) {
            return null;
        }
        Elemento auxiliardois = inicio;
        while(auxiliardois.getProximo() != auxiliar) {
            auxiliardois = auxiliardois.getProximo();
        }
        auxiliardois.setProximo(auxiliar.getProximo());
        return tad;
    }

    @Override
    public ITAD removerNoMeio(int posicao) {
        if(inicio == null) {
            return null;
        }
        if(inicio == inicio.getProximo()) {
            return null;
        }
        ITAD tad = inicio.getTAD();
        Elemento local = inicio;
        int cursor = 0;
        while(cursor < posicao) {
            local = local.getProximo();
            cursor = cursor + 1;
        };
        Elemento auxiliar = inicio;
        while(auxiliar.getProximo() != local) {
            auxiliar = auxiliar.getProximo();
        }
        auxiliar.setProximo(local.getProximo());
        quantidade = quantidade - 1;
        return tad;
    }

    @Override
    public ITAD get(int posicao) {
        if(posicao < 1 || posicao > quantidade) {
            return null;
        }
        Elemento cursor = inicio;
        for(int a = 1; a < posicao; a = a + 1) {
            cursor = cursor.getProximo();
        }
        return cursor.getTAD();
    }

    @Override
    public Elemento getElemento(int posicao) {
        if(posicao < 1 || posicao > quantidade) {
            return null;
        }
        Elemento auxiliar = inicio;
        while(auxiliar.getProximo() != inicio) {
            auxiliar = auxiliar.getProximo();
        }
        return auxiliar;
    }

    @Override
    public String print() {
        String texto = "lista" + quantidade;
        if(inicio != null) {
            Elemento cursor = inicio;
            do {
                texto += "\n" + cursor.getTAD().print();
                cursor = cursor.getProximo();
            } while(cursor != inicio);
        }
        return texto;
    }
    
}
