package weixin.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by lidengqi on 2017/2/24.
 */
public class WeixinConfig {
    public WeixinConfig(){}
    private static Properties props = new Properties();
    static{
        try {
            props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("weixin.properties"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static String getValue(String key){
        return props.getProperty(key);
    }

    public static void updateProperties(String key,String value) {
        props.setProperty(key, value);
    }
}
