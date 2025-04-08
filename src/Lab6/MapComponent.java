package Lab6;

public abstract  class MapComponent {
    protected MapComponent parent;
    protected String name;
    protected int _x, _y;

    public MapComponent(String name) {
        this.name = name;
    }

    public void setParent(MapComponent parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public abstract void draw(int x, int y);

    public MapComponent findChild(String name) {
        if (this.name.equals(name)) {
            return this;
        }
        return null;
    }


}
