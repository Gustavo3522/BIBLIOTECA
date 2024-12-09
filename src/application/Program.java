package application;
import entities.Biblioteca;
import entities.Livros;

import java.util.List;
import java.util.Scanner;

public class Program {
    private static java.util.List<Livros> List;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("""
               SUAS OPÇÕES 
               [1] Cadastrar Livro
               [2] Cadastrar Usuario
               [3] Ver Todos Os Livros
               [4] Ver Todos Os Usuarios
               [5] Pegar Livro Emprestado
               [6] Devolver Livro
               [7] Finalizar Programa """);
        System.out.print("Qual a sua opção ?  ");
        int opcao = sc.nextInt();

        while (opcao != 7){
            switch (opcao){

                case 1:
                    biblioteca.cadastarLivro();

                    break;

                case 2:
                    biblioteca.cadastrarUsuario();

                    break;

                case 3:
                    biblioteca.verLivro();

                    break;

                case 4:
                    biblioteca.verUsuarios();

                    break;

                case 5:
                    biblioteca.pegarLivroEmprestado();

                    break;


                default:
                    System.out.println("Opção invalida");
            }

            System.out.println("""
               SUAS OPÇÕES 
               [1] Cadastrar Livro
               [2] Cadastrar Usuario
               [3] Ver Todos Os Livros
               [4] Ver Todos Os Usuarios
               [5] Pegar Livro Emprestado
               [6] Devolver Livro
               [7] Finalizar Programa """);
            System.out.print("Qual a sua opção ?  ");
            opcao = sc.nextInt();

        }
        sc.close();
    }
}
