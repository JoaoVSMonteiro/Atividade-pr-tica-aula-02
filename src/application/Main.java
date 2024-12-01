package application;
import entities.Biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção: ");
            System.out.println("1. Adicionar livro: ");
            System.out.println("2. Remover livro ");
            System.out.println("3. Listar livros: ");
            System.out.println("4. Buscar livro: ");
            System.out.println("5. Emprestar livro: ");
            System.out.println("6. Devolver livro: ");
            System.out.println("7. Adicionar Usuário: ");
            System.out.println("8. Listar usuários: ");
            System.out.println("9. sair: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o titulo do livro: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o nome do autor: ");
                    String nomeAutor = sc.nextLine();
                    System.out.println("Digite ano de publicação: ");
                    int anoPublicacao = sc.nextInt();
                    biblioteca.AdicionarLivro(titulo, nomeAutor, anoPublicacao);
                    break;
                case 2:
                    System.out.println("Digite o titulo do livro que deseja excluir: ");
                    titulo = sc.nextLine();
                    biblioteca.removerLivro(titulo);
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    System.out.println("Digite o titulo do livro: ");
                    titulo = sc.nextLine();
                    biblioteca.buscarLivro(titulo);
                    break;
                case 5:
                    System.out.println("Digite o titulo do livro: ");
                    titulo = sc.nextLine();
                    System.out.println("Digite o nome do usuário: ");
                    String nomeUsuario = sc.nextLine();
                    biblioteca.pegarLivroEmprestado(titulo, nomeUsuario);
                    break;
                case 6:
                    System.out.println("Digite o titulo do livro: ");
                    titulo = sc.nextLine();
                    System.out.println("Digite o nome do usuário: ");
                    nomeUsuario = sc.nextLine();
                    biblioteca.devolverLivroEmprestado(titulo, nomeUsuario);
                    break;
                case 7:
                    System.out.println("Digite nome do usuáiro: ");
                    nomeUsuario = sc.nextLine();
                    System.out.println("Digite o ID do usuário: ");
                    int IDUsuario = sc.nextInt();
                    biblioteca.AdicionarUsuario(nomeUsuario, IDUsuario);
                    break;
                case 8:
                    biblioteca.listarUsuarios();
                    break;
                case 9:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcao != 9);
    }
}
