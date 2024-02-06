// https://www.baeldung.com/spring-mvc-handlerinterceptor

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RateLimiter {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to rate limiter");

        BucketToken bucketToken = new BucketTokenImpl();
        RequestInterceptor requestInterceptor = new RequestInterceptor(bucketToken);

        ExecutorService executorService = Executors.newFixedThreadPool(15);
        
        for (int i = 0; i < 15; i++) {
            executorService.submit(() -> {

                System.out.println("Thread " + Thread.currentThread().getName()
                        + " requested for token, status of request : " + requestInterceptor.getAccess());
            });
        }

        executorService.shutdown();
    }
}
