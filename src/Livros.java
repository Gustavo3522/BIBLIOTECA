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

    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getGenero(){
        return genero;
    }

    public String getCodigo(){
        return codigo;
    }


}

