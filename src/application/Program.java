package application;
import entities.Usuario;
import entities.Biblioteca;
import entities.Livros;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("""
               SUAS OPÇÕES 
               [1] Cadastrar Livro
               [2] Cadastrar Usuario
               [3] Pegar Livro Emprestado
               [4] Devolver Livro
               [5] Ver Todos Os Livros
               [6] Ver Todos Os Usuarios
               [7] Finalizar Programa """);
        System.out.print("Qual a sua opção ?  ");
        int opcao = sc.nextInt();

        while (opcao != 7){
            switch (opcao){

                case 1:
                    biblioteca.cadastarLivro();

                    break;

                default:
                    System.out.println("Opção invalida");
            }

            System.out.println("""
               SUAS OPÇÕES 
               [1] Cadastrar Livro
               [2] Cadastrar Usuario
               [3] Pegar Livro Emprestado
               [4] Devolver Livro
               [5] Ver Todos Os Livros
               [6] Ver Todos Os Usuarios
               [7] Finalizar Programa """);
            System.out.print("Qual a sua opção ?  ");
            opcao = sc.nextInt();

        }
        sc.close();
    }
}
