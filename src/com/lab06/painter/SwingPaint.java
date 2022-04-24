package com.lab06.painter;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
 
public class SwingPaint 
{
 
  JButton clearBtn, blackBtn, blueBtn, greenBtn, redBtn, magentaBtn, btnRec, btnELlipse;
  DrawArea drawArea;
 
  ActionListener actionListener = new ActionListener() {
  public void actionPerformed(ActionEvent e) {
      if (e.getSource() == clearBtn) {
        drawArea.clear();
      } else if (e.getSource() == blackBtn) {
        drawArea.black();
      } else if (e.getSource() == blueBtn) {
        drawArea.blue();
      } else if (e.getSource() == greenBtn) {
        drawArea.green();
      } else if (e.getSource() == redBtn) {
        drawArea.red();
      } else if (e.getSource() == magentaBtn) {
        drawArea.magenta();
      }  else if(e.getSource()==btnRec) {
    	  drawArea.rectangle();
      }  else if (e.getSource() == btnELlipse) {
    	  drawArea.drawellipse();
      }
    }
  };
 
  public static void main(String[] args) {
    new SwingPaint().show();
  }
 
  public void show() {
    // create main frame
    JFrame frame = new JFrame("Swing Paint");
    Container content = frame.getContentPane();
    // set layout on content pane
    content.setLayout(new BorderLayout());
    
    drawArea = new DrawArea();
 
     content.add(drawArea, BorderLayout.CENTER);
 
    // create controls to apply colors and call clear feature
    JPanel controls = new JPanel();
    redBtn = new JButton("Red");
    redBtn.addActionListener(actionListener);
    
    clearBtn = new JButton("Clear");
    clearBtn.addActionListener(actionListener);
    
    blackBtn = new JButton("Black");
    blackBtn.addActionListener(actionListener);
    
    blueBtn = new JButton("Blue");
    blueBtn.addActionListener(actionListener);
   
    greenBtn = new JButton("Green");
    greenBtn.addActionListener(actionListener);
   
    magentaBtn = new JButton("Magenta");
    magentaBtn.addActionListener(actionListener);
 
    btnRec = new JButton("Draw Rectangle");
    btnRec.addActionListener(actionListener);
    
    btnELlipse = new JButton("Draw Ellipse");
    btnELlipse.addActionListener(actionListener);
    

    
    // add to panel
    controls.add(greenBtn);
    controls.add(blueBtn);
    controls.add(blackBtn);
    controls.add(redBtn);
    controls.add(clearBtn);
    controls.add(magentaBtn);
    controls.add(btnRec);
    
    // add to content pane
    content.add(controls, BorderLayout.NORTH);
   
    JPanel panel2= new JPanel();
    panel2.add(btnELlipse);    
    content.add(panel2,BorderLayout.EAST );
     
    frame.setSize(600, 600);
    // can close frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     frame.setVisible(true);
 
    
  }
 
}
