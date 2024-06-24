import javax.swing.*;

public class QQindex {
    public static void main(String[] args) {
     //创建窗口
        JFrame jFrame =new JFrame();
        jFrame.setBounds(700,300,450,500);
        //当我关闭窗口时程序自动结束
        jFrame.setDefaultCloseOperation(jFrame.EXIT_ON_CLOSE);
        //放图片
        JLabel jLabel =new JLabel(new ImageIcon(QQindex.class.getResource("qq/QQindex.png")));
        //swing 布局
        jFrame.add(jLabel,"North");

        //创建面板
        JPanel jPanel =new JPanel();
        jPanel .setLayout(null);
        //头像图片
        JLabel jLabel1=new JLabel(new ImageIcon(QQindex.class.getResource("qq/头像.png")));
        jLabel1.setBounds(35,20,80,80);
        jPanel.add(jLabel1);
        jFrame.add(jPanel);

        //文本框的创建
        JTextField jTextField =new JTextField();
        jTextField.setBounds(160,40,180,30);
        jPanel.add(jTextField);
        //密码框的
        JPasswordField jPasswordField =new JPasswordField();
        jPasswordField.setBounds(160,80,180,30);
        jPanel.add(jPasswordField);
        JCheckBox jCheckBox1 = new JCheckBox("找回密码");
        jCheckBox1.setBounds(250,110,180,30);
        jPanel.add(jCheckBox1);
        //复选框
        JCheckBox jCheckBox = new JCheckBox("记住密码");
        jCheckBox.setBounds(140,110,180,30);
        jPanel.add(jCheckBox);
        //注册账号
        JLabel jLabel2 =new JLabel("输入账号");
        jLabel2.setBounds(340,40,60,15);
        jPanel.add(jLabel2);
        //找回密码
        JLabel jLabel3 =new JLabel("输入密码");
        jLabel3.setBounds(340,80,60,30);
        jPanel.add(jLabel3);

        //登录
          JButton jButton = new JButton("登录");
          jButton.setBounds(80,170,252,40);
          jPanel.add(jButton);
        //显示界面
        jFrame.add(jPanel);
        jFrame.setVisible(true);
    }
}
