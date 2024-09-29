package org.example;

public class Exercicio04 {

    // Valores de faturamento dos estados
    double sp = 67836.43;
    double rj = 36678.66;
    double mg = 29229.88;
    double es = 27165.48;
    double outros = 19849.53;

    // Nomes dos estados
    String[] nomesEstados = {"SP", "RJ", "MG", "ES", "Outros"};

    // Total do faturamento mensal
    double totalMensal = sp + rj + mg + es + outros;

    // Array para armazenar as porcentagens
    double[] porcentagemFaturamento = {sp, rj, mg, es, outros};

    // Método para calcular as porcentagens de faturamento
    public void calFaturamento() {
        for (int i = 0; i < porcentagemFaturamento.length; i++) {
            // Calcula a porcentagem
            porcentagemFaturamento[i] = (porcentagemFaturamento[i] / totalMensal) * 100;
        }
    }

    // Método para exibir o faturamento por estado
    public void exibirFaturamentoPorEstado() {
        // Calcula o faturamento
        calFaturamento();

        // Imprime o nome dos estados com a porcentagem formatada
        for (int i = 0; i < nomesEstados.length; i++) {
            System.out.printf("%s: %.2f%%\n", nomesEstados[i], porcentagemFaturamento[i]);
        }
    }
}
