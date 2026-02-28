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

    public void insereListaMeio(double valor, int armazenamento) {
        Node aux = new Node(valor);
        Node temp = inicio;
        int aux2 = 0;

        while(temp.getProximo() != null ) {
            temp = temp.getProximo();
            aux2++;
            if (aux2 == armazenamento-1) {
                temp.setProximo(aux);
            }
            if (aux2 == armazenamento) {
                aux.setProximo(temp);
                break;
            }
        }
    }

    public void printLista() {
        Node temp = this.inicio;
        while (temp != null) {
            System.out.println(temp.getValor());
            temp = temp.getProximo();
        }
    }
}
