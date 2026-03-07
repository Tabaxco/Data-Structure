package listacircular;

import org.w3c.dom.Node;

public class ListaCircular {
    private No inicio;

    public ListaCircular () {
        this.inicio = null;
    }

    public void inserePrimeiroElemento(double valor) {
        No aux = new No(valor);
        aux.setProx(aux);
        aux.setAnt(aux);
        inicio = aux;
    }

    public void insereInicioLista(double valor) {
        No aux = new No(valor);
        No anterior = this.inicio.getAnt();

        aux.setProx(this.inicio);
        aux.setAnt(this.inicio.getAnt());

        anterior.setProx(aux);
        this.inicio.setAnt(aux);
        this.inicio = aux;
    }

    public void insereFimLista(double valor) {
        No aux = new No(valor);
        No anterior = this.inicio.getAnt();

        aux.setProx(this.inicio);
        aux.setAnt(this.inicio.getAnt());

        anterior.setProx(aux);
        this.inicio.setAnt(aux);
    }

    public void insereMeioLista(int pos, double valor) {
        No temp = this.inicio;
        No aux = new No(valor);

        for (int i = 0; i < pos; i ++) {
            temp = temp.getProx();
        }

        aux.setAnt(temp.getAnt());
        temp.getAnt().setProx(aux);
        aux.setProx(temp);
        temp.setAnt(aux);
    }

   /* public boolean listaVazia() {
        if (this.inicio == null) {
            System.out.println("A lista está vazia.");
            return false;
        }
        return true;
    }*/

    public void removeInicioLista() {
        No temp = this.inicio;
        No aux = this.inicio.getAnt();
        aux.setProx(temp.getProx());
        this.inicio = aux;
    }

    public void removeFimLista() {
        No temp = this.inicio.getAnt();
        No aux = temp.getAnt();
        No aux2 = this.inicio;

        aux.setProx(temp.getProx());
        aux2.setAnt(aux);

    }

    public void removeMeioLista(int valor) {
        No temp = this.inicio;
        for (int i = 0; i < valor; i ++) {
            temp = temp.getProx();
        }
        No anterior = temp.getAnt();
        No depois = temp.getProx();
        temp.getAnt().setProx(depois);
        temp.getProx().setAnt(anterior);
    }

    public void imprimir() {
        No temp = this.inicio;

        if (this.inicio == null) {
            System.out.println("A lista esta vazia.");
            return;
        }

        do {
            System.out.println(temp.getValor());
            temp = temp.getProx();
        } while(temp != this.inicio);
    }
}
