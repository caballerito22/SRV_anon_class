import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyActionListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("button 1");
    }
}
public class Main extends JFrame {
    public static void main(String[] args) {
        new Main().start();
    }

    public void start() {
        JButton button1 = new JButton("Mega Button1");
        button1.setBounds(0,0, 400,200);
        button1.addActionListener(new MyActionListener());
        add(button1);

        JButton button2 = new JButton("Mega Button2");
        button2.setBounds(0,200, 400,200);
        ActionListener actionListener = new ActionListener(){

        public void actionPerformed(ActionEvent e) {
            System.out.println("button 2");
        }
        };
        button2.addActionListener(actionListener);
        add(button2);

        JButton button3 = new JButton("Mega Button3");
        button3.setBounds(0,400, 400,200);
        add(button3);

        button3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                System.out.println("button 3");
            }
        });



        setSize(400,600);
        setLayout(null);
        setVisible(true);

    }
}