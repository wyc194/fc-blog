package club.freecity.blog.util;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * BeanUtils
 * Created by w_yongchang@163.com at 2020/6/14 22:21
 */
public class BeanUtils {

    public static <T> void transform(T source, T target) {
        List<String> list = Lists.newArrayList("1", "2");
        System.out.println("util ...");
    }
}
