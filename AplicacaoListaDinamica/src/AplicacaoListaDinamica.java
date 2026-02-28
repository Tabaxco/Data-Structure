import listasimplesdinamica.ListaSimplesDinamica;

public class AplicacaoListaDinamica {
    public static void main (String [] args) {
        ListaSimplesDinamica listaMacac = new ListaSimplesDinamica();
        listaMacac.insereListaVazia(50);
        listaMacac.insereListaFim(2);
        listaMacac.printLista();
        listaMacac.insereListaMeio(2, 1);
        System.out.println();
        listaMacac.printLista();
    }
}