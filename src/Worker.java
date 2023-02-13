
public class Worker {

    private static OnTaskDoneListener callback;
    private static OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public static void start(int a) {

        while (a < 100) {
            a++;
            if (a == 33) {
                errorCallback.onError("Task " + a + " is not done");
                continue;
            }
            callback.onDone("Task " + a + " is done");
        }

    }


}
