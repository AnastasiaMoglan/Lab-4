/**
 * Represents a herbivorous animal in the ecosystem.
 *
 * <p>Herbivores eat plants and have specific behaviors for movement and feeding.</p>
 */
public class Herbivorous extends Animal {

    /**
     * Constructor to initialize a herbivorous animal.
     *
     * @param name         The name of the herbivore.
     * @param energy       The initial energy of the herbivore.
     * @param x            The x-coordinate of the herbivore.
     * @param y            The y-coordinate of the herbivore.
     * @param survivalRate The survival rate of the herbivore.
     * @param speed        The speed of the herbivore.
     */
    public Herbivorous(String name, double energy, int x, int y, double survivalRate, int speed) {
        super(name, energy, x, y, survivalRate, speed, "Herbivore");
    }

    /**
     * Defines the eating behavior of the herbivore.
     * Herbivores consume plants to gain energy.
     *
     * @param entity The plant being consumed.
     */
    @Override
    public void eat(EcosystemEntity entity) {
        if (entity instanceof Plant) {
            adjustEnergy(entity.getEnergy());
            System.out.println(name + " eats " + entity.getName());
        }
    }

    /**
     * Defines the behavior of the herbivore during a simulation step.
     */
    @Override
    public void act() {
        move();
    }
}
