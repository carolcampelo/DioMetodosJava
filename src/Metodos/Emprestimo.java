package Metodos;

public class Emprestimo {
    float valorEmprestimo, valorTotal, valorParcela, quantidadeParcelas, multiplicadorJuros, jurosMensal;

    public Emprestimo(float valorEmprestimo, float quantidadeParcelas) {
        this.valorEmprestimo = valorEmprestimo;
        this.quantidadeParcelas = quantidadeParcelas;
        this.multiplicadorJuros = quantidadeParcelas / 10;
        this.jurosMensal = (valorEmprestimo / quantidadeParcelas) * multiplicadorJuros;
        this.valorParcela = (valorEmprestimo / quantidadeParcelas) + jurosMensal;
        this.valorTotal = valorParcela * quantidadeParcelas;
    }

    public float getValorEmprestimo() {
        return valorEmprestimo;
    }

    public void setValorEmprestimo(float valorEmprestimo) {
        this.valorEmprestimo = valorEmprestimo;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorParcela() {
        return valorParcela;
    }

    public void setValorParcela(float valorParcela) {
        this.valorParcela = valorParcela;
    }

    public float getQuantidadeParcelas() {
        return quantidadeParcelas;
    }

    public void setQuantidadeParcelas(float quantidadeParcelas) {
        this.quantidadeParcelas = quantidadeParcelas;
    }

    public float getMultiplicadorJuros() {
        return multiplicadorJuros;
    }

    public void setMultiplicadorJuros(float multiplicadorJuros) {
        this.multiplicadorJuros = multiplicadorJuros;
    }

    public float getJurosMensal() {
        return jurosMensal;
    }

    public void setJurosMensal(float jurosMensal) {
        this.jurosMensal = jurosMensal;
    }

    public void obterInformacoes(){ // próximo passo: refatorar o código para melhorar a formatação dos floats
        System.out.println("Você solicitou um empréstimo de R$" + valorEmprestimo + " em " + quantidadeParcelas + " parcelas.");
        System.out.println("Cada parcela terá valor de R$" + valorParcela);
        System.out.println("O valor final será de R$" + valorTotal);
    }
}
