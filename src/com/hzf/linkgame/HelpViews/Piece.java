package com.hzf.linkgame.HelpViews;

import android.graphics.Point;

/*
 * 方块对象辅助类
 */
public class Piece {
	
	//保存方块对象的所对应的图像
	private PieceImage pieceImage;
	
	//方块的左上角x、y坐标
	private int beginX, beginY;
	
	//对象piece[][]数组的下标
	private int indexX, indexY;
	
	public Piece(int iX, int iY)
	{
		this.indexX = iX;
		this.indexY = iY;
	}
	/*
	 * 设置beginX的属性
	 */
	public final int getBeginX(){
		return beginX;
	}
	
	public void setBeginX(int iX){
		this.beginX = iX;
	}
	
	/*
	 * 设置beginY的属性
	 */
	public final int getBeginY(){
		return beginY;
	}
	
	public void setBeginY(int iY){
		this.beginY = iY;
	}
	
	/*
	 * 设置indexX的属性
	 */
	public final int getIndexX(){
		return indexX;
	}
	
	public void setIndexX(int iX){
		this.indexX = iX;
	}
	
	/*
	 * 设置indexY的属性
	 */
	public final int getIndexY(){
		return indexY;
	}
	
	public void setIndexY(int iY){
		this.indexY = iY;
	}
	
	/*
	 * 设置pieceImage属性
	 */
	public final PieceImage getPieceImage(){
		return pieceImage;
	}
	
	public void setImage(PieceImage image){
		this.pieceImage = image;
	}
	
	//获取piece的中心点
	public Point getCenter()
	{
		double x = getPieceImage().getImage().getWidth() * 0.5 + getBeginX();
		double y = getPieceImage().getImage().getHeight() * 0.5 + getBeginY();
		
		return new Point((int)x, (int)y);
	}
	
	public boolean isSameImage(Piece rhs)
	{
		if( pieceImage == null && rhs.pieceImage != null )
		{
			return false;
		}
		
		return pieceImage.getImageID() == rhs.getPieceImage().getImageID();
	}
}
