public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(200, 50, "Boss");
        boss.setHp(200);
        boss.setDamege(50);
        boss.setName("Boss");
        boss.weapon.setWeaponType(WeaponType.GAS);
        boss.weapon.setName("Gas");
        System.out.println("hp: " + boss.getHp() + "\ndamage: " + boss.getDamege() + "\nname: " + boss.getName()
                + "\nWeaponType: " + boss.weapon.getWeaponType() + "\nname: " + boss.weapon.getName())
        ;
    }
}