package Lab11;

import java.util.List;

public class Main {
    public static void main(String [] args){
        List<String> urls = List.of(
                "https://www.foxtrot.com.ua/uk/shop/smartfoniy_i_mobilniye_telefoniy_apple_iphone_15_plus_128gb_midnight.html",
                "https://www.foxtrot.com.ua/uk/shop/televizoriy-hisense-40a5nq.html"
        );
        Parsing task = new Parsing(urls);
        List<String> results = task.fork().join();
        System.out.println("Результати:");
        for (String result:results){
            System.out.println(result);
        }
    }
}
