package entities;

public class Livros {
    private String titulo;
    private String autor;
    private String genero;
    private String codigo;
    private String status;

    public Livros() {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.codigo = codigo;
        this.status = "Livre para empréstimos";
    }


    //public void alterarStatus(String status) {
        //this.status = status;
    //}

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.codigo = status;
    }

    public String toString(){
        return "Título: " + titulo + ", Autor: " + autor + ", Gênero: " + genero + ", Código: " + codigo;
    }

}

