import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{

  JPanel mainPanel;
  JPanel northPanel;
  JPanel southPanel;
  JPanel centerPanel;
    JPanel inputPanel;
      JTextField R1;
      JTextField R2;
      JTextField R3;
      JTextField R4;

  JLabel mainLabel;
  JLabel taskLabel;

  JButton submitButton;
  JButton resetButton;
  JButton exitButton;
  
  public MainFrame() {
    setFrame();
    setPanels();
    setComponents();
  }

  private void setFrame() {
    this.setTitle("Eredő ellenállások");
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500, 500);
    this.setVisible(true);
  }

  private void setPanels() {
    this.mainPanel = new JPanel();
    this.northPanel = new JPanel();
    this.southPanel = new JPanel();
    this.centerPanel = new JPanel();
    this.inputPanel = new JPanel();

    mainPanel.setBackground(Color.DARK_GRAY);
    northPanel.setBackground(Color.GRAY);
    mainPanel.setBackground(Color.GRAY);
    centerPanel.setBackground(Color.BLUE);
    inputPanel.setBackground(Color.GREEN);


    // layout settings for window
    this.setLayout(
      new GridLayout(1, 1)
    );

    // layout settings for mainpanel
    mainPanel.setLayout(
      new BorderLayout()
    );

    //layout settings for southpanel
    southPanel.setLayout(
      new FlowLayout(FlowLayout.RIGHT)
    );

    // layout settings for centerpanel
    centerPanel.setLayout(
      new FlowLayout(FlowLayout.CENTER)
    );

    inputPanel.setLayout(
      new GridLayout(2, 2)
    );

    // panelsize settings

    mainPanel.setSize(500, 420);
    northPanel.setSize(500, 40);
    southPanel.setSize(500, 40);
    centerPanel.setSize(500, 300);
    // inputPanel.setSize(200, 200);

    //attach panels to main
    mainPanel.add(northPanel, BorderLayout.NORTH);
    mainPanel.add(southPanel, BorderLayout.SOUTH);
    mainPanel.add(centerPanel);
    // centerPanel.add(inputPanel);

    this.add(mainPanel);
    
  }

  private void setComponents() {
    this.mainLabel = new JLabel("mainLabel");
    this.taskLabel = new JLabel("Adja meg az ellenállások értékét (Ω-ban)!");

    R1 = new JTextField();
    R2 = new JTextField();
    R3 = new JTextField();
    R4 = new JTextField();

    this.submitButton = new JButton("Mehet");
    this.resetButton = new JButton("Újra");
    this.exitButton = new JButton("Kilépés");

    northPanel.add(mainLabel);
    centerPanel.add(taskLabel);
    // inputPanel.add(R1);
    // inputPanel.add(R2);
    // inputPanel.add(R3);
    // inputPanel.add(R4);
    centerPanel.add(submitButton);
    centerPanel.add(resetButton);
    southPanel.add(exitButton);


  }

}
