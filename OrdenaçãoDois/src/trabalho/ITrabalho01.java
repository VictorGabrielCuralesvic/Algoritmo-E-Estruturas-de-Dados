package trabalho;

public interface ITrabalho01 {
	
	String getEstudante();

	void criaLista(int tamanho);
	ITAD[] getLista();
	int getQuantidade();
	
	ITAD get(int index);
	void set(ITAD tad, int index);
	
	void inserirNoInicio(ITAD tad);
	void inserirNoFim(ITAD tad);
	void inserirNoMeio(ITAD tad, int posicao);
	ITAD removerNoInicio();
	ITAD removerNoFim();
	ITAD removerNoMeio(int posicao);
	
	String print();
	
}
