/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema.booking;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.UIManager;

/**
 *
 * @author init1
 */
public class seat {
    private boolean enabled;
    private boolean click_it;
    private int row;
    private int col;
    private JButton button;
    
    public seat(int row, int col) {
        this.row = row;
        this.col = col;
        this.enabled=true;
        this.click_it=false;
        this.button= new JButton();
        this.button.setText(" ");
        this.button.setForeground(new Color(0XFFFFFF));
        this.button.setBackground(new Color(0XFFFFFF));
        this.button.setBorder(BorderFactory.createBevelBorder(1, Color.black, Color.black));
        this.button.setVisible(true);
        addHoverEffect();
        addButtonActionListener();
        
    }
    
    
    public void setBounds(int x,int y,int width ,int height){
        this.button.setBounds(x, y, width, height);

}

    public JButton getButton() {
        return button;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean visible) {
        this.enabled = visible;
        this.button.setEnabled(visible);
    }

    public boolean isClick_it() {
        return click_it;
    }

    public void setClick_it(boolean click_it) {
        this.click_it = click_it;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }
    
  private void addHoverEffect() {
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if (!click_it) {
                    button.setBackground(new Color(0XE87F74)); // Change color on hover if not clicked
                }
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                if (!click_it) {
                    button.setBackground(new Color(0XFFFFFF)); // Restore original color on exit
                }
            }
        });
    }
    private void addButtonActionListener() {
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                click_it = !click_it; // Toggle click state
                
                
                if (click_it) {
                    button.setBackground(new Color(0XE74C3C)); // Change color when clicked
                } else {
                    button.setBackground(new Color(0XFFFFFF)); // Restore original color
                }
            }
        });
    }
    
//    button.addMouseListener(new java.awt.event.MouseAdapter() {
//            public void mouseEntered(java.awt.event.MouseEvent evt) {
//                button.setBackground(new Color(0XE87F74)); // Change background color on hover
//                // Change text color on hover
//            }
//
//            public void mouseExited(java.awt.event.MouseEvent evt) {
//                button.setBackground(UIManager.getColor(new Color(0XFFFFFF))); // Restore original background color
//                 // Restore original text color
//            }
//        });
//
//        button.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                JButton source = (JButton) e.getSource();
//                // Handle button click
//                //System.out.println("Button clicked: " + source.getText());
//                button.setBackground(new Color(0XE74C3C));
//            }
//        });
   
    
}
