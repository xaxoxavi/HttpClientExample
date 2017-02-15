import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author Xavi Torrens
 */
public class HttpClientExampleTest {
    @org.junit.Test
    public void sendGet() throws Exception {

        HttpClientExample httpClientExample = new HttpClientExample();


        //Rellenamos parametros que queremos enviar
        Map<String,String> parametros = new HashMap<String, String>();
        parametros.put("var1","1");
        parametros.put("var2","2");
        parametros.put("var3","3");


        /** Llamar al método correspondiente */

        //Comprovar que dentro del JSON resultante se encuentra:
        /* "args": {
                "var1": "1",
                "var2": "2",
                 "var3": "3"
                },
         */
        boolean condicionJsonResultante = true;
        assertTrue(condicionJsonResultante);

    }

    @org.junit.Test
    public void sendPost() throws Exception {

        HttpClientExample httpClientExample = new HttpClientExample();

        //Rellenamos parametros que queremos enviar
        Map<String,String> parametros = new HashMap<String, String>();
        parametros.put("var1","1");
        parametros.put("var2","2");
        parametros.put("var3","3");



        //Compovar que en el Json resultante se encuentra:
        /* "form": {
                 "var1": "1",
                 "var2": "2",
                 "var3": "3"
             }
         */

        boolean condicionJsonResultante = true;
        assertTrue(condicionJsonResultante);

    }

}