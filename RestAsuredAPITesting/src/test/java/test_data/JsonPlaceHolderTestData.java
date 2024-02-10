package test_data;

import org.json.JSONObject;

public class JsonPlaceHolderTestData {
    public int successfulStatusCode = 200;

    public JSONObject expectedDataCreate(){
     JSONObject body = new JSONObject();
     body.put("userId",3);
     body.put("id",22);
     body.put("title","dolor sint quo a velit explicabo quia nam");
     body.put("body","eos qui et ipsum ipsam suscipit aut\n" +
             "sed omnis non odio\n"+
             "expedita earum mollitia molestiae aut atque rem suscipit\n" +
             "nam impedit esse");
     return body;
    }
}
