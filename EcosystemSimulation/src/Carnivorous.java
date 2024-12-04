/**
 * Represents a carnivorous animal in the ecosystem.
 *
 * <p>Carnivores hunt and eat other animals. They have specific behaviors for movement and feeding.</p>
 */
public class Carnivorous extends Animal {

    /**
     * Constructor to initialize a carnivorous animal.
     *
     * @param name         The name of the carnivore.
     * @param energy       The initial energy of the carnivore.
     * @param x            The x-coordinate of the carnivore.
     * @param y            The y-coordinate of the carnivore.
     * @param survivalRate The survival rate of the carnivore.
     * @param speed        The speed of the carnivore.
     */
    public Carnivorous(String name, double energy, int x, int y, double survivalRate, int speed) {
        super(name, energy, x, y, survivalRate, speed, "Carnivore");
    }

    /**
     * Defines the eating behavior of the carnivore.
     * Carnivores consume other animals to gain energy.
     *
     * @param entity The animal being consumed.
     */
    @Override
    public void eat(EcosystemEntity entity) {
        if (entity instanceof Animal && !(entity instanceof Carnivorous)) {
            adjustEnergy(entity.getEnergy());
            System.out.println(name + " hunts and eats " + entity.getName());
        }
    }

    /**
     * Defines the behavior of the carnivore during a simulation step.
     */
    @Override
    public void act() {
        move();
    }
}
