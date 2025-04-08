package Lab6;

public class SimpleObject extends MapComponent {
    public SimpleObject(String name, int x, int y) {
        super(name);
        this._x = x;
        this._y = y;
    }

    @Override
    public void draw(int x, int y) {
        int X = x + _x;
        int Y = y + _y;
        System.out.println("Намальовано " + name + " за координатами (" + X + ", " + Y + ")");
    }
}
