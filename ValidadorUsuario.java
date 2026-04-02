package ValidacaoDados;

public class ValidadorUsuario {
    public static void validarEmail(String email) throws EmailInvalidoException {
        if (email == null || !email.contains("@")) {
            throw new EmailInvalidoException("Email inválido: " + email);
        }
    }

    public static void validarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 0 || idade > 123) {
            throw new IdadeInvalidaException("Idade inválida: " + idade);
        }
    }
}
