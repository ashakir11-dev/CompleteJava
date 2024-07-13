package com.codewithmosh;

import com.codewithmosh.executors.CompletableFuturesDemo;
import com.codewithmosh.executors.MailService;
import com.codewithmosh.executors.Search;

public class Main {
    @SuppressWarnings("static-access")
    public static void main(String[] args) {
        var quote1 = new Search("Iraq", 2, 3, "Ex");
        quote1.calculateQuote();
        quote1.getQuote(); 
    }
}
