/**
 * 
 */
package com.hzf.linkgame.HelpObject;

import android.content.Context;

/**
 * @author huangzhifei
 * @ClassName: GameConf
 * @Description: http://blog.csdn.net/ac_huang
 * @date 2014-12-9 下午9:54:08 
 */
public class GameConf {

	// 设置连连看的每个方块的图片的宽、高
	public static final int PIECE_WIDTH = 40;
	public static final int PIECE_HEIGHT = 40;
	
	// 记录游戏的默认时长为100s
	public static final int DEFAULT_TIME = 100;
	
	private int xSize;
	
	private int ySize;
	
	private int beginImageX;
	
	private int beginImageY;
	
	private int gameTime;
	
	private Context context;
	
	public GameConf(int xSize, int ySize, int beginImageX, int beginImageY,
			int gameTime, Context context)
	{
		this.xSize = xSize;
		this.ySize = ySize;
		this.beginImageX = beginImageX;
		this.beginImageY = beginImageY;
		this.gameTime = gameTime;
		this.context = context;
	}
	
	public final int getXSize(){
		return xSize;
	}
	
	public final int getYSize(){
		return ySize;
	}
	
	public final int getGameTime(){
		return gameTime;
	}
	
	public final int getBeginImageX(){
		return beginImageX;
	}
	
	public final int getBeginImageY(){
		return beginImageY;
	}
	
	public final Context getContext(){
		return context;
	}
}
