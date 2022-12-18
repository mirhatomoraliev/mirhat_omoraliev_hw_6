public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        System.out.println(boss.printInfo(700,50,WeaponType.FIRE));

        Skeleton skeleton = new Skeleton();
        Skeleton skeleton2 = new Skeleton();
        skeleton.setArrowCount(4);
        skeleton2.setArrowCount(3);
        System.out.println("Skeleton 1 -- "+skeleton.printInfo(300,25,WeaponType.ARROW));
        System.out.println("Skeleton 2 -- "+skeleton.printInfo(300,20,WeaponType.ARROW));

    }
}