public class EcosystemSimulation {
    public static void main(String[] args) {
        Ecosystem ecosystem = new Ecosystem(50, 50);

        ecosystem.addEntity(new Plant("Grass1", 10, 5, 5, 0.8));
        ecosystem.addEntity(new Herbivorous("Rabbit1", 30, 10, 10, 0.9, 5));
        ecosystem.addEntity(new Carnivorous("Wolf1", 50, 20, 20, 0.7, 7));
        ecosystem.addEntity(new Omnivorous("Bear1", 100, 15, 15, 0.6, 4));

        for (int i = 0; i < 10; i++) {
            System.out.println("Step " + (i + 1));
            ecosystem.simulateStep();
            ecosystem.displayState();
            System.out.println();
        }
    }
}
