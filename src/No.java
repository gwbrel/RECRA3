class No { // no feito para guardar um valor do registro, no caso seria uma referencia para o proximo da lista.
    Registro registro; //
    No proximo;

    public No(Registro registro) { // construtor da classe no, chamado apenas quando um np é criado
        this.registro = registro; // atribui o valor do argumento
        this.proximo = null;
    }
}