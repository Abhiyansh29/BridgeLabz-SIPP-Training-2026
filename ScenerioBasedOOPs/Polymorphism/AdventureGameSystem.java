class GameCharacter {
    protected String characterName;

    public GameCharacter(String characterName) {
        this.characterName = characterName;
    }

    public void performAttack() {
        System.out.println("Basic Attack");
    }
}

class Warrior extends GameCharacter {

    public Warrior(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " attacks with Sword!");
    }
}

class Mage extends GameCharacter {

    public Mage(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " casts Fireball!");
    }
}

class Archer extends GameCharacter {

    public Archer(String characterName) {
        super(characterName);
    }

    @Override
    public void performAttack() {
        System.out.println(characterName +
                " shoots an Arrow!");
    }
}

public class AdventureGameSystem {

    public static void startBattle(GameCharacter[] characters) {

        int warriors = 0;
        int mages = 0;
        int archers = 0;

        System.out.println("=== Battle Started ===");

        for (GameCharacter c : characters) {

            c.performAttack();

            if (c instanceof Warrior)
                warriors++;
            else if (c instanceof Mage)
                mages++;
            else if (c instanceof Archer)
                archers++;
        }

        System.out.println("\nParticipants Summary");
        System.out.println("Warriors : " + warriors);
        System.out.println("Mages    : " + mages);
        System.out.println("Archers  : " + archers);
    }

    public static void main(String[] args) {

        GameCharacter[] characters = {
                new Warrior("Thor"),
                new Mage("Merlin"),
                new Archer("Robin"),
                new Warrior("Leon")
        };

        startBattle(characters);
    }
}