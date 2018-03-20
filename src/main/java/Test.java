import java.util.HashMap;
import com.alibaba.fastjson.JSONObject;

public class Test {
    public static void main(String[] args) {
        RespObject resp = new RespObject();
        //业务成功返回给前端
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put("成功1","xxxxx");
        data.put("成功2","xxxx3x");
        resp.setData(data);
        System.out.println(JSONObject.toJSON(resp));

        //业务失败返回给前端
        resp.setFailResult();
        HashMap<String, Object> fail = new HashMap<String, Object>();
        fail.put("原因1","xxxxx");
        fail.put("原因2","xxxx3x");
        resp.setData(fail);
        System.out.println(JSONObject.toJSON(resp));


    }
}
