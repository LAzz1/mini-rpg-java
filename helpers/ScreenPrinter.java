package helpers;

import model.Character;

public class ScreenPrinter {

    public static void startGame(Character player, Character enemy){
        System.out.println("######## O jogo irá começar! ########\n");

        System.out.println("Jogador:\n");
        System.out.println("Nome: " + player.getName());
        System.out.println("Força: " + player.getStrength());
        System.out.println("Vida Inicial: " + player.getHp()+"\n");

        System.out.println("Inimigo:\n");
        System.out.println("Nome: " + enemy.getName());
        System.out.println("Força: " + enemy.getStrength());
        System.out.println("Vida Inicial: " + enemy.getHp()+"\n");

        System.out.println("######## ######## ########\n");
    }

    public static void refreshData(Character player, Character enemy, Integer timer) {
        System.out.println("######## Rodada " + timer + "! ########\n");
        System.out.println("Jogador:\n");
        System.out.println("Nome: " + player.getName());
        System.out.println("Força: " + player.getStrength());
        System.out.println("Vida Inicial: " + player.getHp()+"\n");

        System.out.println("Inimigo:\n");
        System.out.println("Nome: " + enemy.getName());
        System.out.println("Força: " + enemy.getStrength());
        System.out.println("Vida Inicial: " + enemy.getHp()+"\n");

        System.out.println("######## ######## ########\n");
    }

    public static void printWinner(Character player, Character enemy) {
        if(enemy.getHp() < 0){
            System.out.println("Parabéns! o vencedor foi: " + player.getName());
        }
        else{
            System.out.println("Você perdeu... o vencedor foi: " + enemy.getName());
        }
    }
}

