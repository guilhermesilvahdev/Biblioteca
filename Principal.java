import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        Livro[] livros = new Livro[50];
        Aluno[] alunos = new Aluno[50];
        Emprestimo[] emprestimos = new Emprestimo[100];

        int totalLivros = 0;
        int totalAlunos = 0;
        int totalEmprestimos = 0;

        int opcao;

        do {
            System.out.println("========= BIBLIOTECA =========");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Cadastrar aluno");
            System.out.println("4 - Listar alunos");
            System.out.println("5 - Realizar empréstimo");
            System.out.println("6 - Realizar devolução");
            System.out.println("7 - Listar empréstimos");
            System.out.println("8 - Buscar livro");
            System.out.println("9 - Buscar aluno");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {

                case 1: // cadastrar livro
                    if (totalLivros < livros.length) {

                        System.out.print("Código: ");
                        int codigo = ler.nextInt();
                        ler.nextLine();

                        System.out.print("Título: ");
                        String titulo = ler.nextLine();

                        System.out.print("Autor: ");
                        String autor = ler.nextLine();

                        System.out.print("Editora: ");
                        String editora = ler.nextLine();

                        System.out.print("Ano: ");
                        int ano = ler.nextInt();

                        System.out.print("Páginas: ");
                        int paginas = ler.nextInt();
                        ler.nextLine();

                        livros[totalLivros] = new Livro(titulo, autor, editora, codigo, ano, paginas);
                        totalLivros++;

                        System.out.println("Livro cadastrado!");
                    } else {
                        System.out.println("Limite de livros atingido!");
                    }
                    break;

                case 2: // listar livros
                    for (int i = 0; i < totalLivros; i++) {
                        livros[i].exibirDados();
                    }
                    break;

                case 3: // cadastrar aluno
                    if (totalAlunos < alunos.length) {

                        System.out.print("Matrícula: ");
                        int matricula = ler.nextInt();
                        ler.nextLine();

                        System.out.print("Nome: ");
                        String nome = ler.nextLine();

                        System.out.print("Curso: ");
                        String curso = ler.nextLine();

                        System.out.print("Telefone: ");
                        String telefone = ler.nextLine();

                        System.out.print("Email: ");
                        String email = ler.nextLine();

                        alunos[totalAlunos] = new Aluno(matricula, nome, curso, telefone, email);
                        totalAlunos++;

                        System.out.println("Aluno cadastrado!");
                    } else {
                        System.out.println("Limite de alunos atingido!");
                    }
                    break;

                case 4: // listar alunos
                    for (int i = 0; i < totalAlunos; i++) {
                        alunos[i].exibirDados();
                    }
                    break;

                case 5: // empréstimo
                    System.out.print("Código do empréstimo: ");
                    int codEmp = ler.nextInt();

                    System.out.print("Matrícula do aluno: ");
                    int mat = ler.nextInt();

                    System.out.print("Código do livro: ");
                    int codLivro = ler.nextInt();

                    System.out.print("Dias: ");
                    int dias = ler.nextInt();

                    Aluno alunoSelecionado = null;
                    Livro livroSelecionado = null;

                    for (int i = 0; i < totalAlunos; i++) {
                        if (alunos[i].getMatricula() == mat) {
                            alunoSelecionado = alunos[i];
                            break;
                        }
                    }

                    for (int i = 0; i < totalLivros; i++) {
                        if (livros[i].getCodigo() == codLivro && livros[i].isDisponivel()) {
                            livroSelecionado = livros[i];
                            break;
                        }
                    }

                    if (alunoSelecionado != null && livroSelecionado != null) {
                        emprestimos[totalEmprestimos] =
                                new Emprestimo(codEmp, alunoSelecionado, livroSelecionado, dias);
                        totalEmprestimos++;

                        System.out.println("Empréstimo realizado!");
                    } else {
                        System.out.println("Aluno ou livro inválido / livro indisponível.");
                    }

                    break;

                case 6: // devolução
                    System.out.print("Código do empréstimo: ");
                    int codDev = ler.nextInt();

                    for (int i = 0; i < totalEmprestimos; i++) {
                        if (emprestimos[i].getCodigoEmprestimo() == codDev) {
                            emprestimos[i].realizarDevolucao();
                            System.out.println("Devolução realizada!");
                            break;
                        }
                    }
                    break;

                case 7: // listar empréstimos
                    for (int i = 0; i < totalEmprestimos; i++) {
                        emprestimos[i].exibirResumo();
                    }
                    break;

                case 8: // buscar livro
                    System.out.print("Código do livro: ");
                    int buscaLivro = ler.nextInt();

                    for (int i = 0; i < totalLivros; i++) {
                        if (livros[i].getCodigo() == buscaLivro) {
                            livros[i].exibirDados();
                            break;
                        }
                    }
                    break;

                case 9: // buscar aluno
                    System.out.print("Matrícula: ");
                    int buscaAluno = ler.nextInt();

                    for (int i = 0; i < totalAlunos; i++) {
                        if (alunos[i].getMatricula() == buscaAluno) {
                            alunos[i].exibirDados();
                            break;
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

            System.out.println();

        } while (opcao != 0);

        ler.close();
    }
}