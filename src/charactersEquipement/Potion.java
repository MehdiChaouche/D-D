package charactersEquipement;

public class Potion extends LeftHandEquipement {

    public Potion() {
        this("Small health potion", 1);
    }

    public Potion(String nameArg, int effectArg) {
        super(nameArg, effectArg);
    }

}
