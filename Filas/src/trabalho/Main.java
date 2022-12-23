package trabalho;

public class Main {

    public static void main(String[] args) {
        
        fle pe = new fle();
        pe.criaLista(5);
        System.out.println(pe.print());

        pe.enqueue(new STRF());
        System.out.println(pe.print());
        pe.enqueue(new STRF());
        System.out.println(pe.print());
        pe.enqueue(new STRF());
        System.out.println(pe.print());

        STRF a;
        a = (STRF) pe.dequeue();
        System.out.println(a.getCampo01());
        a = (STRF) pe.dequeue();
        System.out.println(a.getCampo01());

        pe.enqueue(new STRF());
        System.out.println( pe.print());
        pe.enqueue(new STRF());
        System.out.println( pe.print());
        pe.enqueue(new STRF());
        System.out.println( pe.print());

        a = (STRF) pe.dequeue();
        System.out.println(a.getCampo01());
        a = (STRF)  pe.dequeue();
        System.out.println(a.getCampo01());


    }
    
}
