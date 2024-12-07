package entities;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private  String name;
    private  String id;
    private List<Livros> livrosEmprestados;

    public Usuario(){
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

    public void setName(String name){
        this.name = name;
    }

    public void setId(String id){
        this.id = id;
    }

    public String toString(){
        return "name: " + name + ", id: " + id ;
    }
}