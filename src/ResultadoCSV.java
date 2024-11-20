import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ResultadoCSV {
    private String nomeArquivo;

    public ResultadoCSV(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    public void salvarResultados(String resultados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, true))) { // 'true' para anexar ao arquivo
            writer.write(resultados);
            writer.newLine(); // Adiciona uma nova linha após cada entrada
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }

    public void salvarCabecalho() {
        String cabecalho = "TamanhoConjunto,TamanhoTabela,TipoHash,DuracaoInsercao,NumeroColisoes";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo, false))) { // 'false' para sobrescrever o arquivo
            writer.write(cabecalho);
            writer.newLine();
        } catch (IOException e) {
            System.err.println("Erro ao escrever no arquivo: " + e.getMessage());
        }
    }
}
