package trabalho;

import java.util.Random;

public class StreetFighter2 implements ITAD {

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
