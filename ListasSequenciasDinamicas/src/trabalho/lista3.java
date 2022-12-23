package trabalho;

import java.util.Random;

class StreetFighter3 implements ITAD {

    private int id;
    private String lutadores;
    private boolean especial;

    public StreetFighter3() {
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


public class lista3 implements ITrabalho09 {

    private Elemento cursor;
    private int quantidade = 0;

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public Elemento getLista() {
        return cursor;
    }

    @Override
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public void inserirAntes(ITAD tad) {
        Elemento novo = new Elemento();
        novo.setTad(tad);
        if(cursor == null) {
            cursor = novo;
            cursor.setProximo(novo);
            cursor.setAnterior(novo);
        } else {
            novo.setProximo(cursor);
            novo.setAnterior(cursor.getAnterior());
            Elemento anterior = cursor.getAnterior();
            anterior.setProximo(novo);
            cursor.setAnterior(novo);
        }
        quantidade = quantidade + 1;
        
    }

    @Override
    public void inserirDepois(ITAD tad) {
        Elemento novo = new Elemento();
        novo.setTad(tad);
        if(cursor == null) {
            cursor = novo;
            cursor.setProximo(novo);
            cursor.setAnterior(novo);
        } else {
            novo.setProximo(cursor.getProximo());
            novo.setAnterior(cursor);
            Elemento proximo = cursor.getProximo();
            proximo.setAnterior(novo);
            cursor.setProximo(novo);
        }
        quantidade = quantidade + 1;
    }

    @Override
    public ITAD removeAntes() {
        if(cursor == null) {
            return null;
        }
        if(cursor == cursor.getProximo()) {
            return null;
        }
        ITAD tad = cursor.getTAD();
        Elemento auxiliar = cursor;
        while(auxiliar.getProximo() != cursor) {
            auxiliar = auxiliar.getProximo();
        }
        Elemento anteriorauxiliar = auxiliar.getAnterior();
        anteriorauxiliar.setProximo(auxiliar.getProximo());
        cursor.setAnterior((auxiliar.getAnterior()));
        quantidade = quantidade - 1;
        return tad;
    }

    @Override
    public ITAD removeDepois() {
        if(cursor == null) {
            return null;
        }
        if(cursor == cursor.getProximo()) {
            return null;
        }
        ITAD tad = cursor.getTAD();
        Elemento auxiliar = cursor.getProximo();
        Elemento proximoauxiliar = auxiliar.getProximo();
        cursor.setProximo(proximoauxiliar);
        proximoauxiliar.setAnterior(auxiliar.getAnterior());
        quantidade = quantidade - 1;
        return tad;
    }

    @Override
    public ITAD removeAtual() {
        if(cursor == null) {
            return null;
        }
        if(cursor == cursor.getProximo()) {
            return null;
        }
        ITAD tad = cursor.getTAD();
        Elemento dps = cursor.getProximo();
        Elemento ants = cursor.getAnterior();
        dps.setAnterior(ants);
        ants.setProximo(dps);
        cursor = dps;
        quantidade = quantidade - 1;
        return tad;
    }

    @Override
    public void deslocarCursor(int posicao) {
        while(posicao != 0) {
            if(posicao > 0) {
                cursor = cursor.getProximo();
                posicao = posicao - 1;
            } else {
                cursor = cursor.getAnterior();
                posicao = posicao + 1;
            }
        }
        
    }

    @Override
    public ITAD get() {
        if(cursor == null) {
            return null;
        }
        return cursor.getTAD();
    }

    @Override
    public String print() {
        String texto = "lista" + quantidade;
        if(cursor != null) {
            Elemento ini = cursor;
            do{
                texto += "\n" + ini.getTAD().print();
                ini = ini.getProximo();
            }while(ini != cursor);
        }
        return texto;
    }
    
}
