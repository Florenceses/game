package example.game_project;

public class Hero {

    protected int health, attack, armor;

    protected void setHealth(int health) {
        this.health = health;
        if (this.health < 0)
            this.health = 0;
    }

    protected boolean isAlive() {
        return health > 0;
    }

    protected void setAttack(int attack) {
        this.attack = attack;
    }

    protected void setArmor(int armor) {
        this.armor = armor;
    }

    protected int getHealth() {
        return health;
    }

    protected int getAttack() {
        return attack;
    }

    protected int getArmor() {
        return armor;
    }

    protected void attack(Hero enemy) {
        if (this.isAlive() && enemy.isAlive()) {
            int current = attack - enemy.getArmor();
            enemy.setHealth(enemy.getHealth() - ((current < 0)? 0 : current));
        }
    }
}

