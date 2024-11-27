package entities;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<String> livrosEmprestados;

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

}

