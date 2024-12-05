package entities;
import entities.Livros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    Scanner sc = new Scanner(System.in);

    private List<Livros> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastarLivro(){
        Livros livros = new Livros();
        System.out.println("CADASTRO DE LIVRO");

        System.out.println("TITULO DO LIVRO: ");
        String titulo = sc.nextLine();
        livros.setTitulo(titulo);

        System.out.println("AUTOR DO LIVRO: ");
        String autor = sc.nextLine();
        livros.setAutor(autor);

        System.out.println("GENERO DO LIVRO: ");
        String genero = sc.nextLine();
        livros.setGenero(genero);

        System.out.println("CÓDIGO DO LIVRO: ");
        String codigo = sc.nextLine();
        livros.setCodigo(codigo);

        System.out.println("LIVRO CADASTRADO COM SUCESSO !!!! ");

    }

}