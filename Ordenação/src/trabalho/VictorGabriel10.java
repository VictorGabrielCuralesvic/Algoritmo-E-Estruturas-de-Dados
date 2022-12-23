package trabalho;

public class VictorGabriel10 implements ITrabalho10 {

    @Override
    public String getEstudante() {
        return "Victor Gabriel Vieira Fechine Tavares";
    }

    @Override
    public ITAD linear(ITrabalho01 lista, int id) {
        for(int a = 0; a < lista.getQuantidade(); a = a + 1) {
            if(lista.get(a).getId() == id) {
                return lista.get(a);
            }
        }
        return null;
    }

    @Override
    public ITAD ordenada(ITrabalho01 lista, int id) {
        for(int a = 0; a < lista.getQuantidade(); a = a + 1) {
            if(lista.get(a).getId() == id) {
                return lista.get(a);
            } else {
                if(id < lista.get(a).getId()) {
                    return null;
                }
            }
        }
        return null;
    }

    @Override
    public ITAD binaria(ITrabalho01 lista, int id) {
        int begin = 0;
        int mid;
        int end = lista.getQuantidade();
        while (begin <= end) {
            mid = (begin + end)/2;
            System.out.println("meio = " + lista.get(mid).getId());
            if(id < lista.get(mid).getId()) {
                end = mid - 1;
            } else {
                if(id > lista.get(mid).getId()) {
                    begin = mid + 1;
                } else
                    return lista.get(mid);
            }
        }
        return null;
    }
    
}
