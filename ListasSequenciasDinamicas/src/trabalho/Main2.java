package trabalho;

public class Main2 {
    public static void main(String[] args) {
        lista3 lista = new lista3();

        

        System.out.println("---------------------------------------------------------------");
        System.out.println("INSERIR ANTES");
        System.out.println("---------------------------------------------------------------");

        lista.inserirAntes(new StreetFighter3());
        System.out.println(lista.print());
        lista.inserirAntes(new StreetFighter3());
        System.out.println(lista.print());
        lista.inserirAntes(new StreetFighter3());
        System.out.println(lista.print());
        lista.inserirAntes(new StreetFighter3());
        System.out.println(lista.print());
        lista.inserirAntes(new StreetFighter3());
        System.out.println(lista.print());

        System.out.println("---------------------------------------------------------------");
        System.out.println("INSERIR DEPOIS");
        System.out.println("---------------------------------------------------------------");

        lista.inserirDepois(new StreetFighter3());
        System.out.println(lista.print());
        lista.inserirDepois(new StreetFighter3());
        System.out.println(lista.print());
        lista.inserirDepois(new StreetFighter3());
        System.out.println(lista.print());
        lista.inserirDepois(new StreetFighter3());
        System.out.println(lista.print());
        lista.inserirDepois(new StreetFighter3());
        System.out.println(lista.print());

        System.out.println("---------------------------------------------------------------");
        System.out.println("REMOVER ANTES");
        System.out.println("---------------------------------------------------------------");

        lista.removeAntes();
        System.out.println(lista.print());
        lista.removeAntes();
        System.out.println(lista.print());
        lista.removeAntes();
        System.out.println(lista.print());
        
        

        System.out.println("---------------------------------------------------------------");
        System.out.println("REMOVER DEPOIS");
        System.out.println("---------------------------------------------------------------");

        lista.removeDepois();
        System.out.println(lista.print());
        lista.removeDepois();
        System.out.println(lista.print());
        lista.removeDepois();
        System.out.println(lista.print());

        System.out.println("---------------------------------------------------------------");
        System.out.println("REMOVER ATUAL");
        System.out.println("---------------------------------------------------------------");

        lista.removeAtual();
        System.out.println(lista.print());
        lista.removeAtual();
        System.out.println(lista.print());
        
        
    }
}
