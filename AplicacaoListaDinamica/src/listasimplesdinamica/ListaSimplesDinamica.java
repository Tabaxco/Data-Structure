package listasimplesdinamica;

public class ListaSimplesDinamica {
    private Node inicio;

    public ListaSimplesDinamica () {
        inicio = null;
    }

    public boolean listaVazia() {
        return (inicio == null);
    }

    public void insereListaVazia(double valor) {
        Node aux = new Node(valor);
        aux.setReferencia(null);
        inicio = aux;
    }

    public void insereListaFim(double valor) {
        Node aux = new Node(valor);
        Node temp = inicio;

        while (temp.getProximo() != null) {
            temp = temp.getProximo();
        }

        aux.setProximo(null);
        temp.setProximo(aux);

    }

    public void insereListaInicio(double valor) {
        Node aux = new Node (valor);
        aux.setProximo(this.inicio);
        this.inicio = aux;
    }
}
