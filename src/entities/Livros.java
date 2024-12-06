package entities;

public class Livros {
    private String titulo;
    private String autor;
    private String genero;
    private String codigo;
    private boolean emprestado;

    public Livros() {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.codigo = codigo;
        this.emprestado = false;
    }


    public void alterarStatus(boolean status) {
        this.emprestado = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String toString(){
        return "Título: " + titulo + ", Autor: " + autor + ", Gênero: " + genero + ", Código: " + codigo;
    }

}

