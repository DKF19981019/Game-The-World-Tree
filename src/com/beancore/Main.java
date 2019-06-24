package com.beancore;

import javax.swing.UIManager;

import com.beancore.ui.MainFrame;

public class Main {
    public static void main(String args[]) throws InterruptedException {
    	try {  
            String lookAndFeel =   
                UIManager.getCrossPlatformLookAndFeelClassName();  
            UIManager.setLookAndFeel(lookAndFeel);  
        } catch (Exception e) {}  
	MainFrame mainFrame;
	try {
	    mainFrame = new MainFrame();
	    mainFrame.loadGame();
	} catch (Exception e) {
	    e.printStackTrace();
	}

    }
}
