package Lab10;

abstract public class Building {
    public final void buildHouse() {
        buildFundament();
        buildWalls();
        buildRoof();
        buildAnotherComponent();
    }

    private void buildFundament() {
        System.out.println("Збудовано фундамент");
    }

    private void buildWalls() {
        System.out.println("Здубовано стіни");
    }

    private void buildRoof() {
        System.out.println("Збудовано дах");
    }

    protected abstract void buildAnotherComponent();
}
