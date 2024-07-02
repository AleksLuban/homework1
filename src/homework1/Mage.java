package homework1;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Маг атакует врага");
        enemy.takeDamage(10);
        if (enemy.isAlive())
            super.setHealth(super.getHealth() - 5);

    }
}
