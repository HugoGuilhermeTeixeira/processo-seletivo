package org.example;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio03 {

    // Função para carregar o JSON do arquivo
    public JSONArray carregarFaturamentoJSON(String caminhoArquivo) {
        try (FileReader reader = new FileReader(caminhoArquivo);
             Scanner scanner = new Scanner(reader)) {
            StringBuilder jsonData = new StringBuilder();
            while (scanner.hasNextLine()) {
                jsonData.append(scanner.nextLine());
            }
            return new JSONArray(jsonData.toString());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Função para calcular o menor faturamento
    public double calcularMenorFaturamento(List<Double> valores) {
        double menor = Double.MAX_VALUE;
        for (double valor : valores) {
            if (valor < menor) {
                menor = valor;
            }
        }
        return menor;
    }

    // Função para calcular o maior faturamento
    public double calcularMaiorFaturamento(List<Double> valores) {
        double maior = Double.MIN_VALUE;
        for (double valor : valores) {
            if (valor > maior) {
                maior = valor;
            }
        }
        return maior;
    }

    // Função para calcular a média de faturamento
    public double calcularMediaFaturamento(List<Double> valores) {
        double soma = 0;
        for (double valor : valores) {
            soma += valor;
        }
        return soma / valores.size();
    }

    // Função para contar quantos dias tiveram faturamento acima da média
    public int contarDiasAcimaDaMedia(List<Double> valores, double media) {
        int contador = 0;
        for (double valor : valores) {
            if (valor > media) {
                contador++;
            }
        }
        return contador;
    }
}
