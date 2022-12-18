public class Boss extends GameEntity {
    Weapon bossWeapon = new Weapon();

    public Weapon getBossWeapon() {
        return bossWeapon;
    }

    public void setBossWeapon(Weapon bossWeapon) {
        this.bossWeapon = bossWeapon;
    }

    public String printInfo(){
        return "Health:"+ this.getHealth() + " | Damage:"+ this.getDamage()+" | Attack type:"+bossWeapon.getWeaponType() ;
    }


    //    4. Создать класс Босса, наследовать его от класса GameEntity и дополнить его полем
//сложного типа данных Weapon (то есть дать оружие боссу). Также добавить
//геттеры и сеттеры для этого поля
}
