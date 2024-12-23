package biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel;

    public Livro(String titulo, String autor, String isbn, boolean disponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = disponivel;
    }

    public void exibirDetalhes() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Disponivel: " + (disponivel ? "Sim" : "Não"));
    }

    // Marcando o livro como indisponivel...
    public void emprestar() {
        if (disponivel) {
            disponivel = false;
            System.out.println("Livro empestado com sucesso!");
        }else {
            System.out.println("Livro já está emprestado.");
        }
    }

    // Livro esta disponivel.
    public void devolver() {
        if (!disponivel) {
            disponivel = true;
            System.out.println("Livro devolvido com sucesso!");
        }else {
            System.out.println("Livro já disponivel!");
        }
    }

    public String getTitulo(){
        return titulo;
    }

    public String getIsbn() {
        return isbn;
    }

}
