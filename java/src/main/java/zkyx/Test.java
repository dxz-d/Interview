package zkyx;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;

import java.util.List;

public class Test {

    //字符串内容 [{"age":42,"id":1,"male":true,"name":"Sherlock Holmes","schoolId":1},{"age":42,"id":2,"male":false,"name":"John Watson","schoolId":1}]
    public static final String json_array = "[{\"age\":42,\"id\":1,\"male\":true,\"name\":\"Sherlock Holmes\",\"schoolId\":1}," + "{\"age\":42,\"id\":2,\"male\":false,\"name\":\"John Watson\",\"schoolId\":1}]";

    public static void main(String[] args) {

        //将 json 字符串转为 JSONArray 对象
        JSONArray array = JSON.parseArray(json_array);
        //打印 JSONArray 对象
        System.out.println(array);

        //将 json 字符串转为 List 集合
        List<Student> students = JSON.parseArray(json_array, Student.class);
        //打印 List 集合大小
        System.out.println("students.size() : " + students.size());
        //遍历 List 集合中的元素
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
