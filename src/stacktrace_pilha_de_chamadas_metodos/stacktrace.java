package stacktrace_pilha_de_chamadas_metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class stacktrace {

    static void main(String[] args) {

        metodo1();

        System.out.println("Fim do programa!");

    }


    public static void metodo1(){
        System.out.println("*** METODO 1 COMEÇOU ***");

        metodo2();


        System.out.println("*** METODO 1 TERMINOU ***");
    }


    public static void metodo2(){

        System.out.println("*** MÉTODO 2 COMEÇOU ***");

        Scanner sc = new Scanner(System.in);

        try{
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Posicação invalida");
            err.printStackTrace();
            sc.next();
        }catch(InputMismatchException erroEntradaInvalida){
            System.out.println("Entrada invalida" + erroEntradaInvalida);
        }

        sc.close();
        System.out.println("*** MÉTODO 2 TERMINOU ***");

    }

}
