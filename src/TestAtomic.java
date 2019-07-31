import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomic {
    AtomicInteger data = new AtomicInteger();
    public int getAndIncrement(){
        return data.incrementAndGet();
    }
    public static void main(String[] args) {
        TestAtomic t = new TestAtomic();
        Runnable r =()->{
            for(int i=0;i<20;i++){
                System.out.println(t.getAndIncrement());
            }
        };
        r.run();

    }
}






