package entities;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public ArrayList<String> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public void addLivrosEmprestados(Livro livro) {
        livrosEmprestados.add(livro);
    }
    public void removeLivrosEmprestados(Livro livro) {
        livrosEmprestados.remove(livro);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", livrosEmprestados: " + livrosEmprestados.size() +
                '}';
    }
}

