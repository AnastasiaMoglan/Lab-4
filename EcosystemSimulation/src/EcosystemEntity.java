/**
 * Abstract class representing a general entity in the ecosystem.
 *
 * <p>Each entity has common attributes such as name, energy, position, and survival rate.
 * It defines abstract behavior that all entities must implement.</p>
 */
public abstract class EcosystemEntity {

    /** The name of the entity. */
    protected String name;

    /** The energy level of the entity. */
    protected double energy;

    /** The x-coordinate position of the entity. */
    protected int x;

    /** The y-coordinate position of the entity. */
    protected int y;

    /** The survival rate of the entity. */
    protected double survivalRate;

    /**
     * Constructor to initialize an ecosystem entity.
     *
     * @param name         The name of the entity.
     * @param energy       The initial energy of the entity.
     * @param x            The x-coordinate of the entity.
     * @param y            The y-coordinate of the entity.
     * @param survivalRate The survival rate of the entity.
     */
    public EcosystemEntity(String name, double energy, int x, int y, double survivalRate) {
        this.name = name;
        this.energy = energy;
        this.x = x;
        this.y = y;
        this.survivalRate = survivalRate;
    }

    /**
     * Abstract method defining the behavior of the entity in each simulation step.
     */
    public abstract void act();

    /**
     * Retrieves the name of the entity.
     *
     * @return The name of the entity.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the current energy level of the entity.
     *
     * @return The energy level of the entity.
     */
    public double getEnergy() {
        return energy;
    }

    /**
     * Adjusts the energy level of the entity.
     *
     * @param amount The amount to adjust the energy by (positive or negative).
     */
    public void adjustEnergy(double amount) {
        this.energy += amount;
    }

    /**
     * Retrieves the position of the entity.
     *
     * @return An array containing the x and y coordinates.
     */
    public int[] getPosition() {
        return new int[] {x, y};
    }

    /**
     * Updates the position of the entity.
     *
     * @param x The new x-coordinate.
     * @param y The new y-coordinate.
     */
    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
