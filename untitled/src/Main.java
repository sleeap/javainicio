import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int idade = 0;
        int area = 0;



        // Exercício 1
        String planeta = "Plutão";
        System.out.println(planeta);


        // Exercício 2
        Scanner entradaDados = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String text = entradaDados.next();
        System.out.println(" Olá " + text);
        System.out.println("Digite sua idade: ");
        idade = entradaDados.nextInt();
        System.out.println(" Olá " + text + " sua idade " + idade);


        // Exercício 3
        System.out.println("Digite a base: ");
        int base = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura = entradaDados.nextInt();
        System.out.println(" O resultado é " + base * altura);


        // Exercício 4
        System.out.println("Digite a lado: ");
        int lado = entradaDados.nextInt();
        System.out.println("o valor é: " + lado * lado);


        // Exercício 5
        System.out.println("digite o diagonal maior: ");
        int diagonal = entradaDados.nextInt();
        System.out.println("digite o valor da diagonal menor: ");
        int diagonalMenor = entradaDados.nextInt();
        System.out.println("digite o valor da altura: ");
        int altura2 = entradaDados.nextInt();
        System.out.println("o valor é: " + (diagonal + diagonalMenor) * altura2 / 2);


        // Exercício 6
        System.out.println("Digite a base2: ");
        int base2 = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura3 = entradaDados.nextInt();
        System.out.println(" O resultado é " + base2 * altura3);


        // Exercício 7
        System.out.println("Digite a base3: ");
        int base3 = entradaDados.nextInt();
        System.out.println("Digite a altura: ");
        int altura4 = entradaDados.nextInt();
        System.out.println(" O resultado é " + base3 * altura4 / 2);


        // Exercício 8        ]
        System.out.println("Digite o raio da área : ");
        int raio = entradaDados.nextInt();
        System.out.println("o valor da círculo é " + raio * raio * 3.14f);


    }
}