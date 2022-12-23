package trabalho;

// LISTA SEQUENCIAL DIN�MICA CIRCULAR DUPLAMENTE ENCADEADA
public interface ITrabalho09 {

	String getEstudante();
	
	Elemento getLista();
	
	int getQuantidade();
	
	void inserirAntes(ITAD tad);
	
	void inserirDepois(ITAD tad);
	
	ITAD removeAntes();
	
	ITAD removeDepois();
	
	ITAD removeAtual();
	
	void deslocarCursor(int posicao);
	
	ITAD get();
	
	String print();

}
