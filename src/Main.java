/*
* Esse é um código-fonte em Java
* ====   Declarando variáveis - tipos primitivos ===
        int ano;
        ano = 2022;
        Java adota camelCase!!!
*/


public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme Top Gun: Maverick");


        int anoDeLancamento = 2022;  // tipo inteiro
        System.out.println("Ano de lançamento: " + anoDeLancamento); // concatenação

        boolean incluidoNoPlano=true;  // tipo boolean
        System.out.println("Incluído no plano: " + incluidoNoPlano);

        double notaDoFilme = 8.1; // tipo real - ponto flutuante
        System.out.println("Nota dos assinantes: " + notaDoFilme);

        double media = (9.8 + 6.3 + 8.0)/3.;  // media calculada por tres notas
        System.out.println(media);

        String sinopse = """
                Filme de aventura com galã dos anos 80.
                Top-Gun: Maverick lançado em
                """ + anoDeLancamento;
        System.out.println(sinopse);



    }
}