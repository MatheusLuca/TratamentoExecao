package blocofinally;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BlocoFinally {
    static void main(String[] args) {

        // Instancia um  objeto file da classe File
        // Passando no construtor o caminho do arquivo

        File file = new File("C:\\Users\\Matheus Luca\\Documents\\java.txt");
        Scanner sc = null;
            try{
                // Tenta abrir o arquivo file (que foi passado via contrutor da classe file)
                sc = new Scanner(file);
                //Se hasNextLine() for true ainda tem conteudo no arquivo
                // Se retornar false não tem mais conteudo
                    while(sc.hasNextLine()){
                        System.out.println(sc.nextLine());
                    }
            // Se o arquivo nao for encontrado lance a exceção arquivo nao encontrado
            }catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            }finally {
                // Se sc nao for diferente de null ele fecha o scanner
                if(sc != null){
                    sc.close();
                }
                System.out.println("Finally executado!!!");
            }
    }
}
