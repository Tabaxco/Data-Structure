package aplicacaolistacircular;

import listacircular.ListaCircular;

public class AplicacaoListaCircular {
    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();

        lista.inserePrimeiroElemento(0);

        /*
        lista.insereInicioLista(2);
        lista.insereFimLista(8);

        lista.imprimir();
        lista.removeInicioLista();
        System.out.println();
        lista.imprimir();
        System.out.println();

        lista.insereFimLista(10);
        lista.imprimir();
        System.out.println();
        lista.removeFimLista();
        lista.imprimir();
        System.out.println();*/

        lista.insereFimLista(11);
        lista.insereFimLista(12);
        lista.insereFimLista(109292);
        lista.imprimir();
        System.out.println();

        System.out.println();
        lista.insereMeioLista(2,1);
        lista.imprimir();
    }
}