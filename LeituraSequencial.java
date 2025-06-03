import java.io.*;

public class LeituraSequencial {

       public static void main(String args[]) {

        try {
            // Cria um objeto com referência para o arquivo “c:\\listaAlunos.txt”
            File arquivo = new File("C:\\Users\\Aluno\\Lab_POO\\teste3\\listaAlunos.txt");
            // Cria um objeto in associando ao arquivo um fluxo de entrada
            FileInputStream in = new FileInputStream(arquivo);
            // Associa um filtro ao fluxo de entrada
            InputStreamReader conversor = new InputStreamReader(in);
            // Cria um buffer para armazenar o conteúdo lido do arquivo
            BufferedReader bf = new BufferedReader(conversor);
            boolean continua=true;
            String linha;
            while(continua){
            linha = bf.readLine(); // Lê linha a linha
            if (linha==null) { continua=false; }
            else { System.out.println(linha); }
            }
            bf.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

