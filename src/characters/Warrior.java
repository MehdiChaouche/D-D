package characters;

public class Warrior extends Character implements WarriorClassInterface {
    public static final int WARRIOR_MAX_LIFE = 10;
    public static final int WARRIOR_MIN_LIFE = 5;
    public static final int WARRIOR_MAX_ATTACK_POWER = 10;
    public static final int WARRIOR_MIN_ATTACK_POWER = 5;

    public Warrior() {
        this("Undefined", WARRIOR_MIN_LIFE, WARRIOR_MIN_ATTACK_POWER);
    }

    public Warrior(String nameArg) {
        this(nameArg, WARRIOR_MIN_LIFE, WARRIOR_MIN_ATTACK_POWER);
    }

    public Warrior(String nameArg, int lifeArg, int attackPowerArg) {
        super();
        if (nameArg.isEmpty() || WARRIOR_MIN_LIFE > lifeArg || WARRIOR_MAX_LIFE < lifeArg
                || WARRIOR_MIN_ATTACK_POWER > attackPowerArg || WARRIOR_MAX_ATTACK_POWER < attackPowerArg) {
            throw new IllegalArgumentException("Invalid Parameters.");
        }
        this.className = "Warrior";
        this.name = nameArg;
        this.life = lifeArg;
        this.attackPower = attackPowerArg;
    }

    public String toString() {
        return "Personnage " + this.name + " " + this.className + "\nLife : " + this.life
                + " Attack Power : " + this.attackPower;
    }

    // TODO
}
