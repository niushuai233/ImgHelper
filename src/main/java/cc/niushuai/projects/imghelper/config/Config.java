package cc.niushuai.projects.imghelper.config;

import cc.niushuai.projects.imghelper.enums.Symbols;

import java.util.HashMap;
import java.util.Map;

/**
 * 加载配置类
 *
 * @author niushuai
 * @date 2021/10/26 15:50:11
 */
public class Config {

    /**
     * all ready
     */
    private static final boolean ALL_READY = false;

    private static final Map<String, Object> CONFIG_MAP = new HashMap<>();

    /**
     * 程序启动时通过该方法加载配置到内存
     *
     * @author niushuai
     * @date: 2021/10/26 15:56:04
     * @return: {@link boolean}
     */
    public static void loadConfig() {

        CONFIG_MAP.put("author", "niushuai233");
        CONFIG_MAP.put("email", "shuai.niu@foxmail.com");
        CONFIG_MAP.put("version", "1.0");
        CONFIG_MAP.put("build_time", System.currentTimeMillis());

    }

    public static String getProperty(String key) {

        return getProperty(key, String.class);
    }

    public static <T> T getProperty(String key, Class<T> clazz) {

        Class<? super String> clazzx = null;
        return (T) getProperty(key, clazzx, "");
    }

    public static <T> T getProperty(String key, Class<T> targetType, T defaultValue) {
        T value = getPropertyValue(key, targetType);
        return (value != null ? value : defaultValue);
    }

    private static <T> T getPropertyValue(String key, Class<T> targetType) {



        return null;
    }
}
