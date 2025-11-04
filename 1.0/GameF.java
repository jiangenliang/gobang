import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class GameF extends JFrame {
	public GameF() {
        Container contentPane = getContentPane();
        final Panel panel = new Panel();
        panel.setBackground(new Color(255, 182, 147));
        contentPane.setBackground(new Color(255, 182, 147));
        contentPane.add(panel);
        setSize(560, 560);
        setTitle("My Gobang");
        setResizable(false);
        panel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        JMenuBar menuBar=new JMenuBar();
        
        // 游戏模式菜单
        JMenu modeMenu=new JMenu("游戏模式");
        JMenuItem normalMode=new JMenuItem("普通模式");
        normalMode.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           	  panel.setGameMode(0);
           	  panel.ResetGame();
           	  panel.repaint();
           }
        });
        JMenuItem fixedMode=new JMenuItem("固定棋子模式");
        fixedMode.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           	  panel.setGameMode(1);
           	  panel.ResetGame();
           	  panel.repaint();
           }
        });
        modeMenu.add(normalMode);
        modeMenu.add(fixedMode);
        
        // 技能开关菜单
        JMenu skillMenu=new JMenu("技能开关");
        JMenuItem skillOn=new JMenuItem("开启技能");
        skillOn.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           	  panel.setSkillEnabled(true);
           	  panel.ResetGame();
           	  panel.repaint();
           }
        });
        JMenuItem skillOff=new JMenuItem("关闭技能");
        skillOff.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           	  panel.setSkillEnabled(false);
           	  panel.ResetGame();
           	  panel.repaint();
           }
        });
        skillMenu.add(skillOn);
        skillMenu.add(skillOff);
        
        // 其他选项菜单
        JMenu menu=new JMenu("选项");
        JMenuItem menuStart=new JMenuItem("开始游戏");
        menuStart.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
           	  panel.ResetGame();
           	  panel.repaint();
           }
        });
        JMenuItem menuExit =new JMenuItem("退出");
        menuExit.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
            	  System.exit(0);
            }
         });
        menu.add(menuStart);
        menu.add(menuExit);
        
        menuBar.add(modeMenu);
        menuBar.add(skillMenu);
        menuBar.add(menu);
        this.setJMenuBar(menuBar);
      }
}
