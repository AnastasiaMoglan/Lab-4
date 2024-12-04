/**
 * Abstract class representing an animal in the ecosystem.
 *
 * <p>Animals can move, eat, and interact with other entities.</p>
 */
public abstract class Animal extends EcosystemEntity {

    /** The speed of the animal, affecting how far it can move in a single step. */
    protected int speed;

    /** The food type of the animal (e.g., herbivore, carnivore, omnivore). */
    protected String foodType;

    /**
     * Constructor to initialize an animal entity.
     *
     * @param name         The name of the animal.
     * @param energy       The initial energy of the animal.
     * @param x            The x-coordinate of the animal.
     * @param y            The y-coordinate of the animal.
     * @param survivalRate The survival rate of the animal.
     * @param speed        The speed of the animal.
     * @param foodType     The type of food the animal consumes.
     */
    public Animal(String name, double energy, int x, int y, double survivalRate, int speed, String foodType) {
        super(name, energy, x, y, survivalRate);
        this.speed = speed;
        this.foodType = foodType;
    }

    /**
     * Abstract method for eating behavior, to be implemented by subclasses.
     *
     * @param entity The entity being consumed.
     */
    public abstract void eat(EcosystemEntity entity);

    /**
     * Simulates the movement of the animal within the ecosystem.
     */
    public void move() {
        x += (int) (Math.random() * speed) - speed / 2;
        y += (int) (Math.random() * speed) - speed / 2;
        energy -= 1; // Movement consumes energy.
        System.out.println(name + " moves to (" + x + ", " + y + ").");
    }

    /**
     * Checks if the animal's energy has reached zero, indicating death.
     */
    public void checkEnergy() {
        if (energy <= 0) {
            System.out.println(name + " has died.");
        }
    }
}
