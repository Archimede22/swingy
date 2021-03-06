import fr.swingy.app;

public class Orc extends LivingBeing implements Monster
{
    private static int orcAttack = 1;
    private static int orcDefense = 0;
    private static int orcHitPoints = 7;
    private static int orcExperience = 500;

    public Orc(int x, int y)
    {
        int attack = orcAttack + ThreadLocalRandom.current().nextInt(0, 1 + 1);
        int defense = orcDefense + ThreadLocalRandom.current().nextInt(0, 1 + 1);
        int hitPoints = orcHitPoints + ThreadLocalRandom.current().nextInt(-2, 2 + 1);

        super(x, y, "Orc", attack, defense, hitPoints);
    }
}