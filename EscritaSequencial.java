import java.io.*;


public class EscritaSequencial {
 
    public static void main(String args[]) {

        try {
            File diretorio = new File("C:\\Users\\Aluno\\Lab_POO\\teste2");
            diretorio.mkdir();
            // Cria um objeto com referência para o arquivo “lixo.txt”
            File arquivo = new File( diretorio, "lixo.txt");
            // Cria um objeto out associando ao arquivo um fluxo de saída
            FileOutputStream out = new FileOutputStream(arquivo);
            // grava “lixo” no arquivo
            out.write( new byte[]{ 'l', 'i', 'x', 'o'} );
            File subdir = new File( diretorio, "subdir");
            subdir.mkdir(); // cria o diretório c:\tmp\subdir
            String[] arquivos = diretorio.list();
            for (int i =0;i<arquivos.length; i++) { // lista o diretório
            File filho = new File( diretorio, arquivos[ i]);
            System. out. println(filho.getAbsolutePath());
            }
            if (arquivo.exists()) { // verifica se o arquivo existe
            arquivo.delete(); // e o deleta
            }
                out.close();

            System.out.print("Digite o texto:\n");
            try (FileOutputStream f0 = new FileOutputStream("C:\\Users\\Aluno\\Lab_POO\\teste2\\f0")) {
            byte a = (byte) System.in.read();
            while (a != '\n') {
            f0.write(a);
            a = (byte) System.in.read();
            }
            } catch (IOException e) {
            e.printStackTrace();
            } 

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
