package co.com.qvision.petstore.utils.esperaexplicita;

import java.util.concurrent.Callable;

class Tiempo {

    private Tiempo() {}

    public static Callable<Boolean> successfulCondition() {
        return new Callable<Boolean>() {
            public Boolean call() throws Exception {
                Boolean allMessagesProcessed;
                allMessagesProcessed = true;
                return allMessagesProcessed;
            }
        };
    }

}
