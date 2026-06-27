
public class Aluno {
    private int matricula;
    private String nome, curso, telefone, email;

    public Aluno(int ma, String n, String c, String tel, String email) {
        this.matricula = ma;
        this.nome = n;
        this.curso = c;
        this.telefone = tel;
        this.email = email;
    }

    public void exibirDados() {
        System.out.println("---Informações do Aluno---");
        System.out.println("Matrícula: " + matricula);
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
        System.out.println();
    }

public int getMatricula() {
	return matricula;
}

public void setMatricula(int matricula) {
	this.matricula = matricula;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCurso() {
	return curso;
}

public void setCurso(String curso) {
	this.curso = curso;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

}
