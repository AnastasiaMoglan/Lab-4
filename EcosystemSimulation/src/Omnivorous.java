/**
 * Represents an omnivorous animal in the ecosystem.
 *
 * <p>Omnivores eat both plants and animals. They have versatile behaviors for movement and feeding.</p>
 */
public class Omnivorous extends Animal {

    /**
     * Constructor to initialize an omnivorous animal.
     *
     * @param name         The name of the omnivore.
     * @param energy       The initial energy of the omnivore.
     * @param x            The x-coordinate of the omnivore.
     * @param y            The y-coordinate of the omnivore.
     * @param survivalRate The survival rate of the omnivore.
     * @param speed        The speed of the omnivore.
     */
    public Omnivorous(String name, double energy, int x, int y, double survivalRate, int speed) {
        super(name, energy, x, y, survivalRate, speed, "Omnivore");
    }

    /**
     * Defines the eating behavior of the omnivore.
     * Omnivores consume both plants and animals.
     *
     * @param entity The entity being consumed.
     */
    @Override
    public void eat(EcosystemEntity entity) {
        if (entity instanceof Plant || (entity instanceof Animal && !(entity instanceof Omnivorous))) {
            adjustEnergy(entity.getEnergy());
            System.out.println(name + " eats " + entity.getName());
        }
    }

    /**
     * Defines the behavior of the omnivore during a simulation step.
     */
    @Override
    public void act() {
        move();
    }
}
