package homework1;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);

    }

    public void takeDamage(int damage) {

        super.takeDamage(damage);
        if (!super.isAlive())
            super.setHealth(7);
    }
}
