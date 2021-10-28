package cc.niushuai.projects.imghelper;

import cc.niushuai.projects.imghelper.config.Config;
import cc.niushuai.projects.imghelper.frames.App;

/**
 * 图床工具
 *
 * @author niushuai
 * @date 2021/10/26 15:49:12
 */
public class ImgHelperApplication {

    /**
     * 图床工具入口
     *
     * @param args
     * @author niushuai
     * @date: 2021/10/26 15:49:35
     * @return: {@link Void}
     */
    public static void main(String[] args) {

        // 读取配置文件加载到内存
        Config.loadConfig();

        // 启动 app
        new App("图床工").run();
    }

}
