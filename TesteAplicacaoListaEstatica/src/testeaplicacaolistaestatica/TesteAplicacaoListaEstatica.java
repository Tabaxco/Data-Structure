
package testeaplicacaolistaestatica;
import listaestatica.*;

public class TesteAplicacaoListaEstatica {

    public static void main(String[] args) {
        // TODO code application logic here
        
        ListaEstatica le = new ListaEstatica(5);
        
        //le.insereListaVazia(50);
        //le.insereFimLista(99);
        //le.insereInicioLista(55);
        //le.insereMeioLista(-10, 1);
        
        //le.insere(9);
        //le.insere(-7,2);
        le.debugInsere(8);
        le.debugInsere(9,le.tamanhoLista());
        le.debugInsere(-5,10);
        le.debugInsere(15,-2);
        le.debugInsere(92,0);
        le.debugInsere(3,1);
        le.debugInsere(13,4);
        le.debugInsere(957,3);
        le.removeFimLista();
        System.out.println();
        System.out.println(le.printLista());
        System.out.println(le.printVetor());
        le.removeInicioLista();
        System.out.println();
        System.out.println(le.printLista());
        le.removeMeioLista(1);
        System.out.println();
        System.out.println(le.printLista());
        System.out.println(le.printVetor());
    }
    
}
