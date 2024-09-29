package org.example;

import java.util.Scanner;

public class VerificaLetra {
    public String entrada;

    public VerificaLetra(String entrada){
        this.entrada = entrada;
    }

    public String Verificar() {

            // Inicializando a contagem
            int contagem = 0;

            // Convertendo a string em minúsculas para simplificar a verificação
            for (int i = 0; i < entrada.length(); i++) {
                char caractere = entrada.charAt(i);
                if (caractere == 'a' || caractere == 'A') {
                    contagem++;
                }
            }

            // Exibindo o resultado
            if (contagem > 0) {
                return "A letra 'a' foi encontrada " + contagem + " vez(es) na palavra.";
            } else {
               return "A letra 'a' não foi encontrada na palavra.";
            }



    }
    }

