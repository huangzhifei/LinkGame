/**
 * 
 */
package com.hzf.linkgame.HelpBoard;

import com.hzf.linkgame.HelpObject.LinkInfo;

import com.hzf.linkgame.HelpViews.Piece;

/**
 * @author huangzhifei
 * @ClassName: GameService
 * @Description: http://blog.csdn.net/ac_huang
 * @date 2014-12-9 下午9:21:37 
 */
public interface GameService {

	/*
	 * 控制游戏的开始
	 */
	public void start();
	
	/*
	 * 定义一个接口用来返回一个二维数组
	 * @return 存放方块对象的二维数组
	 */
	public Piece[][] getPieces();
	
	/*
	 * 判断piece[][]数组中是否还存在对象
	 * @return 返回true表示还存在，false表示不存在 
	 */
	public boolean hasPieces();
	
	/*
	 * 根据触摸位置，查找出与其对应的piece对象
	 * @param touchX 触摸位置的x坐标
	 * @param touchY 触摸位置的y坐标
	 * @return 返回相应的piece，没有返回null
	 */
	public Piece findPiece(float touchX, float touchY);
	
	/*
	 * 判断两个piece是否可以相连
	 * @param p1 第一个piece对象
	 * @param p2 第二个piece对象
	 * @return 如果可以相连返回LinkInfo对象, 否则返回null
	 */
	public LinkInfo link(Piece p1, Piece p2);
}
