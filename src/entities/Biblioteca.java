package entities;

import java.util.ArrayList;
import java.util.List;


public class Biblioteca {
    private List<Livro> livros;
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.usuarios = new ArrayList<>();
    }

    public void AdicionarLivro(String titulo, String autor, int anoPublicacao) {
        livros.add(new Livro(titulo, autor, anoPublicacao));
        System.out.println("Livro adicionado com sucesso!!");
    }

    public void removerLivro(String titulo) {
        for (Livro livro : livros) {
            if(livro.getTitulo().equals(titulo)){
                livros.remove(livro);
            }
        }
        System.out.println("Livro removido com sucesso!!");
    }
    public void buscarLivro(String titulo) {
        for (Livro livro : livros) {
            if(livro.getTitulo().equals(titulo)){
                System.out.println(livro);
            }
        }
    }
    public void listarLivros() {
        for (Livro livro : livros) {
            System.out.println(livro);
        }
    }

    public void AdicionarUsuario(String nome, int id) {
        usuarios.add(new Usuario(nome, id));
    }

    public void listarUsuarios() {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    public void pegarLivroEmprestado(String titulo,String usuario) {
        for (int i = 0; i < livros.size(); i++) {
            Usuario usu = null;
            Livro livro = null;
            if(livros.get(i).getTitulo().equals(titulo)){
                livro = livros.get(i);
            }
            if(usuarios.get(i).getNome().equals(usuario)){
                usu = usuarios.get(i);
            }
            if(usu != null && livro != null){
                livro.setLivroDisponivel(false);
                usu.addLivrosEmprestados(livro);
            }
        }
    }
    public void devolverLivroEmprestado(String titulo,String usuario) {
        for (int i = 0; i < livros.size(); i++) {
            Usuario usu = null;
            Livro livro = null;
            if(livros.get(i).getTitulo().equals(titulo)){
                livro = livros.get(i);
            }
            if(usuarios.get(i).getNome().equals(usuario)){
                usu = usuarios.get(i);
            }
            if(usu != null && livro != null){
                livro.setLivroDisponivel(true);
                usu.removeLivrosEmprestados(livro);
            }
        }
    }
}
