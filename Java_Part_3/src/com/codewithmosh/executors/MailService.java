package com.codewithmosh.executors;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

public class MailService {
  public static void send() {
    LongTask.simulate();
    System.out.println("Mail was sent.");
    
  }

  public void sendAsync() {
      var result  = CompletableFuture.supplyAsync(new Supplier<Integer>() {
        @Override
        public Integer get() {
          send();
          return 1;
        }
      });
  }
}
