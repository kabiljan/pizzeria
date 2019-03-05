import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Gui3 extends  JFrame {
    private JLabel label = new JLabel("Введите ваши данные");
    private JLabel label2 = new JLabel("Имя");
    private JLabel label3 = new JLabel("Фамилия");
    private JLabel label4 = new JLabel("Адрес");
    private JLabel label5 = new JLabel("Телефон");

    private JTextField input2 = new JTextField("", 15);
    private JTextField input3 = new JTextField("", 15);
    private JTextField input4 = new JTextField("", 15);
    private JTextField input5 = new JTextField("", 15);

    private JButton button = new JButton("Заказать");

    public Gui3() {
        this.setBounds( 0, 0, 500, 400 );
        this.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());

        container.add(label,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(30,150,0,0),0,0));

        container.add(label2,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(70,40,0,0),0,0));

                    container.add(input2,new GridBagConstraints(0,0,1,1,0.0,0.9,
                            GridBagConstraints.NORTH,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(70,130,0,0),0,0));

        container.add(label3,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(90,40,0,0),0,0));

                    container.add(input3,new GridBagConstraints(0,0,1,1,0.0,0.9,
                                GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL,
                                new Insets(90,130,0,0),0,0));


        container.add(label4,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(110,40,0,0),0,0));

                    container.add(input4,new GridBagConstraints(0,0,1,1,0.0,0.9,
                                GridBagConstraints.NORTH,
                                GridBagConstraints.HORIZONTAL,
                                 new Insets(110,130,0,0),0,0));

        container.add(label5,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(130,40,0,0),0,0));

                     container.add(input5,new GridBagConstraints(0,0,1,1,0.0,0.9,
                            GridBagConstraints.NORTH,
                            GridBagConstraints.HORIZONTAL,
                            new Insets(130,130,0,0),0,0));


        button.addActionListener(new ButtonEventListener());
        container.add(button,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(300,200,0,80),0,0));





    }
    class ButtonEventListener implements ActionListener {
        public  void actionPerformed (ActionEvent e) {
            DataBaseHandler dbHandler = new DataBaseHandler();
            String fname =  input2.getText();
            String lname =  input3.getText();
            String adres = input4.getText();
            String phone = input5.getText();


            dbHandler.signUpUser(fname,lname,adres,phone);
            }

        }
    }



