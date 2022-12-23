package trabalho;

import java.util.Random;

public class StreetFighter implements ITAD {

    private int id;
    private String personagem;
    private float poderacumulado;
    private boolean habilidadespecial;

    public StreetFighter() {

        Random r = new Random();

        String[] personagens = {"Ryu","Chun-Li","Cammy","Sakura","Juri","Ken"};
        String[] paises = {"Japão","China","Reino Unido","Japão","Coreia","EUA"};
        String[] estilos = {"Ansatsuken","Kung Fu","Shadaloo","Kanzuki-ryu","Taekwondo","Ansatsuken"};
        id = r.nextInt( 100000);
        personagem = personagens[r.nextInt(personagens.length)] + paises[r.nextInt(paises.length)] + estilos[r.nextInt(estilos.length)];
        poderacumulado = r.nextInt(50) + r.nextFloat();
        habilidadespecial = r.nextBoolean();


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
        return personagem;
    }

    @Override
    public void setCampo01(String campo01) {
        this.personagem = campo01;
    }

    @Override
    public float getCampo02() {
        return poderacumulado;
    }

    @Override
    public void setCampo02(float campo02) {
        this.poderacumulado = campo02;
    }

    @Override
    public boolean isCampo03() {
        return habilidadespecial;
    }

    @Override
    public void setCampo03(boolean campo03) {
        this.habilidadespecial = campo03;
    }

    @Override
    public String print() {
        return String.format("id:%d, personagem:%s, poderacumulado:%.2f, habilidadespecial:%b",getId(), getCampo01(), getCampo02(), isCampo03());

    }
    
}
