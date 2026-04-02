package ValidacaoDados;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o email e a idade vamos testar essa bagaça! \n" );

        while(true) {
            System.out.println("\nDigite o email: ");
            String email = scanner.nextLine();

            System.out.println("Digite a idade: ");
            int idade = -1;
            try{
                idade= Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Idade deve ser um número inteiro.");
                continue;
            }

            Usuario usuario = new Usuario(email, idade);

            try {
                ValidadorUsuario.validarEmail(usuario.getEmail());
                ValidadorUsuario.validarIdade(usuario.getIdade());
                System.out.println("Usuário válido: " + usuario.getEmail() + ", " + usuario.getIdade());
            } catch (EmailInvalidoException e) {
                System.out.println("Erro: " + e.getMessage() + " Tente corrigir.");
            } catch (IdadeInvalidaException e) {
                System.out.println("Erro: " + e.getMessage() + " Tente corrigir.");
            }

            System.out.println("Deseja testar outro usuário? (s/n)");
            String resposta = scanner.nextLine();
            if (!resposta.equalsIgnoreCase("s")) {
                break;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
    
}
