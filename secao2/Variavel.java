package secao2;

public class Variavel {

    public static void main(String[] args) {
       
        // 1 - O que são variaveis?
        // tipo -> nome -> atribuir um valor;

        String nome = "João";

        // nome => "João"
        System.out.println(nome);

        // 2 - Atribuição de variavel com outra

        String teste = "Teste";
        
        String testando = teste;

        System.out.println(testando);

        // 3 - Comentarios em Java

        // Comentario de linha

        /* Comentario de multiplas linhas / bloco
           Linha 2
         */ 

         /** Comentario para documentações, utilizado para documentações
          * Ex: Funcao Soma
          * param1: primeiro numero
          * param2: segundo numero
          * Retorno: a Soma.
         */

        // 4 - Strings
        String firstName = "João";
        String lastName = "Ladeira";

        System.out.println("João Ladeira");

        System.out.println(firstName + " " + lastName);
        
        // concateção 

        String fullName = (firstName + " " + lastName);

        System.out.println(fullName);
        
        // 5 - char

        char letra = 'A';

        System.out.println(letra);

        char letra2 = 'A';

        System.out.println(letra2);

        char simbolo = '$';

        System.out.println(simbolo);

        // 6 - int

        int n = 10;

        System.out.println(n);

        System.out.println(n + n);
        
        System.out.println(n * 10);

        int soma = n + 258;

        System.out.println(soma);
    }
}
