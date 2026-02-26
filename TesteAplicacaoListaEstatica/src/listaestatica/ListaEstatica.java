package listaestatica;

public class ListaEstatica {
    
    private int tamanhoMaximo;
    private double[] vetor;
    private int qtd;
    
    public ListaEstatica(int tamanhoMaximo){
        this.tamanhoMaximo = tamanhoMaximo;
        this.qtd = 0;
        this.vetor = new double[tamanhoMaximo];
    }
    
    public String printVetor(){
        String temp = "";
        for(double d : this.vetor){
            temp += Double.toString(d) + " - ";
        }
        return temp;
    }
    
    public String printLista(){
        String temp = "";
        for (int i = 0; i < tamanhoLista(); i++){
            temp += Double.toString(this.vetor[i]) + " - ";
        }
        return temp;
    }
    
    public int tamanhoLista(){
        return this.qtd;
    }
    
    //função adicionada para detecção do tamanho maximo 
    // ajuste do tamanho da memória será concluida em aula
    public boolean listaCheia(){
        return (tamanhoLista() > (this.tamanhoMaximo - 1)); 
    }
    
    public boolean listaVazia(){
        return (tamanhoLista() == 0);
    }
    
    // métodos de inserção de elementos individual
    private void insereListaVazia(double valor){
        this.vetor[0] = valor;
        this.qtd = 1;
    }
    
    private void insereFimLista(double valor){
        this.vetor[this.qtd] = valor;
        this.qtd++;
    }
    
    private void insereInicioLista(double valor){
        for (int i = this.qtd; i > 0; i--){
            this.vetor[i] = this.vetor[i-1];
        }
        this.vetor[0] = valor;
        this.qtd++;
    }
    
    private void insereMeioLista(double valor, int pos){
         for (int i = this.qtd; i > pos; i--){
            this.vetor[i] = this.vetor[i-1];
        }
        this.vetor[pos] = valor;
        this.qtd++;
    }
    
    //métodos publicos de inserção de elementos
    public boolean insere(double valor){
        if (listaCheia()) { return false;}
        
        if(listaVazia()){ insereListaVazia(valor);} 
        else { insereFimLista(valor); }
        return true;
    }
    
    public boolean insere(double valor, int pos){
        if (listaCheia()) { return false;}
        
        if(listaVazia() && pos == 0){
            insereListaVazia(valor);
            return true;
        }
        if (listaVazia() && pos > 0){ return false;}
        if (pos < 0){  return false;}
        if (pos == tamanhoLista()){
            insereFimLista(valor);
            return true;
        }
        if (pos == 0){
            insereInicioLista(valor);
            return true;
        }
        if (pos > 0 && pos < tamanhoLista()){
            insereMeioLista(valor, pos);
            return true;
        }
        
        return false;
    }
    
    
    //funções apenas para teste das rotinas de inserção
    public void debugInsere(double valor){
        System.out.println("Conseguiu inserir? " + insere(valor));
        System.out.println(printVetor());
        System.out.println(printLista());
    }
    
    public void debugInsere(double valor, int pos){
        System.out.println("Conseguiu inserir? " + insere(valor, pos));
        System.out.println(printVetor());
        System.out.println(printLista());
    }

    public void removeFimLista() {
        this.vetor[this.qtd-1] = 0;
        this.qtd--;
    }
    
    public void removeInicioLista() {
        for (int i = 0; i < qtd; i++) {
            this.vetor[i] = this.vetor[i+1];
        }
        this.qtd--;
    }

    public void removeMeioLista(int pos) {
        for (int i = pos; i < qtd; i++) {
            this.vetor[i] = this.vetor[i+1];
        }
        this.qtd--;
    }

    public boolean remove(int pos) {
        if (listaVazia()) {
            System.out.println("A lista está vazia");
            return false;
        }
        if (pos < 0) {
            System.out.println("Fala uma posição que exista!");
            return false;
        }
        if (pos == tamanhoLista()) {
            removeFimLista();
            return true;
        }
        if (pos == 0) {
            removeInicioLista();
            return true;
        }
        if (pos > 0 && pos < tamanhoLista()) {
            removeMeioLista(pos);
            return true;
            }
        return false;
        }
    }

    






