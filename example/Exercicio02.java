package org.example;

import java.util.Scanner;

public class Exercicio02 {

    public String fibonacci(int num) {
        // Caso o número seja negativo, ele não pertence à sequência de Fibonacci
        if (num < 0) return "O numero é negativo e não faz parte da sequêcia fibonacci";

        // Os dois primeiros números da sequência de Fibonacci são 0 e 1
        int a = 0;
        int b = 1;

        // Se o número é 0 ou 1, ele já pertence à sequência
        if (num == a || num == b) return "Ele pertence a sequêcia fibonacci";

        // A variável 'fib' guarda o próximo número da sequência
        int fib = a + b;

        // Continuar gerando a sequência até que 'fib' seja maior ou igual ao número
        while (fib <= num) {
            if (fib == num) return "O numero pertence a sequêcia fibonacci";  // Se 'fib' é igual ao número, ele pertence à sequência
            a = b;
            b = fib;
            fib = a + b;
        }

        // Se o laço terminar, o número não pertence à sequência de Fibonacci
        return "Ele não pertence a sequêcia fibonacci ";
    }
}
