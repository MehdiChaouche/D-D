package charactersEquipement;

public abstract class LeftHandEquipement implements LeftHandEquipementInterface {

    protected String name;
    protected int effect;

    public LeftHandEquipement(String nameArg, int effectArg) {
        name = nameArg;
        effect = effectArg;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setEffect(int newEffect) {
        this.effect = newEffect;
    }

    public int getEffect() {
        return this.effect;
    }
}
