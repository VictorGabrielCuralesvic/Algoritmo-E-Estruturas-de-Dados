package trabalho;

public class Main {
    public static void main(String[] args) {
        lista2 lista = new lista2();

        System.out.println("---------------------------------------------------------------");
        System.out.println("INSERIR INICIO");
        System.out.println("---------------------------------------------------------------");

        lista.inserirNoInicio(new StreetFighter2());
        System.out.println(lista.print());
        lista.inserirNoInicio(new StreetFighter2());
        System.out.println(lista.print());
        lista.inserirNoInicio(new StreetFighter2());
        System.out.println(lista.print());

        System.out.println("---------------------------------------------------------------");
        System.out.println("INSERIR FIM");
        System.out.println("---------------------------------------------------------------");

        lista.inserirNoFim(new StreetFighter2());
        System.out.println(lista.print());
        lista.inserirNoFim(new StreetFighter2());
        System.out.println(lista.print());
        lista.inserirNoFim(new StreetFighter2());
        System.out.println(lista.print());

        System.out.println("---------------------------------------------------------------");
        System.out.println("INSERIR MEIO");
        System.out.println("---------------------------------------------------------------");

        lista.inserirNoMeio(new StreetFighter2(),2);
        System.out.println(lista.print());
        lista.inserirNoMeio(new StreetFighter2(),4);
        System.out.println(lista.print());


        System.out.println("---------------------------------------------------------------");
        System.out.println("REMOVER INICIO");
        System.out.println("---------------------------------------------------------------");

        lista.removerNoInicio();
        System.out.println(lista.print());

        System.out.println("---------------------------------------------------------------");
        System.out.println("REMOVER FIM");
        System.out.println("---------------------------------------------------------------");


        lista.removerNoFim();
        System.out.println(lista.print());

        System.out.println("---------------------------------------------------------------");
        System.out.println("REMOVER MEIO");
        System.out.println("---------------------------------------------------------------");

        lista.removerNoMeio(2);
        System.out.println(lista.print());
        System.out.println("ITEM REMOVIDO ==> " + lista.getElemento(2));
        lista.removerNoMeio(4);
        System.out.println(lista.print());
        

    }

}

