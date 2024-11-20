public class Registro {
    private String codigo; // Criamos o objeto codigo como privado para proteger seu encapsulamento
    // para que apenas codigos expecificos possam acessar o seu valor.

    public Registro(String codigo) { // Permitindo criar instancia do valor do codigo, assim que o registro for chamado
        this.codigo = codigo; // Usamos this para diferenciar o atributo da istancia, sendo assim ela é a instancia do objeto atual
    }

    public String getCodigo() {
        return codigo;
    }
}