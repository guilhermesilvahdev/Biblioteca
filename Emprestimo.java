public class Emprestimo {
    private Livro l;
    private Aluno a;
    private int codigoEmprestimo, quantidadeDias;
    private double multa;
    private boolean devolvido;

    public Emprestimo(int ce, Aluno a, Livro l, int qd) {
        this.l = l;
        this.a = a;
        this.codigoEmprestimo = ce;
        this.quantidadeDias = qd;

        this.multa = 0;
        this.devolvido = false;

        l.alterarDisponibilidade(false); // 🔥 importante
    }

    public void calcularMulta() {
        double taxaPorDia = 2.0;
        int diasLimite = 7;

        multa = (quantidadeDias > diasLimite)
                ? (quantidadeDias - diasLimite) * taxaPorDia
                : 0;
    }

    public void realizarDevolucao() {
        if (!devolvido) {
            calcularMulta();
            devolvido = true;
            l.alterarDisponibilidade(true); // 🔥 corrigido
        }
    }

    public void exibirResumo() {
        System.out.println("---Dados do Empréstimo---");
        System.out.println("Código: " + codigoEmprestimo);
        System.out.println("Aluno: " + a.getNome());
        System.out.println("Livro: " + l.getTitulo());
        System.out.println("Quantidade de dias: " + quantidadeDias);
        System.out.println("Multa: R$ " + multa);
        System.out.println("Devolvido: " + devolvido);
        System.out.println();
    }

    public int getCodigoEmprestimo() {
        return codigoEmprestimo;
    }
}