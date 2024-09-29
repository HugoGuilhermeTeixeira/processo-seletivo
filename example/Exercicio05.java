package org.example;

import java.util.Scanner;

public class Exercicio05 {
public String nome;

public Exercicio05(String nome){
    this.nome = nome;
}
    public String nomeInverso() {

        String inputNome = this.nome;

        char[] nome = inputNome.toCharArray();
        char[] nomeInvertidoArray = new char[nome.length];


        for (int i = 0; i < nome.length; i++) {

            nomeInvertidoArray[i] = nome[nome.length -1 - i];

        }
        String nomeInvertido = new String(nomeInvertidoArray);


        return  "Nome Invertido: " + nomeInvertido;
    }
}
