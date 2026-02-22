public class Hero extends Character implements Voicelines {
    private int Level = 1;
    private Weapons equippedWeapon; // Add this field

    Hero(String name, int health, int mana, int attackDMG) {
        super(name, health, mana, attackDMG);
    }

    public void setWeapon(Weapons weapon) {
        this.equippedWeapon = weapon;
    }

    public Weapons getWeapon() {
        return equippedWeapon;
    }

    @Override
    public int getAttack() {
        int basePlusWeapon = super.getAttack();

        // Add weapon bonus if the hero has one
        if (equippedWeapon != null) {
            basePlusWeapon += equippedWeapon.getBonusDamage();
        }

        return basePlusWeapon * Level;
    }

    // ... rest of your Hero methods (addLevel, deathCry, etc.)
}