package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Document;

import java.io.IOException;

public class MyParse {
    public static void main(String[] args) {

        try {
            Document document = (Document) Jsoup.connect("https://ru.wikipedia.org/wiki/").get();
            //Element elements = document.select("h1").get(1);
            String h1 = document.select("span").get(5).attr("id");

            //System.out.println(elements);
            System.out.println(h1);


        } catch (IOException ex) {
            ex.getMessage();
        }
    }
}
