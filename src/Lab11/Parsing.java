package Lab11;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class Parsing extends RecursiveTask<List<String>> {
    private final List<String> urls;

    public Parsing(List<String> urls) {
        this.urls = urls;
    }

    @Override
    protected List<String> compute() {
        return null;
    }
}
