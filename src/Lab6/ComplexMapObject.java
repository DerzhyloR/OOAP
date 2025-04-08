package Lab6;

import java.util.ArrayList;
import java.util.List;

public class ComplexMapObject extends MapComponent  {
    public List<MapComponent> children = new ArrayList<>();

    public ComplexMapObject(String name, int x, int y) {
        super(name);
        this._x = x;
        this._y = y;
    }

    public void addComponent(MapComponent component) {
        component.setParent(this);
        children.add(component);
    }

    @Override
    public void draw(int x, int y) {
        int X = x + _x;
        int Y = y + _y;
        System.out.println("Малювання складного об'єкту " + name + " за координатами (" + X + ", " + Y + ")");
        for (MapComponent child : children) {
            child.draw(X, Y);
        }
    }

    @Override
    public MapComponent findChild(String name) {
        if (this.name.equals(name)) {
            return this;
        }
        for (MapComponent child : children) {
            MapComponent found = child.findChild(name);
            if (found != null) {
                return found;
            }
        }
        return null;
    }
}
