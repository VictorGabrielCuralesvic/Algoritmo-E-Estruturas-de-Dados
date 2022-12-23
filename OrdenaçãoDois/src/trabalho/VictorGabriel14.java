package trabalho;

public class VictorGabriel14 implements ITrabalho14 {

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public void mergerSort(ITrabalho01 lista, int inicio, int fim) {
        if(inicio < fim) {
            int mid = (inicio + fim)/2;
            mergerSort(lista, inicio, mid);
            mergerSort(lista, mid + 1, fim);
            merge(lista, inicio, mid, fim);
        }
        
    }
    private void merge(ITrabalho01 lista, int inicio, int mid, int fim) {
        boolean end1 = false; 
        boolean end2 = false;
        int p1 = inicio; 
        int p2 = mid + 1;
        int tamanho = fim - inicio + 1;
        ITAD[] auxiliar = new ITAD[tamanho];
        for(int a = 0; a < auxiliar.length; a = a + 1) {
            if(!end1 && !end2) {
                if(lista.get(p1).getId() < lista.get(p2).getId()) {
                    auxiliar[a] = lista.get(p1 = p1 + 1);
                }else{
                    auxiliar[a] = lista.get(p2 = p2 + 1);
                }
                if(p1 > mid) {
                    end1 = true;
                }
                if(p2 > fim) {
                    end2 = true;
                }
            } else {
                if(!end1) {
                    auxiliar[a] = lista.get(p1 = p1 + 1);
                }else{
                    auxiliar[a] = lista.get(p2 = p2 + 1);
                }
            }
        }
        for(int a = 0, b = inicio; a < tamanho; a = a + 1, b = b + 1) {
            lista.set(auxiliar[a], b);
        }
    }
    
}
