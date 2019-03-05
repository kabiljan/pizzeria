import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Gui extends JFrame {
    private JButton button = new JButton("Далее");
    //private JTextField input = new JTextField("", 5);
    private JLabel labe1 = new JLabel("Доставка пицы");
    private JLabel labe2 = new JLabel("Выберите");
    private JRadioButton radio1 = new JRadioButton("Войти как покупатель");
    private JRadioButton radio2 = new JRadioButton("Войти как доставщик");
    //private JCheckBox check = new JCheckBox("Check", false);

    public  Gui() {
        super("Авторизация");
        this.setBounds(0, 0, 500, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());

        container.add(labe1,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(30,60,0,0),0,0));

        container.add(labe2,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(80,20,0,0),0,0));
        //container.add(input);

        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);

        container.add(radio1,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(150,50,0,80),0,0));

        radio1.setSelected(true);

        container.add(radio2, new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(200,50,0,0),0,0));


        //container.add(check);
        button.addActionListener(new ButtonEventListener());
        container.add(button,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(300,80,0,80),0,0));


    }

    class ButtonEventListener implements ActionListener {
        public  void actionPerformed (ActionEvent e) {
            Gui2 app2 = new Gui2();
            if (radio1.isSelected()) {
                dispose();
                app2.setVisible(true);
            }

        }
    }
}
