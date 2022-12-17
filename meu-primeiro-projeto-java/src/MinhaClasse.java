public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Jackson";
        String segundoNome = "Almeida";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNOme) {
        return primeiroNome.concat(" ").concat(segundoNOme);
    }
}
