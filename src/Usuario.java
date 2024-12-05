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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Livros> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void setLivrosEmprestados(List<Livros> livrosEmprestados) {
        this.livrosEmprestados = livrosEmprestados;
    }

    public void removerLivros(Livros livros){
        livrosEmprestados.remove(livros);
    }

    public void addLivros(Livros livros){
        livrosEmprestados.add(livros);
    }

}