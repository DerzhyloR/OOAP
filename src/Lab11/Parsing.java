package Lab11;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

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

    private String parsePage(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
            Element titleElement = doc.select("h1.product-title").first();
            String title = titleElement != null ? titleElement.text() : "Заголовка не знайдено";
            System.out.println("Заголовок з " + url + ": " + title);
            return "Заголовок з " + url + ": " + title;
        } catch (Exception e) {
            return "ПОМИЛКА ПАРСИНГУ САЙТУ: " + url;
        }
    }
}
