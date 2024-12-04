import java.util.ArrayList;
import java.util.List;

/**
 * Manages all entities within the ecosystem.
 *
 * <p>Provides functionality to add and remove entities, simulate interactions between them,
 * and display the state of the ecosystem after each simulation step.</p>
 */
public class Ecosystem {

    /** The list of all entities in the ecosystem. */
    private List<EcosystemEntity> entities;

    /** The size of the ecosystem's map. */
    private final int width;
    private final int height;

    /**
     * Constructor to initialize the ecosystem with a fixed map size.
     *
     * @param width The width of the map.
     * @param height The height of the map.
     */
    public Ecosystem(int width, int height) {
        this.entities = new ArrayList<>();
        this.width = width;
        this.height = height;
    }

    /**
     * Adds a new entity to the ecosystem.
     *
     * @param entity The entity to be added.
     */
    public void addEntity(EcosystemEntity entity) {
        entities.add(entity);
    }

    /**
     * Removes an entity from the ecosystem.
     *
     * @param entity The entity to be removed.
     */
    public void removeEntity(EcosystemEntity entity) {
        entities.remove(entity);
    }

    /**
     * Simulates one step in the ecosystem, allowing all entities to act.
     *
     * <p>Entities interact with each other, consume resources, and move around the map.</p>
     */
    public void simulateStep() {
        for (EcosystemEntity entity : entities) {
            entity.act();
        }
    }

    /**
     * Displays the current state of the ecosystem.
     *
     * <p>Prints information about each entity in the ecosystem.</p>
     */
    public void displayState() {
        System.out.println("Ecosystem State:");
        for (EcosystemEntity entity : entities) {
            System.out.println(entity.getName() + " at position " +
                    "(" + entity.getPosition()[0] + ", " + entity.getPosition()[1] + ") " +
                    "with energy: " + entity.getEnergy());
        }
    }

    /**
     * Retrieves the list of all entities in the ecosystem.
     *
     * @return The list of entities.
     */
    public List<EcosystemEntity> getEntities() {
        return entities;
    }
}
