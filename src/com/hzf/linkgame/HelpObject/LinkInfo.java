/**
 * 
 */
package com.hzf.linkgame.HelpObject;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Point;

/**
 * @author huangzhifei
 * @ClassName: LinkInfo
 * @Description: http://blog.csdn.net/ac_huang，连接信息类
 * @date 2014-12-9 下午9:37:41 
 */
public class LinkInfo {

	private List<Point> points = new ArrayList<Point>();
	
	/*
	 * p1 与 p2 直接能够相连
	 */
	public LinkInfo(Point p1, Point p2)
	{
		points.add(p1);
		points.add(p2);
	}
	
	/*
	 * p2 为 p1 和 p3的转折点
	 */
	public LinkInfo(Point p1, Point p2, Point p3)
	{
		points.add(p1);
		points.add(p2);
		points.add(p3);
	}
	
	/*
	 * p2、p3 为 p1 和 p4的转折点
	 */
	public LinkInfo(Point p1, Point p2, Point p3, Point p4)
	{
		points.add(p1);
		points.add(p2);
		points.add(p3);
		points.add(p4);
	}
	
	/*
	 * 获得所有的连接信息
	 */
	public List<Point> getLinkPoints()
	{
		return points;
	}
}
