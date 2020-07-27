package com.jeremy.stockscraping;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class ScrapeCurrencyCourt {

    public double extractDataWithJsoup(String href) throws ParseException {
        Document doc = null;
        try {
            doc = Jsoup.connect(href).timeout(10*1000).userAgent
                    ("Mozilla").ignoreHttpErrors(true).get();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String title = doc.title();
        String text = doc.body().text();
        Elements links = doc.select("section[class=currency]");
        String desc = links.text();

        String result = desc.split("\\$")[0];
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        Number number = format.parse(result);
        double d = number.doubleValue();
        return d;
    }
}
