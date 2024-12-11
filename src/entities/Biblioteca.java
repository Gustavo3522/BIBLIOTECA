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
        usuario.setId(id);

        System.out.println("USUÁRIO CADASTRADO COM SUCESSO !!!");

        usuarios.add(usuario);

    }

    public void verLivro(){
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
            System.out.println();
        } else {
            for (Livros livro : livros) {
                System.out.println(livro);
                System.out.println();
            }
        }
    }

    public void verUsuarios(){
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum Usuario cadastrado.");
            System.out.println();
        } else {
            for (Usuario usuario : usuarios) {
                System.out.println(usuario);
                System.out.println();
            }
        }
    }


    public void pegarLivroEmprestado() {

        System.out.println("Informe seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.println("Informe seu ID: ");
        String idUsuario = sc.nextLine();


        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getName().equalsIgnoreCase(nomeUsuario) && usuario.getId().equals(idUsuario)) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        if (usuarioEncontrado == null) {
            System.out.println("Usuário não encontrado. Verifique o nome e o ID.");
            return;
        }


        System.out.println("Qual livro você deseja pegar emprestado?");
        System.out.println("Digite o título do livro: ");
        String titulo = sc.nextLine();

        System.out.println("Digite o código do livro: ");
        String codigo = sc.nextLine();


        Livros livroEncontrado = null;
        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getCodigo().equals(codigo)) {
                livroEncontrado = livro;
                break;
            }
        }

        if (livroEncontrado == null) {
            System.out.println("Livro não encontrado com o título e código fornecidos.");
            return;
        }


        if (livroEncontrado.getStatus().equals("emprestado")) {
            System.out.println("Este livro já está emprestado.");
        } else {

            livroEncontrado.setStatus("emprestado");
            System.out.println("Livro " + livroEncontrado.getTitulo() + " emprestado com sucesso para " + usuarioEncontrado.getName() + "!");
        }
    }

    public void devolverLivro() {

        System.out.println("Informe seu nome: ");
        String nomeUsuario = sc.nextLine();

        System.out.println("Informe seu ID: ");
        String idUsuario = sc.nextLine();


        Usuario usuarioEncontrado = null;
        for (Usuario usuario : usuarios) {
            if (usuario.getName().equalsIgnoreCase(nomeUsuario) && usuario.getId().equals(idUsuario)) {
                usuarioEncontrado = usuario;
                break;
            }
        }

        if (usuarioEncontrado == null) {
            System.out.println("Usuário não encontrado. Verifique o nome e o ID.");
            return;
        }


        System.out.println("Qual livro você deseja devolver?");
        System.out.println("Digite o título do livro: ");
        String titulo = sc.nextLine();

        System.out.println("Digite o código do livro: ");
        String codigo = sc.nextLine();


        Livros livroEncontrado = null;
        for (Livros livro : livros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo) && livro.getCodigo().equals(codigo)) {
                livroEncontrado = livro;
                break;
            }
        }

        if (livroEncontrado == null) {
            System.out.println("Livro não encontrado com o título e código fornecidos.");
            return;
        }

        if (livroEncontrado.getStatus().equals("emprestado")) {

            livroEncontrado.setStatus("livre para empréstimo");
            System.out.println("Livro " + livroEncontrado.getTitulo() + " devolvido com sucesso. Agora está livre para empréstimo.");
        } else {

            System.out.println("Este livro não está emprestado.");
        }
    }




}