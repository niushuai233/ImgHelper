package cc.niushuai.projects.imghelper.frames;

import cc.niushuai.projects.imghelper.optionpane.AboutPane;

import javax.swing.*;
import java.awt.*;

/**
 * 主应用 主要逻辑
 *
 * @author niushuai
 * @date 2021/10/28 9:53:15
 */
public class App {

    private JFrame mainFrame;
    private JPanel mainPanel;

    private String name;

    public App(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run() {

        // 设置默认风格
        setStyle(null);

        // 初始化
        this.init();
        // 准备面板
        // this.preparePanel();
        // 准备菜单
        this.prepareMenu();

        // 调用此方法后 会根据frame内部组件大小自适应调整size
        // mainFrame.pack();

        mainFrame.setVisible(true);
    }

    private void prepareMenu() {

        JMenuBar bar = new JMenuBar();

        JMenu fileMenu = new JMenu("设置");
        JMenuItem settingMenuItem = new JMenuItem("首选项");
        fileMenu.add(settingMenuItem);

        bar.add(fileMenu);

        JMenu otherMenu = new JMenu("其他");
        JMenuItem aboutMenuItem = new JMenuItem("关于");
        aboutMenuItem.addActionListener(e -> {
            new AboutPane().run();
        });
        otherMenu.add(aboutMenuItem);

        bar.add(otherMenu);

        mainFrame.setJMenuBar(bar);
    }

    private void preparePanel() {
        mainPanel = new JPanel();
        mainFrame.add(mainPanel);
    }

    private void init() {
        mainFrame = new JFrame(this.getName());
        // 设定宽高
        mainFrame.setSize(400, 400);
        // 居中显示
        mainFrame.setLocationRelativeTo(null);
        // 设定组件样式
        mainFrame.setLayout(new GridLayout(3, 1));
        // 设置关闭退出
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void setStyle(String style) {
        if (null == style) {
            style = UIManager.getSystemLookAndFeelClassName();
        }
        try {
            UIManager.setLookAndFeel(style);
        } catch (Exception e) {
            System.out.println("设置风格失败");
            e.printStackTrace();
        }
    }

}


