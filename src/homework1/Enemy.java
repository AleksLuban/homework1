package homework1;

public class Enemy implements Mortal {

    private int health;

    public Enemy(int health) {
        if (health <= 0)
            this.health = 5;
        else this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health <= 0)
            this.health = 5;
        else this.health = health;
    }

    public void takeDamage(int damage) {
        health -= damage;

    }

    @Override
    public boolean isAlive() {
        if (health > 0)
            return true;
        else return false;
    }
}
