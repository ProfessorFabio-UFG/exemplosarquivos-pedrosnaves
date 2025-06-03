import java.io.*;
import javax.swing.JOptionPane;

public class GravacaoSequencial {

    public static void main(String args[]) {

        try {
           // Cria com a referência para o arquivo físico de gravação
            FileWriter fw = new FileWriter("C:\\Users\\Aluno\\Lab_POO\\teste4\\arquivo.txt");
            // Abre um fluxo associado ao arquivo
            PrintWriter pw = new PrintWriter(fw);
            // para cada linha digitada, grava a linha no arquivo
            String linha = JOptionPane.showInputDialog("linha:");
            while(!linha.equals("fim") ){
            pw.println(linha); // Escreve no arquivo
            pw.flush(); // Confirma a gravação
            linha = JOptionPane.showInputDialog("linha:");
            }
            pw.close(); // fecha o fluxo de impressão
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
