package cc.niushuai.projects.imghelper.optionpane;

import javax.swing.*;

/**
 * 关于页
 *
 * @author niushuai
 * @date 2021/10/28 11:32:07
 */
public class AboutPane {


    public void run() {

        StringBuffer buffer = new StringBuffer();

        buffer.append("\n图床工v1.0 © 版权所有 2021.10 @niushuai233\n\n" +
                "主页：https://github.com/niushuai233\n" +
                "邮箱：shuai.niu@foxmail.com");


        JOptionPane.showMessageDialog(null, buffer.toString(), "关于", JOptionPane.DEFAULT_OPTION);
    }
}
