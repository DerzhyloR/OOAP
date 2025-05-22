package MKP4;

public interface Subject {
    void addObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers(Player tired);
}
