public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(50);
        boss.bossWeapon.setWeaponType(WeaponType.FIRE);
        System.out.println("Boss's --> "+boss.printInfo());

        Skeleton skeleton1 = new Skeleton();
        Skeleton skeleton2 = new Skeleton();

        skeleton1.setArrowCount(4);
        skeleton1.setHealth(250);
        skeleton1.setDamage(20);
        skeleton1.bossWeapon.setWeaponType(WeaponType.ARROW);
        System.out.println("Skeleton 1 --> "+skeleton1.printInfo());

        skeleton2.setArrowCount(3);
        skeleton2.setHealth(250);
        skeleton2.setDamage(15);
        skeleton2.bossWeapon.setWeaponType(WeaponType.ARROW);
        System.out.println("Skeleton 2 --> "+skeleton2.printInfo());

    }
}