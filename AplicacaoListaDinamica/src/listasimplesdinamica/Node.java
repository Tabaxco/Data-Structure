package listasimplesdinamica;

public class Node {
    private double valor;
    private Node referencia;
    private Node proximo;

    public Node (double valorInit) {
        valor = valorInit;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Node getReferencia() {
        return referencia;
    }

    public void setReferencia(Node referencia) {
        this.referencia = referencia;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}
