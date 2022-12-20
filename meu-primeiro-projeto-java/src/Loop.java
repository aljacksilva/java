/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/
/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            String nome;

            while(true) {
                System.out.println("Nome: ");
                nome = scan.next();
                if (nome.equals("0")) break;

                System.out.println("Idade: ");
                scan.nextInt();
            }

            System.out.println("Contina Aqui");

            int nota;

            System.out.println("Nota: ");
            nota = scan.nextInt();

            while(nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Digite novamente.");
                nota = scan.nextInt();
            }
            
            // int numero;
            // int maior = 0;
            // int count = 0;

            // do {
            //     System.out.println("Número: ");
            //     numero = scan.nextInt();

            //     if (numero > maior) maior = numero;

            //     count = count + 1;
                
            // } while (count < 5);  
            // System.out.println("Maior: " + maior); 

            int quantNumeros;
            int numero;
            int quantPares = 0, quantImpares = 0;
    
            System.out.println("Quantidade de números: ");
            quantNumeros = scan.nextInt();
    
            int count = 0;
            do {
                System.out.println("Número: ");
                numero = scan.nextInt();
    
                if (numero % 2 == 0 ) quantPares++;
                else quantImpares++;
    
                count++;
            } while(count < quantNumeros);
    
            System.out.println("Quantidade Par: " + quantPares);
            System.out.println("Quantidade Ímpar: " + quantImpares);

            System.out.println("Tabuada: ");
            int tabuada = scan.nextInt();
    
            System.out.println("Tabuada de " + tabuada);
            for(int i = 1; i <= 10; i = i + 1) {
                System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
            }


            System.out.println("Fatorial: ");
            int fatorial = scan.nextInt();

            int multiplicacao = 1;

            System.out.print(fatorial +"! = ");
            for(int i = fatorial ; i >= 1 ; i --) {
                multiplicacao = multiplicacao * i;
            }

            System.out.println(multiplicacao);
        }       
    }
}