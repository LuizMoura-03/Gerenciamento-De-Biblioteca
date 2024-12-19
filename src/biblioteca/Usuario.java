package biblioteca;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private int id;
    private ArrayList<Livro> livrosEmprestados;

    public Usuario(String nome, int id, ArrayList<Livro> livrosEmprestados) {
        this.nome = nome;
        this.id = id;
        this.livrosEmprestados = livrosEmprestados;
    }

    public void adicionarLivro(Livro livro) {
        livrosEmprestados.add(livro);
        System.out.println("Livro adicionado na lista de emprestimo.");
    }

    public void listarLivrosEmprestados() {
        System.out.println("Livros emprestados por " + nome + ":");
        for (Livro livro : livrosEmprestados) {

        }
    }
}
