package trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Blocotrycatch {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try{
            String[] vetor = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vetor[position]);
        }catch(ArrayIndexOutOfBoundsException err){
            System.out.println("Posicação invalida");
        }catch(InputMismatchException erroEntradaInvalida){
            System.out.println("Entrada invalida" + erroEntradaInvalida);
        }

        System.out.println("end of program");

        sc.close();





    }

}
