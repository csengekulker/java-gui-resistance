import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame{

  JPanel mainPanel;
  JPanel northPanel;
  JPanel southPanel;
  JPanel centerPanel;
  
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

    mainPanel.setBackground(Color.DARK_GRAY);
    northPanel.setBackground(Color.GRAY);
    mainPanel.setBackground(Color.GRAY);
    centerPanel.setBackground(Color.LIGHT_GRAY);


    // layout settings for window
    this.setLayout(
      new GridLayout(1, 1)
    );

    // layout settings for mainpanel
    mainPanel.setLayout(
      new BorderLayout()
    );

    // layout settings for centerpanel
    centerPanel.setLayout(
      new FlowLayout(FlowLayout.CENTER)
    );

    // panelsize settings

    mainPanel.setSize(500, 420);
    northPanel.setSize(500, 40);
    southPanel.setSize(500, 40);

    //attach panels to main
    mainPanel.add(northPanel, BorderLayout.NORTH);
    mainPanel.add(southPanel, BorderLayout.SOUTH);
    mainPanel.add(centerPanel);

    this.add(mainPanel);
    
  }

  private void setComponents() {

  }

}
