package homework1;

public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Воин атакует врага");
        enemy.takeDamage(6);
    }
}
