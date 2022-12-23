package trabalho;

public class VictorGabriel12 implements ITrabalho12 {

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public void insertionSort(ITrabalho01 lista) {
        for(int a = 0; a < lista.getQuantidade(); a = a + 1) {
            for(int b = a; b > 0; b = b - 1) {
                if(lista.get(b).getId() < lista.set(b-1).getId()) {
                    ITAD auxiliar = lista.get(b-1);
                    lista.set(lista.get(b),b-1);
                    lista.set(auxiliar,b);
                }

            }
        }
        
    }
    
}
