package trabalho;

public class VictorGabriel15 implements ITrabalho15 {

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public void quickSort(ITrabalho01 lista, int inicio, int fim) {
        if(fim > inicio) {
            int pivo = partir(lista, inicio, fim);
            quickSort(lista, inicio, pivo - 1);
            quickSort(lista, pivo + 1, fim);
        }
        
    }

    private int partir(ITrabalho01 lista, int inicio, int fim) {
        int esquerda = inicio;
        int direita = fim;
        ITAD pivo = lista.get(inicio);
        while(esquerda <= direita) {
            if(lista.get(esquerda).getId() <= pivo.getId()) {
                return esquerda = esquerda + 1;
            }else if(lista.get(direita).getId() > pivo.getId()) {
                return direita = direita - 1;
            }else{
                ITAD auxiliar = lista.get(esquerda);
                lista.set(lista.get(direita), esquerda);
                lista.set(auxiliar, direita);
                esquerda = esquerda + 1;
                direita = direita - 1;
            }
        }
        lista.set(lista.get(direita), inicio);
        lista.set(pivo, direita);
        return direita;
    }
    
    
}
