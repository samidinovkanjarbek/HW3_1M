
public class Boss extends GameEntity {
    Weapon weapon = new Weapon();


    public Boss(int hp, int damege, String name) {
        super(hp, damege, name);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}

