public class App {
    public static void main(String[] args) throws Exception {
        Weapon AK47 = new Weapon("AK-47", 40, 100);
        Entity Enemy = new Entity("Enemy", 100);

        // Shooting the entity "Enemy"
        AK47.Shoot(Enemy);
        AK47.Shoot(Enemy);
        AK47.Shoot(Enemy);

        // Enemy heals up
        Enemy.Heal(100);

        // Shooting the entity "Enemy" again
        AK47.Shoot(Enemy);
        AK47.Shoot(Enemy);
        AK47.Shoot(Enemy);
    }
}
