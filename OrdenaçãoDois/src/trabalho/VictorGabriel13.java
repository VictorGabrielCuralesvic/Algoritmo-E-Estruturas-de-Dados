package trabalho;

public class VictorGabriel13 implements ITrabalho13{

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public void selectionSort(ITrabalho01 lista) {
        int meno;
        ITAD auxiliar;
        for(int a = 0; a < lista.getQuantidade() - 1; a = a + 1) {
            meno = a;
            for(int b = a + 1; b < lista.getQuantidade(); b = b + 1) {
                if(lista.get(b).getId() < lista.get(meno).getId()) {
                    meno = b;
                }
                if(a != meno) {
                    auxiliar = lista.get(a);
                    lista.set(lista.get(meno), a);
                    lista.set(auxiliar, meno);
                }
            }
        }
        
    }
    
}
