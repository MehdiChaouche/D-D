package characters;

public class Wizard extends Character implements WizardClassInterface {
    public static final int WIZARD_MAX_LIFE = 10;
    public static final int WIZARD_MIN_LIFE = 5;
    public static final int WIZARD_MAX_ATTACK_POWER = 10;
    public static final int WIZARD_MIN_ATTACK_POWER = 5;

    public Wizard() {
        this("Undefined", WIZARD_MIN_LIFE, WIZARD_MIN_ATTACK_POWER);
    }

    public Wizard(String nameArg) {
        this(nameArg, WIZARD_MIN_LIFE, WIZARD_MIN_ATTACK_POWER);
    }

    public Wizard(String nameArg, int lifeArg, int attackPowerArg) {
        if (nameArg.isEmpty() || WIZARD_MIN_LIFE > lifeArg || WIZARD_MAX_LIFE < lifeArg
                || WIZARD_MIN_ATTACK_POWER > attackPowerArg || WIZARD_MAX_ATTACK_POWER < attackPowerArg) {
            throw new IllegalArgumentException("Invalid Parameters.");
        }
        this.className = "Wizard";
        this.name = nameArg;
        this.life = lifeArg;
        this.attackPower = attackPowerArg;
    }

    public String toString() {
        return "Personnage " + this.name + " " + this.className + "\nLife : " + this.life
                + " Attack Power : " + this.attackPower;
    }
}
