package trabalho;

//LISTA SEQUENCIAL DINÂMICA DUPLAMENTE ENCADEADA
public interface ITrabalho07 {
	
	String getEstudante();

	int getQuantidade();

	void inserirNoInicio(ITAD tad);

	void inserirNoFim(ITAD tad);

	void inserirNoMeio(ITAD tad, int posicao);

	ITAD removerNoInicio();

	ITAD removerNoFim();

	ITAD removerNoMeio(int posicao);

	ITAD get(int posicao);

	Elemento getElemento(int posicao);

	String print();

}