package homework1;

public abstract class Hero implements Mortal {

    private int health;
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    private String name;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public String getName() {
        return name;
    }

    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        if (health > 0)
            return true;
        else return false;
    }

}
