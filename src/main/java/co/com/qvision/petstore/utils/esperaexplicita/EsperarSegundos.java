package co.com.qvision.petstore.utils.esperaexplicita;

import static co.com.qvision.petstore.utils.esperaexplicita.Tiempo.successfulCondition;


import org.awaitility.Awaitility;
import java.util.concurrent.TimeUnit;

public class EsperarSegundos {

    public void estosSegundos(int segundos) {
        try {
            Awaitility.await()
                    .forever()
                    .pollInterval(segundos, TimeUnit.SECONDS)
                    .until(successfulCondition());
        } catch (Exception e) {
            throw e;
        }
    }

}
