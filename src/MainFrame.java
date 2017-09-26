import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends Frame {
    private Button btnadd = new Button("ADD");
    private Button btnexit = new Button("EXIT");
    private Button btnsub = new Button("SUB");
    private Label lab = new Label(">_________<");
    private int n = 0, labX = 50,labY = 50;
    private Timer t1;
    public MainFrame(){
        initcomp();
    }
    private void initcomp(){
        this.setBounds(500,300,1000,500);

        this.setLayout(null);

        btnadd.setBounds(500,400,80,50);
        this.add(btnadd);
        btnadd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(++n));
                t1.start();
            }
        });

        btnexit.setBounds(600,400,80,50);
        this.add(btnexit);
        btnexit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        btnsub.setBounds(700,400,80,50);
        this.add(btnsub);
        btnsub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.this.setTitle(Integer.toString(--n));
            }
        });

        lab.setBounds(100  ,100,80,80);
        this.add(lab);
        lab.setBackground(Color.pink);

        t1 = new Timer(500, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labX += 100;
                lab.setLocation(labX,labY);
                lab.setText(labX+","+labY);
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}

