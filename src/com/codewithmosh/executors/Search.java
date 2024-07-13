package com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class Search {
    private String destination; 
    private int nights; 
    private int traverls;
    private String site;
    private double cost; 
    
    public Search(String destination, int nights, int traverls, String site) {
        this.destination = destination;
        this.nights = nights;
        this.traverls = traverls;
        this.site = site; 
    }

    public void calculateQuote(){
            
            var destinationRate = CompletableFuture.supplyAsync(() -> Math.random());
            var nightsRate = CompletableFuture.supplyAsync(() -> (nights * 4 / 100));
            var traverlsRate  = CompletableFuture.supplyAsync(() -> (nights * 3 / 100));

            CompletableFuture.allOf(destinationRate,nightsRate,traverlsRate);

            try {
                var rate = (destinationRate.get() + nightsRate.get() + traverlsRate.get()) / 3;
                cost = rate * 350; 
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (ExecutionException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } 

                        
    }

    public void getQuote() { 
        System.out.println("Site: " + site + " Cost: " + cost );
    }
    
    public String getDestination() {
        return destination;
    }

    public int getNights() {
        return nights;
    }

    public int getTraverls() {
        return traverls;
    }
    

}
