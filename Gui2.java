import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Gui2 extends JFrame {

    private JLabel label = new JLabel("Выберите пиццу");
    private JRadioButton radio1 = new JRadioButton("Пицца c грибами");
    private JRadioButton radio2 = new JRadioButton("Пицца с курицей");
    private JRadioButton radio3 = new JRadioButton("Пицца с сыром");
    private JRadioButton radio4 = new JRadioButton("Пицца с морепродуктами");
    private JButton button = new JButton("Далее");

    public Gui2() {
        this.setBounds(0, 0, 700, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = this.getContentPane();
        container.setLayout(new GridBagLayout());
        ButtonGroup group = new ButtonGroup();
        group.add(radio1);
        group.add(radio2);
        group.add( radio3 );
        group.add( radio4 );

        container.add(radio1,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(170,100,0,330),0,0));

        radio1.setSelected(true);

        container.add(radio2,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(170,390,0,0),0,0));

        container.add(radio3,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(330,100,0,330),0,0));

        container.add(radio4,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(330,390,0,0),0,0));

        container.add(label,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(30,250,0,0),0,0));
        button.addActionListener(new ButtonEventListener());
        container.add( button,new GridBagConstraints(0,0,1,1,0.0,0.9,
                GridBagConstraints.NORTH,
                GridBagConstraints.HORIZONTAL,
                new Insets(420,300,0,0),0,0));

        JFrame frame = new JFrame(  );
        imgs panel = new imgs();
        frame.getContentPane().add(panel);
        frame.setSize( 200,150 );
        container.add(panel,new GridBagConstraints(0,0,0,0,0.0,0.9,
                GridBagConstraints.NORTHEAST,
                GridBagConstraints.HORIZONTAL,
        new Insets(130,0,0,300),150,100));

        img2 panel2 = new img2();
        frame.getContentPane().add(panel2);
        frame.setSize( 200,150 );
        container.add(panel2,new GridBagConstraints(0,0,0,0,0.0,0.9,
                GridBagConstraints.NORTHWEST,
                GridBagConstraints.HORIZONTAL,
                new Insets(130,280,0,0),150,100));


        img3 panel3 = new img3();
        frame.getContentPane().add(panel3);
        frame.setSize( 200,150 );
        container.add(panel3,new GridBagConstraints(0,0,0,0,0.0,0.9,
                GridBagConstraints.SOUTHEAST,
                GridBagConstraints.SOUTHWEST,
                new Insets(200,0,50,450),150,100));

        img4 panel4 = new img4();
        frame.getContentPane().add(panel4);
        frame.setSize( 200,150 );
        container.add(panel4,new GridBagConstraints(0,0,0,0,0.0,0.9,
                GridBagConstraints.SOUTHWEST,
                GridBagConstraints.HORIZONTAL,
                new Insets(200,280,50,0),150,100));

    }


    class ButtonEventListener implements ActionListener {
        public  void actionPerformed (ActionEvent e) {
            String x;
            Gui3 app3 = new Gui3();
            if (radio1.isSelected()) {
                x = "Пицца с грибами";
            } else if (radio2.isSelected()) {
                x = "Пицца с курицей";
            } else if (radio3.isSelected()) {
                x = "Пицца с сыром";
            } else {x = "пицца с морепродуктами";}
                dispose();
                app3.setVisible(true);


        }
    }

}
