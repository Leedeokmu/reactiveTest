import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class FutureTest {
    public static void main(String[] args)  {
        try{
            SquareCalculator squareCalculator = new SquareCalculator();

            Future<Integer> future1 = squareCalculator.calculate(10);
            Future<Integer> future2 = squareCalculator.calculate(100);

            while (!(future1.isDone() && future2.isDone())) {
                System.out.println(
                        String.format(
                                "future1 is %s and future2 is %s",
                                future1.isDone() ? "done" : "not done",
                                future2.isDone() ? "done" : "not done"
                        )
                );
                Thread.sleep(300);
            }

            Integer result1 = future1.get();
            Integer result2 = future2.get();

            System.out.println(result1 + " and " + result2);

            squareCalculator.getExecutor().shutdown();
        } catch (Exception e){
            e.printStackTrace();
        }

    }
}

class SquareCalculator {
    private ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
    public Future<Integer> calculate(Integer input) {
        return executor.submit(() -> {
            System.out.printf("calculating square for: %d\n", input);
            TimeUnit.MILLISECONDS.sleep(2000);
            return input * input;
        });
    }
    public ThreadPoolExecutor getExecutor(){
        return executor;
    }
}