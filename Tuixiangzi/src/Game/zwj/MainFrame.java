package Game.zwj;

import javafx.scene.layout.Background;

import javax.swing.*;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class MainFrame extends Frame implements KeyListener{
    public MainFrame() {
        wolfInit();
        targetInit();
        sheepInit();
        treeInit();

        backgroundInit();
        setMainFrameUI();
        this.addKeyListener(this);
    }

    JLabel[][] sheeps = new JLabel[12][16];

    int[][] datas = {
            {0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0},
            {0,0,1,0,0,0,1,1,0,0,1,1,1,1,0,0},
            {0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,1,1,0,1,1,1,0,1,1,0,0,1,0,0},
            {0,0,1,0,0,1,1,0,0,0,1,0,1,1,0,0},
            {0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0},
            {0,1,1,0,1,1,1,0,0,0,1,0,1,0,0,0},
            {0,1,0,0,0,0,0,0,1,1,1,0,1,0,0,0},
            {0,1,0,0,0,1,0,0,0,0,0,0,1,0,0,0},
            {0,1,1,1,1,1,0,1,0,1,1,1,1,0,0,0},
            {0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0},
            {0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0}
    };

    int wx;
    int wy;
    int num = 0;
    int total = 8;
    ArrayList<String> al = new ArrayList();
    String a;

    private void treeInit() {
        Icon ic = new ImageIcon("tree.png");
        for (int i = 0; i < datas.length; i++) {
            for (int j = 0; j < datas[i].length; j++) {
                if (datas[i][j]==1){
                    JLabel lib_tree = new JLabel(ic);
                    lib_tree.setBounds(10+50*j, 30+50*i, 50, 50);
                    this.add(lib_tree);
                }
            }
        }
    }

    private void targetInit() {
        Icon i = new ImageIcon("target.png");
        JLabel lib_target1 = new JLabel(i);
        lib_target1.setBounds(10+250, 30+250, 50, 50);
        this.add(lib_target1);
        JLabel lib_target2 = new JLabel(i);
        lib_target2.setBounds(10+300, 30+250, 50, 50);
        this.add(lib_target2);
        JLabel lib_target3 = new JLabel(i);
        lib_target3.setBounds(10+350, 30+250, 50, 50);
        this.add(lib_target3);
        JLabel lib_target4 = new JLabel(i);
        lib_target4.setBounds(10+400, 30+250, 50, 50);
        this.add(lib_target4);
        JLabel lib_target5 = new JLabel(i);
        lib_target5.setBounds(10+450, 30+250, 50, 50);
        this.add(lib_target5);
        JLabel lib_target6 = new JLabel(i);
        lib_target6.setBounds(10+500, 30+250, 50, 50);
        this.add(lib_target6);
        JLabel lib_target7 = new JLabel(i);
        lib_target7.setBounds(10+400, 30+200, 50, 50);
        this.add(lib_target7);
        JLabel lib_target8 = new JLabel(i);
        lib_target8.setBounds(10+400, 30+300, 50, 50);
        this.add(lib_target8);
    }

    private void sheepInit() {
        Icon i = new ImageIcon("sheep_no.png");
        JLabel lib_sheep1 = new JLabel(i);
        lib_sheep1.setBounds(10+50*4, 30+50*3, 50, 50);
        this.add(lib_sheep1);
        datas[3][4] = 4;
        sheeps[3][4] = lib_sheep1;

        JLabel lib_sheep2 = new JLabel(i);
        lib_sheep2.setBounds(10+50*4, 30+50*2, 50, 50);
        this.add(lib_sheep2);
        datas[2][4] = 4;
        sheeps[2][4] = lib_sheep2;

        JLabel lib_sheep3 = new JLabel(i);
        lib_sheep3.setBounds(10+50*4, 30+50*5, 50, 50);
        this.add(lib_sheep3);
        datas[5][4] = 4;
        sheeps[5][4] = lib_sheep3;

        JLabel lib_sheep4 = new JLabel(i);
        lib_sheep4.setBounds(10+50*11, 30+50*7, 50, 50);
        this.add(lib_sheep4);
        datas[7][11] = 4;
        sheeps[7][11] = lib_sheep4;

        JLabel lib_sheep5 = new JLabel(i);
        lib_sheep5.setBounds(10+50*8, 30+50*4, 50, 50);
        this.add(lib_sheep5);
        datas[4][8] = 4;
        sheeps[4][8] = lib_sheep5;

        JLabel lib_sheep6 = new JLabel(i);
        lib_sheep6.setBounds(10+50*7, 30+50*7, 50, 50);
        this.add(lib_sheep6);
        datas[7][7] = 4;
        sheeps[7][7] = lib_sheep6;

        JLabel lib_sheep7 = new JLabel(i);
        lib_sheep7.setBounds(10+50*6, 30+50*8, 50, 50);
        this.add(lib_sheep7);
        datas[8][6] = 4;
        sheeps[8][6] = lib_sheep7;

        JLabel lib_sheep8 = new JLabel(i);
        lib_sheep8.setBounds(10+50*6, 30+50*7, 50, 50);
        this.add(lib_sheep8);
        datas[7][6] = 4;
        sheeps[7][6] = lib_sheep8;

    }

    JLabel lib_wolf;

    private void wolfInit() {
        wx = 7;
        wy = 8;
         Icon i = new ImageIcon("wolf-zm.png");
         lib_wolf = new JLabel(i);
         lib_wolf.setBounds(10+50*wx, 30+50*wy, 50, 50);
         this.add(lib_wolf);
    }

    private void backgroundInit() {
        Icon i = new ImageIcon("bg.png");
        JLabel lib_bg = new JLabel(i);
        lib_bg.setBounds(10, 30, 800, 600);
        this.add(lib_bg);
    }
    private void setMainFrameUI(){
        this.setLayout(null);
        this.setTitle("推箱子 1.0 版本");
        this.setLocation(230, 40);
        this.setSize(820, 640);
        this.setVisible(true);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        if (key==37){
            if (datas[wy][wx-1]==1){
                return;
            }
            if (datas[wy][wx-1]==4){

                if (datas[wy][wx-2]!=1 && datas[wy][wx-2]!=4){
                    datas[wy][wx-1]=0;
                    datas[wy][wx-2]=4;

                    sheeps[wy][wx-1].setLocation(10+50*wx-100, 30+50*wy);
                    sheeps[wy][wx-2] = sheeps[wy][wx-1];
                    sheeps[wy][wx-1] = null;

                    wx = wx -1;
                    int x = (int) lib_wolf.getLocation().getX();
                    int y = (int) lib_wolf.getLocation().getY();
                    lib_wolf.setLocation(x-50, y);
                    Icon i = new ImageIcon("wolf-zb.png");
                    lib_wolf.setIcon(i);
                    a = "左";
                    al.add(a);
                    System.out.println(al);
                }

            }
            if (datas[wy][wx-1]==0){
                wx = wx -1;
                int x = (int) lib_wolf.getLocation().getX();
                int y = (int) lib_wolf.getLocation().getY();
                lib_wolf.setLocation(x-50, y);
                Icon i = new ImageIcon("wolf-zb.png");
                lib_wolf.setIcon(i);
                a = "左";
                al.add(a);
                System.out.println(al);
            }
        }
        if (key==38){
            if (datas[wy-1][wx]==1){
                return;
            }
            if (datas[wy-1][wx]==4){

                if (datas[wy-2][wx]!=1 && datas[wy-2][wx]!=4){
                    datas[wy-1][wx]=0;
                    datas[wy-2][wx]=4;

                    sheeps[wy-1][wx].setLocation(10+50*wx, 30+50*wy-100);
                    sheeps[wy-2][wx] = sheeps[wy-1][wx];
                    sheeps[wy-1][wx] = null;

                    wy = wy -1;
                    int x = (int) lib_wolf.getLocation().getX();
                    int y = (int) lib_wolf.getLocation().getY();
                    lib_wolf.setLocation(x, y-50);
                    Icon i = new ImageIcon("wolf-sm.png");
                    lib_wolf.setIcon(i);
                    a = "上";
                    al.add(a);
                    System.out.println(al);
                }

            }
            if (datas[wy-1][wx]==0){
                wy = wy -1;
                int x = (int) lib_wolf.getLocation().getX();
                int y = (int) lib_wolf.getLocation().getY();
                lib_wolf.setLocation(x, y-50);
                Icon i = new ImageIcon("wolf-sm.png");
                lib_wolf.setIcon(i);
                a = "上";
                al.add(a);
                System.out.println(al);
            }
        }
        if (key==39){
            if (datas[wy][wx+1]==1){
                return;
            }
            if (datas[wy][wx+1]==4){

                if (datas[wy][wx+2]!=1 && datas[wy][wx+2]!=4){
                    datas[wy][wx+1]=0;
                    datas[wy][wx+2]=4;

                    sheeps[wy][wx+1].setLocation(10+50*wx+100, 30+50*wy);
                    sheeps[wy][wx+2] = sheeps[wy][wx+1];
                    sheeps[wy][wx+1] = null;

                    wx = wx +1;
                    int x = (int) lib_wolf.getLocation().getX();
                    int y = (int) lib_wolf.getLocation().getY();
                    lib_wolf.setLocation(x+50, y);
                    Icon i = new ImageIcon("wolf-ym.png");
                    lib_wolf.setIcon(i);
                    a = "右";
                    al.add(a);
                    System.out.println(al);
                }

            }
            if (datas[wy][wx+1]==0){
                wx = wx +1;
                int x = (int) lib_wolf.getLocation().getX();
                int y = (int) lib_wolf.getLocation().getY();
                lib_wolf.setLocation(x+50, y);
                Icon i = new ImageIcon("wolf-ym.png");
                lib_wolf.setIcon(i);
                a = "右";
                al.add(a);
                System.out.println(al);
            }

        }
        if (key==40){
            if (datas[wy+1][wx]==1){
                return;
            }
            if (datas[wy+1][wx]==4){

                if (datas[wy+2][wx]!=1 && datas[wy+2][wx]!=4){
                    datas[wy+1][wx]=0;
                    datas[wy+2][wx]=4;

                    sheeps[wy+1][wx].setLocation(10+50*wx, 30+50*wy+100);
                    sheeps[wy+2][wx] = sheeps[wy+1][wx];
                    sheeps[wy+1][wx] = null;

                    wy = wy +1;
                    int x = (int) lib_wolf.getLocation().getX();
                    int y = (int) lib_wolf.getLocation().getY();
                    lib_wolf.setLocation(x, y+50);
                    Icon i = new ImageIcon("wolf-zm.png");
                    lib_wolf.setIcon(i);
                    a = "下";
                    al.add(a);
                    System.out.println(al);
                }

            }
            if (datas[wy+1][wx]==0){
                wy = wy +1;
                int x = (int) lib_wolf.getLocation().getX();
                int y = (int) lib_wolf.getLocation().getY();
                lib_wolf.setLocation(x, y+50);
                Icon i = new ImageIcon("wolf-zm.png");
                lib_wolf.setIcon(i);
                a = "下";
                al.add(a);
                System.out.println(al);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

}

