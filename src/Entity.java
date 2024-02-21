public class Entity {
    private String Name;
    private int MaxHealth;
    private int Health;

    // Constructor
    Entity(String name, int maxHealth){
        this.Name = name;
        this.MaxHealth = maxHealth;
        this.Health = maxHealth;
    }

    // Internal Functions
    public boolean Damage(int amount) {
        if (this.Health - amount <= 0) {
            this.Health = 0;
            return true;
        } else {
            this.Health -= amount;
        }

        return false;
    };

    public void Heal(int amount) {
        if (this.Health <= 0 || amount > 1) {
            System.out.println("Enemy has revived!");
        } else {
            System.out.printf("Enemy just healed %d health points", amount);
        }
        this.Health = Math.min(this.MaxHealth, amount);
    };

    public String getName() {
        return this.Name;
    };
}
