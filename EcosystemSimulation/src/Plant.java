/**
 * Represents a plant in the ecosystem.
 *
 * <p>Plants grow and reproduce based on the resources available in the ecosystem.</p>
 */
public class Plant extends EcosystemEntity {

    /**
     * Constructor to initialize a plant entity.
     *
     * @param name         The name of the plant.
     * @param energy       The initial energy of the plant.
     * @param x            The x-coordinate of the plant.
     * @param y            The y-coordinate of the plant.
     * @param survivalRate The survival rate of the plant.
     */
    public Plant(String name, double energy, int x, int y, double survivalRate) {
        super(name, energy, x, y, survivalRate);
    }

    /**
     * Defines the behavior of the plant during a simulation step.
     * Plants grow and reproduce if they have enough energy.
     */
    @Override
    public void act() {
        grow();
        reproduce();
    }

    /**
     * Simulates the growth of the plant by increasing its energy.
     */
    private void grow() {
        energy += 5; // Plants gain energy naturally.
    }

    /**
     * Simulates the reproduction of the plant by consuming energy.
     * A new plant is created when the energy exceeds a threshold.
     */
    private void reproduce() {
        if (energy >= 20) {
            energy -= 10; // Plants use energy to reproduce.
            System.out.println(name + " reproduces.");
        }
    }
}
