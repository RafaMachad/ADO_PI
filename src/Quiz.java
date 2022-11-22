import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        boolean loop = true;

        System.out.println("_______________________________________________");
        System.out.println("            TESTE DE CONHECIMENTO"              );
        System.out.println("_______________________________________________");
        do {
            System.out.println("\n\nDe quem é a famosa frase “Penso, logo existo”?");
            System.out.println("[1] - Platão");
            System.out.println("[2] - Galileu Galilei");
            System.out.println("[3] - Descartes");
            System.out.println("[4] - Socrates");
            System.out.println("[5] - FECHAR PROGRAMA");
            opcao = sc.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Voce errou :(\nUma frase celebre de platao, na verdade seria: Uma vida não questionada não merece ser vivida.");

                    break;
                case 2:
                    System.out.println("Nao po, galileu foi o mano que inventou o telescopio nao foi?");
                    break;
                case 3:
                    System.out.println("Nao... DESCARTE essas ideias KKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKK");
                    break;
                case 4: 
                    System.out.println("Parabéns! Voce acertou!!!!!");
                    break;
                case 5:
                    loop = false;
                    break;
                default: 
                    System.out.println("OPCAO INVALIDA");
                    break;
            }
        } while (loop);
        
        






}
}
