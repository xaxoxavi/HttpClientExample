import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class HttpClientExample {

    // HTTP GET request
    public String sendGet(Map<String,String> variables) throws Exception {

        StringBuilder query = new StringBuilder();

        query.append("?");
        if (variables != null && variables.keySet().size() > 0){
            for (String key : variables.keySet()){
                query.append(key).append("=").append(variables.get(key));
            }
        }

        //Dentro de query tendremos la parte de la url ?q=developer correspondiente al tutorial



        return "";
    }

    // HTTP POST request
    public String sendPost(Map<String,String> parametros) throws Exception {

        /** codigo del tutorial */

        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();

        if (parametros != null && parametros.keySet().size() > 0){
            for (String key : parametros.keySet()) {
                urlParameters.add(new BasicNameValuePair(key, parametros.get(key)));
            }
        }
        //Dentro de urlParamaters tendremos los parametros que queremos enviar por POST

        /** enviar peticion*/

        /** procesar respuesta */

        return "";
    }
}
