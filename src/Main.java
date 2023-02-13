
public class Main {

    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener listener1 = System.out::println;
        int a = 0;
        Worker worker = new Worker(listener);
        Worker worker2 = new Worker(listener1);
        //worker.start(a);
        worker2.start(a);

    }

}

