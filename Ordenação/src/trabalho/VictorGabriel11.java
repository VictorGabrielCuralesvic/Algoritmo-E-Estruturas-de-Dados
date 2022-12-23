package trabalho;

public class VictorGabriel11 implements ITrabalho11 {

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public void bubbleSort(ITrabalho01 lista) {
        int end = lista.getQuantidade();
        boolean desordem = false;
        do {
            desordem = false;
            for(int a = 1; a < end; a = a + 1) {
                if(lista.get(a - 1).getId() > lista.get(a).getId()) {
                    ITAD auxiliar = lista.get(a);
                    lista.set(lista.get(a - 1), a);
                    lista.set(auxiliar, a - 1);
                    desordem = true;
                }
            } 
            end = end - 1;
        } while(desordem);
        
    }
    
}
