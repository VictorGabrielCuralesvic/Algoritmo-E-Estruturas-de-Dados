package trabalho;

public class Main {

    public static void main(String[] args) {


    int tamanho = 10;
    
    System.out.println("==================================================================================");
    System.out.println("Lista");
    System.out.println("==================================================================================)");

    ITrabalho01 lista1 = new trabalho1();
    lista1.criaLista(tamanho);

    for (int i = 0; i < tamanho; i++) {
        ITAD tad = new StreetFighter(); 
        lista1.inserirNoFim(tad);
    }

    System.out.println(lista1.print());

    System.out.println("==================================================================================");
    System.out.println("Ordenar Lista(megersort)");
    System.out.println("==================================================================================)");

    ITrabalho14 lista2 = new VictorGabriel14();

    lista2.mergerSort(lista1, 0, tamanho - 1);
    System.out.println(lista1.print());



    /*
    System.out.println("==================================================================================");
    System.out.println("BUSCA LINEAR");
    System.out.println("==================================================================================)");

    ITrabalho10 busca = new jamuelton10();

    busca.linear(lista1, 10);
    System.out.print( busca.linear(lista1, 10).getId());
    */


    /* 
    System.out.println("==================================================================================");
    System.out.println("Ordenar Lista(BubbleSort)");
    System.out.println("==================================================================================)");

    ITrabalho11 Bsort = new Jamuelton11();

    Bsort.bubbleSort(lista1);
    System.out.println(lista1.print());
    */


    /*
    System.out.println("==================================================================================");
    System.out.println("Ordenar Lista(InsertionSort)");
    System.out.println("==================================================================================)");
    
    ITrabalho12 Isort = new Jamuelton12();

    Isort.insertionSort(lista1);
    System.out.println(lista1.print());
    */


    /*
    System.out.println("==================================================================================");
    System.out.println("BUSCA ORDENADA");
    System.out.println("==================================================================================)");

    ITrabalho10 busca = new jamuelton10();

    busca.ordenada(lista1, 10);
    System.out.println( busca.ordenada(lista1, 10).getId());
    */

    
    /*
    System.out.println("==================================================================================");
    System.out.println("BUSCA BINARIA");
    System.out.println("==================================================================================)");

    ITrabalho10 busca = new jamuelton10();

    busca.binaria(lista1, 15);
    System.out.println(busca.binaria(lista1, 15).getId());
    */

    }

   
}
