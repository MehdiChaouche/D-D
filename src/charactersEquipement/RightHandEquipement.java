package charactersEquipement;

public abstract class RightHandEquipement implements RightHandEquipementInterface {

    protected String name;
    protected int effect;

    public RightHandEquipement(String nameArg, int effectArg) {
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
