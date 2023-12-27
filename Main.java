import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Lutador l[] = new Lutador[10];
        l[0] = new Lutador("Thor", "Asgard", 1500, 2.03f, 120.0f, 100, 0, 0);
        l[1] = new Lutador("Hulk", "Estados Unidos", 45, 2.50f, 450.0f, 50, 0, 0);
        l[2] = new Lutador("Homem de Ferro", "Estados Unidos", 40, 1.85f, 85.0f, 80, 2, 1);
        l[3] = new Lutador("Viúva Negra", "Rússia", 35, 1.70f, 60.0f, 70, 1, 0);
        l[4] = new Lutador("Capitão América", "Estados Unidos", 100, 1.88f, 95.0f, 90, 3, 2);
        l[5] = new Lutador("Pantera Negra", "Wakanda", 35, 1.82f, 85.0f, 75, 1, 1);
        l[6] = new Lutador("Gavião Arqueiro", "Estados Unidos", 38, 1.82f, 85.0f, 60, 4, 3);
        l[7] = new Lutador("Feiticeira Escarlate", "Estados Unidos", 32, 1.63f, 55.0f, 45, 2, 1);
        l[8] = new Lutador("Visão", "Estados Unidos", 3, 1.91f, 105.0f, 30, 1, 0);
        l[9] = new Lutador("Máquina de Combate", "Estados Unidos", 42, 1.85f, 95.0f, 65, 3, 2);

       // Exibir informações de todos os lutadores
       for (int i = 0; i < l.length; i++) {
        System.out.println("Lutador " + i + ":");
        l[i].apresentar();
        System.out.println();
    }

        System.out.println("Escolha o lutador 1 (0-9):");
        int lutador1Index = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada

        System.out.println("Escolha o lutador 2 (0-9):");
        int lutador2Index = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer de entrada


        Lutador lutador1 = l[lutador1Index];
        Lutador lutador2 = l[lutador2Index];

        Luta luta = new Luta();
        luta.marcarLuta(lutador1, lutador2);
        luta.lutar();

        lutador1.status();
        System.out.println(" --~--~--~--~--");
        lutador2.status();

        scanner.close();
    }
}
