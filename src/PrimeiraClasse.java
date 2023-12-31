public class PrimeiraClasse {
    public static void main (String[] args) {
        System.out.println("Concluí a aula 01 e agora estou mergulhando em Java!");

        int a = 10; // Atribui o valor 10 à variável a
        int b = 5; // Atribui o valor 5 à variável b
        int c = 30; // Atribui o valor 30 à variável c

        boolean igual = (b == a); //Nesse caso a variável igual ficará com o
        // valor *false*, pois o valor de b não é igual o valor de a.
        boolean diferente = (b != c); //A variável diferente ficará com o valor
        // *true*, pois o valor de b é diferente do valor de c.
        boolean maior = (b > a); //A variável maior ficará com o valor *false*,
        // pois o valor de b é menor que o valor de a.
        boolean menorIgual = (b <= c); //A variável menorIgual ficará com o
        // valor *true*, pois o valor de b é menor que o valor de c.

        System.out.println("Os números dados foram: a=" + a + ", b=" + b + ", c="+ c+ ".");
        System.out.println("Então, temos as sentenças:");

        if (igual) {
            System.out.println("1 - b é igual à a!");
        } else {
            System.out.println("1 - b não é igual à a!");
        }
        if (diferente) {
            System.out.println("2 - Essa linha é sempre impressa pois b é diferente de c!");
        }
        if (maior) {
            System.out.println("3 - b é maior que a");
        } else {
            System.out.println("3 - b não é maior que a.");
        }
        if (menorIgual) {
            System.out.println("4 - b é menor ou igual a c");
        }

        boolean verdadeiro = true;
        boolean falso = false;

        if (verdadeiro && falso) {
            System.out.println("Este código não será executado, já que a é verdadeiro e b é falso.");
        }

        if (verdadeiro || falso) {
            System.out.println("Este código será executado, já que a é verdadeiro, mesmo que b seja falso.");
        }

        if (!verdadeiro) {
            System.out.println("Este código não será executado, já que a é verdadeiro.");
        }

        int num = 5;
        int resultado = ++num; //num é incrementado para 6 e depois atribuído a resultado
        System.out.println(num); // imprime 6
        System.out.println(resultado); // imprime 6

        int num2 = 5;
        int resultado2 = num2++; //num é atribuído primeiramente à variável resultado e depois incrementado para 6
        System.out.println(num2); // imprime 6
        System.out.println(resultado2); // imprime 5

        //Comparando duas strings método equals()
        String senha = "12345";
        if (senha.equals("12345")) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta.");
        }

        //text block
        String mensagem = """
                  Olá, mundo!
                  Este é um Text Block.
                  Ele permite escrever textos com múltiplas linhas
                  sem precisar usar caracteres de escape ou quebras de linha manualmente ou concatenações.
                  """;
        System.out.println(mensagem);

        String nome = "Maria";
        int idade = 30;
        double valor = 55.9999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais%n", nome, idade, valor);

        String nome2 = "João";
        int aulas = 4;
        String mensagem2 = """
                  Olá, %s!
                  Boas vindas ao curso de Java.
                  Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                  """.formatted(nome2, aulas);

        System.out.println(mensagem2);
    }
}
