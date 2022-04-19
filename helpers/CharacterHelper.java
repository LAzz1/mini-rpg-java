package helpers;

import model.Character;

import java.util.Scanner;

public class CharacterHelper {

    public static Character characterFactory(String decision){
        switch(decision){
            case "1":
                return new Character("Arqueiro", 0.6);
            case "2":
                return new Character("Cavaleiro", 0.75);
            case "3":
                return new Character("Mago", 0.5);
            default:
                System.out.println("Personagem inválido!");
                System.exit(1);
        }
        return null;
    }

    public static void play(Character attacker, Character defenser, Boolean isPlayer){
        Double damage;
        Scanner sys = new Scanner(System.in);
        if (isPlayer){
            System.out.println("Atacar ou se curar? 1 para atacar / 2 para se curar");
            String move = sys.nextLine();
            if (move.equals("1")){
                damage = Math.floor(attacker.getStrength() * (Math.random() * (6 - 1)) + 1);
                System.out.print("Você atacou e causou " + damage + " de dano\n");
                defenser.setHp(defenser.getHp() - damage);
            }
            else if (move.equals("2")){
                System.out.print("Você se curou!\n");
                attacker.setHp(attacker.getHp() + 10);
            }
        }
        else {
            if ((Math.random() * (10 - 1)) + 1 > 5){
                damage = Math.floor(attacker.getStrength() * (Math.random() * (6 - 1)) + 1);
                System.out.print("O inimigo te atacou e causou " + damage + " de dano\n");
                defenser.setHp(defenser.getHp() - damage);
            }
            else{
                System.out.print("O inimigo se curou!\n");
                attacker.setHp(attacker.getHp() + 10);
            }
        }
    }

}
