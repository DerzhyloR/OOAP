package Lab11;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.RecursiveTask;

public class Parsing extends RecursiveTask<List<String>> {
    private final List<String> urls;

    public Parsing(List<String> urls) {
        this.urls = urls;
    }

    @Override
    protected List<String> compute() {
        List<String> results = new ArrayList<>();
        if (urls.size() == 1) {
            String url = urls.get(0);
            results.add(parsePage(url));
        } else {
            int mid = urls.size() / 2;
            Parsing task1 = new Parsing(urls.subList(0, mid));
            Parsing task2 = new Parsing(urls.subList(mid, urls.size()));
            task1.fork();
            List<String> result2 = task2.compute();
            List<String> result1 = task1.join();
            results.addAll(result1);
            results.addAll(result2);
        }
        return results;
    }

    private String parsePage(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element titleElement = doc.select("h1").first();
            String title = titleElement != null ? titleElement.text() : "Заголовка не знайдено";
            return "Заголовок з " + url + ": " + title+"\n";
        } catch (Exception e) {
            return "ПОМИЛКА ПАРСИНГУ САЙТУ: " + url;
        }
    }
}
