package characters;

public abstract class Character implements CharacterClassInterface {
    protected String className;
    protected String name;
    protected int life;
    protected int attackPower;
    protected String imageUrl;

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    public void setLife(int newLife) {
        if (newLife > 10) {
            this.life = 10;
        } else if (newLife < 0) {
            this.life = 0;
        } else {
            this.life = newLife;
        }
    }

    public int getLife() {
        return this.life;
    }

    public void setAttackPower(int newAttackPower) {
        if (newAttackPower > 10) {
            this.attackPower = 10;
        } else {
            this.attackPower = newAttackPower;
        }
    }

    public int getAttackPower() {
        return this.attackPower;
    }

    public void setImageUrl(String newImageUrl) {
        this.imageUrl = newImageUrl;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}