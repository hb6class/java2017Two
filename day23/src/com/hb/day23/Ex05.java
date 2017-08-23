package com.hb.day23;

import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p = new Panel();
		
		java.awt.List list= new List(5,true);
		list.add("java");
		list.add("database");
		list.add("web");
		list.add("framework");
		list.add("java2");
		list.add("database2");
		list.add("web2");
		list.add("framework2");
		list.remove(3);
		list.add("framework",1);
		list.select(6);
		list.select(7);
		System.out.println(list.getItemCount());
		System.out.println(Arrays.toString(list.getItems()));
		System.out.println(list.getItem(4));
//		System.out.println(list.getSelectedIndex());
//		System.out.println(list.getSelectedItem());
		System.out.println(Arrays.toString(list.getSelectedIndexes()));
		System.out.println(Arrays.toString(list.getSelectedItems()));
		
		p.add(list);
		f.add(p);
		f.setBounds(1600, 0, 300, 200);
		f.setVisible(true);

	}

}
