package org.example;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Exercício 01 - Exemplo de Soma
        Exercicio01 ex1 = new Exercicio01();
        System.out.println("Resultado do Calculo (Exercicio 01): " + ex1.somar());


        // Exercicio 02 - Fibonacci
        Exercicio02 ex2 = new Exercicio02();
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para verificar na sequência de Fibonacci:");

        int num = sc.nextInt();  // Pegando o número inserido pelo usuário
        String pertence = ex2.fibonacci(num);  // Verificando se pertence à sequência

        System.out.println("O número pertence à sequência Fibonacci? " + pertence);

        // Caminho para o arquivo JSON
        String caminhoArquivo = "C:/programing/projetoSeletivo/Exercicios/src/main/java/org/example/faturamento.json";

        // Instancia o serviço de faturamento
        Exercicio03 service = new Exercicio03();

        // Carrega os dados do JSON
        JSONArray faturamentoMensal = service.carregarFaturamentoJSON(caminhoArquivo);

        if (faturamentoMensal == null) {
            System.out.println("Erro ao carregar o arquivo JSON.");
            return;
        }

        // Lista para armazenar os dias com faturamento (ignorar dias com faturamento 0)
        List<Double> diasComFaturamento = new ArrayList<>();

        // Preenche a lista com os valores de faturamento válidos (não zero)
        for (int i = 0; i < faturamentoMensal.length(); i++) {
            JSONObject dia = faturamentoMensal.getJSONObject(i);
            double valor = dia.getDouble("valor");
            if (valor > 0) {
                diasComFaturamento.add(valor);
            }
        }

        // Calcula o menor e o maior faturamento
        double menorFaturamento = service.calcularMenorFaturamento(diasComFaturamento);
        double maiorFaturamento = service.calcularMaiorFaturamento(diasComFaturamento);
        double mediaFaturamento = service.calcularMediaFaturamento(diasComFaturamento);

        // Conta o número de dias em que o faturamento foi superior à média
        int diasAcimaDaMedia = service.contarDiasAcimaDaMedia(diasComFaturamento, mediaFaturamento);

        // Exibe os resultados
        System.out.println("Menor valor de faturamento: " + menorFaturamento);
        System.out.println("Maior valor de faturamento: " + maiorFaturamento);
        System.out.println("Número de dias com faturamento superior à média: " + diasAcimaDaMedia);

        // Exercício 04 - Processar faturamentos
        Exercicio04 ex4 = new Exercicio04();
        ex4.exibirFaturamentoPorEstado();
        
        // Exercício 05 - Inversor de nome
        System.out.println("Digite o nome a ser invertido:");
        String nome = sc.next();

        Exercicio05 ex5 = new Exercicio05(nome);

        System.out.println(ex5.nomeInverso());

        // Verifica se contem a letra A na palavra
        System.out.println("Digite uma palavra: ");
        String entrada = sc.next();

        VerificaLetra verificaLetra = new VerificaLetra(entrada);

        System.out.println(verificaLetra.Verificar());

        // Fechar o scanner
        sc.close();


    }
}
