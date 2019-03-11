package Rühmatöö;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Listener implements ActionListener
{
    private int clicks;

    public void actionPerformed (ActionEvent e)
    {
        clicks++;
        switch (clicks){
            case 1:
                // Do operation 1
                break;
            case 2:
                // Do operation 2
                break;
        }
        System.out.println(e);
    }

    public static void main(String[] args) {
        //System.out.println(e.getClickCount);
    }
}

// https://stackoverflow.com/questions/5602463/count-how-many-times-a-jbutton-is-pressed