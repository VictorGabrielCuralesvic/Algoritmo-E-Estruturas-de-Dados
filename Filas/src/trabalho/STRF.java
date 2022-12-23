package trabalho;
import java.util.Random;

public class STRF implements ITAD {

    private int id;
    private String lutadores;
    private float poderacumulado;
    private boolean especial;

    public STRF() {
        Random randomico = new Random();

        String[] lutador = {"Chun-Li","Cammy","Juri","Sakura"};
        String[] paises = {"China","Reino Unido","Coreia","Japão"};
        lutadores = lutador[randomico.nextInt(lutador.length)] + paises[randomico.nextInt(paises.length)];
        poderacumulado = randomico.nextInt(1000) + randomico.nextFloat();
        especial = randomico.nextBoolean();
        id = randomico.nextInt(1000);
    }


    @Override
    public ITAD getTAD() {

        return this;

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
        return poderacumulado;
    }

    @Override
    public void setCampo02(float campo02) {
        this.poderacumulado = campo02;
        
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
    public int getId() {
        return id;
    }


    @Override
    public void setId(int id) {
        this.id = id;
        
    }

    @Override
    public String print() {
        return String.format("id:%d, lutadores:%s, poderacumulado:%.2f, especial:%b",getId(), getCampo01(),getCampo02(),isCampo03());
    }

    
}
