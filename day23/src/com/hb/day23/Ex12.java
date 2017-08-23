package com.hb.day23;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Panel;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();
		
		Panel p = new Panel(null);
		
		char[][] chs={
				{'7','8','9','-'}
				,{'4','5','6','+'}
				,{'1','2','3'}
				,{'0','.','='}
		};
		
		Button[][] btns= new Button[chs.length][];
		
		for(int i=0; i<btns.length; i++){
			btns[i]=new Button[chs[i].length];
		}
		
		for(int i=0; i<chs.length; i++){
			for(int j=0; j<chs[i].length; j++){			
				String msg=chs[i][j]+"";
				btns[i][j]=new Button(msg);
			}
		}
		for(int i=0; i<chs.length; i++){
			for(int j=0; j<chs[i].length; j++){			
				p.add(btns[i][j]);
			}
		}
		for(int i=0; i<chs.length; i++){
			for(int j=0; j<chs[i].length; j++){			
				if(i==1 && j==3){
					btns[i][j].setSize(100, 200);
					btns[i][j].setLocation(j*100, i*100);
				}else if(i==3){
					if(j==0){
						btns[i][j].setSize(200, 100);
						btns[i][j].setLocation(j*100, i*100);
					}else{
						btns[i][j].setSize(100, 100);
						btns[i][j].setLocation((j+1)*100, i*100);						
					}
					
				}else{
					btns[i][j].setSize(100, 100);
					btns[i][j].setLocation(j*100, i*100);
				}
			}
		}
		
		
			
		
		f.add(p);
		f.setLocation(1600, 0);
//		f.setSize(417, 438);
		f.setSize(400,400);
//		f.pack();
		f.setVisible(true);
		System.out.println(400-p.getWidth());
		System.out.println(400-p.getHeight());
		f.resize(400+400-p.getWidth(), 400+400-p.getHeight());
	}

}
