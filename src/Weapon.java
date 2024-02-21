public class Weapon {
    private String Name;
    private int Damage;
    private int HitChance;

    // Constructor
    Weapon(String name,int damage, int hitchance){
        this.Name = name;
        this.Damage = damage;
        this.HitChance = hitchance;
    }

    // Internal Functions
    public boolean Shoot(Entity entity) {
        boolean isDead = entity.Damage(this.Damage);
        
        if (isDead) {
            System.out.printf("You killed %s  \n", entity.getName());
        } else {
            System.out.printf("You dealt %d damage to %s  \n", this.Damage, entity.getName());
        };

        return false;
    }
}
