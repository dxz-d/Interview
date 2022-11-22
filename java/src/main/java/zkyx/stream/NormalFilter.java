package zkyx.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * https://blog.csdn.net/jerry11112/article/details/101376162
 * @Author: diaoxiuze
 * @Date: 2022/11/22 10:36
 */
public class NormalFilter {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        List<String> zhangList = new ArrayList<>();
        for (String name : list) {
            if (name.startsWith("张")) {
                zhangList.add(name);
            }
        }

        List<String> shortList = new ArrayList<>();
        for (String name : zhangList) {
            if (name.length() == 3) {
                shortList.add(name);
            }
        }

        for (String name : shortList) {
            System.out.println(name);
        }

        System.out.println("stream流");
        list.stream().filter(s -> s.startsWith("张")).filter(s -> s.length() == 3).forEach(System.out::println);

        // filter，用来过滤
        Stream<String> original = Stream.of("张无忌","张三丰","周芷若");
        Stream<String> result = original.filter(x -> x.endsWith("若"));
        result.forEach(name -> System.out.println("filter用来过滤" +name));

        // map
        // 将String类型的流转换为Integer类型
        Stream<String> stringStream = Stream.of("1", "2", "3", "4", "5", "6");
        stringStream.map(str -> Integer.parseInt(str)).forEach(System.out::println);
    
        // contract,两个流合并成一个流
        Stream<String> stream = Stream.of("张无忌", "张翠山");
        Stream<String> streamA = Stream.of("美羊羊", "喜羊羊");

        /// 写法1
        // Stream.concat(stream, streamA).forEach(System.out::println);
        // 写法2
        Stream<String> concat = Stream.concat(stream, streamA);
        concat.forEach(name-> System.out.println(name));
    }
}
