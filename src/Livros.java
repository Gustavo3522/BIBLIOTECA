public class Livros {
    private String titulo;
    private String autor;
    private String genero;
    private String codigo;
    private boolean emprestado;

    public Livros (String titulo, String autor, String genero, String codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.codigo = codigo;
        this.emprestado = false;
    }
    public void alterarStatus(boolean status){
        this.emprestado = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

