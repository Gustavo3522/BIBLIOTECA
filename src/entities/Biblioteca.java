package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    Scanner sc = new Scanner(System.in);

    List<Livros> livros = new ArrayList<>();
    List<Usuario> usuarios = new ArrayList<>();

    public void cadastarLivro(){
        Livros livro = new Livros();
        System.out.println("CADASTRO DE LIVRO");

        System.out.println("TITULO DO LIVRO: ");
        String titulo = sc.nextLine();
        livro.setTitulo(titulo);

        System.out.println("AUTOR DO LIVRO: ");
        String autor = sc.nextLine();
        livro.setAutor(autor);

        System.out.println("GENERO DO LIVRO: ");
        String genero = sc.nextLine();
        livro.setGenero(genero);

        System.out.println("CÓDIGO DO LIVRO: ");
        String codigo = sc.nextLine();
        livro.setCodigo(codigo);

        livros.add(livro);

        System.out.println("LIVRO CADASTRADO COM SUCESSO !!! ");


    }

    public void cadastrarUsuario(){
        Usuario usuario = new Usuario();
        System.out.println("CADASTRO DE USUÁRIO");

        System.out.println("NOME DO USUÁRIO: ");
        String name = sc.nextLine();
        usuario.setName(name);

        System.out.println("ID DO USUÁRIO: ");
        String id = sc.nextLine();

        System.out.println("USUÁRIO CADASTRADO COM SUCESSO !!!");

        usuarios.add(usuario);

    }

    public void verLivro(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livros livro : livros) {
                System.out.println(livro); // O método toString() da classe Livros será usado aqui
                System.out.println(); // Adiciona uma linha em branco entre os livros
            }
        }
    }

}