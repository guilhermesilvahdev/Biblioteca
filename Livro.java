
public class Livro {
    private int codigo, anoPublicacao, quantidadePaginas;
    private String titulo, autor, editora;
    private boolean disponivel;

    public Livro(String t, String au, String ed, int cd, int ap, int qtdp) {
        codigo = cd;
        anoPublicacao = ap;
        quantidadePaginas = qtdp;
        titulo = t;
        autor = au;
        editora = ed;
        disponivel = true; // importante
    }

    public void alterarDisponibilidade(boolean status) {
        disponivel = status;
    }

    public void exibirDados() {
        System.out.println("----Informações do Livro----");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editora: " + editora);
        System.out.println("Codigo: " + codigo);
        System.out.println("Ano de publicação: " + anoPublicacao);
        System.out.println("Quantidade de páginas: " + quantidadePaginas);
        System.out.println("Disponibilidade: " + (disponivel ? "Disponível" : "Indisponível"));
    }

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
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

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public boolean isDisponivel() {
		return disponivel;
	}

	public void setDisponivel(boolean disponivel) {
		this.disponivel = disponivel;
	}

    
    
}
