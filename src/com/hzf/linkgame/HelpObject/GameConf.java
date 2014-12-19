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
	
	//二维地图board的大小，行数
	private int xSize;
	
	//二维地图board的大小，列数
	private int ySize;
	
	//二维地图中左上角x坐标
	private int beginImageX;
	
	//二维地图中左上角y坐标
	private int beginImageY;
	
	//游戏总时间限制
	private int gameTime;
	
	//activity对象
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
