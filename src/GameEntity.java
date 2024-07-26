public class GameEntity {
    private int hp;
    private int damege;
    private String name;

    public GameEntity(int hp, int damege, String name) {
        this.hp = hp;
        this.damege = damege;
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamege() {
        return damege;
    }

    public void setDamege(int damege) {
        this.damege = damege;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}