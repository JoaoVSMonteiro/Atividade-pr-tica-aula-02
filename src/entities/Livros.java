package entities;

public class Livros {
    public String titulo;
    public String autor;
    public int anoDePublicacao;
    public boolean livroDisponivel;


    public Livros() {

    }
    public Livros(String titulo, String autor, int anoDePublicacao, boolean livroDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicacao = anoDePublicacao;
        this.livroDisponivel = true;
    }

    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }

    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isLivroDisponivel() {
        return livroDisponivel;
    }

    public void setLivroDisponivel(boolean livroDisponivel) {
        this.livroDisponivel = livroDisponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "anoDePublicacao=" + anoDePublicacao +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", livroDisponivel=" + livroDisponivel +
                '}';
    }


}
