package homework1;

public class TrainingGround {

    public static void main(String[] args) {

        Mage mage = new Mage("Gendalf", 30);

        Zombie zombie = new Zombie(16);

        mage.attackEnemy(zombie);
        mage.attackEnemy(zombie);

        System.out.println(zombie.getHealth());
        System.out.println(zombie.isAlive());
        System.out.println(mage.getHealth());
    }
}
