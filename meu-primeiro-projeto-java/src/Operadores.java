public class Operadores {
    public static void  main(String[] args) {
        String concatenacao = "?";

        concatenacao = "Jackson" + "Almeida";

        System.out.println(concatenacao);

        int a, b;

        a = 5;
        b = 4;

        String resultado = a==b ?"Verdadeiro" : "Falso";

        System.out.println(resultado);

        Boolean r1 = true;
        Boolean r2 = false;

        if (r1 && r2) {
            System.out.println("Ambos são verdadeiros");
        }

        if (r1 || r2) {
            System.out.println("Será falso");
        }
    }
}
