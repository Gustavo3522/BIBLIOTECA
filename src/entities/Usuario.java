package entities;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private  String name;
    private  String id;
    private List<Livros> livrosEmprestados;

    public Usuario(String name, String id){
        this.name = name;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public void removerLivros(Livros livros){
        livrosEmprestados.remove(livros);
    }

    public void addLivros(Livros livros){
        livrosEmprestados.add(livros);
    }

    public String getName(){
        return name;
    }

    public String getId(){
        return id;
    }
}