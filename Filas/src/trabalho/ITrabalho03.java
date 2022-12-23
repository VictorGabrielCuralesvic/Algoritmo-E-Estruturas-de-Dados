package trabalho;

public interface ITrabalho03 {
	
	String getEstudante();

	ITAD[] criaLista(int tamanho);
	int getQuantidade();
	
	void enqueue(ITAD tad);
	ITAD dequeue();
	ITAD consulta();
	
	String print();
	
}
