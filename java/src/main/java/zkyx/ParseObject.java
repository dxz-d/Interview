package zkyx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class ParseObject {
    public static void main(String[] args) {

        String result = "{\"success\":\"true\";" + "\"returnAddress\":\"123\"}";

        JSONObject jsonObject= JSON.parseObject(result);      //转换成object
        jsonObject.getString("returnAddress");    //获取object中returnAddress字段;
    }
}
