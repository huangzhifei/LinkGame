package com.hzf.linkgame.HelpViews;

import android.graphics.Bitmap;

/*
 * bitmap & id
 */
public class PieceImage {

	//连连看上面的单一图像
	private Bitmap imageBitmap;
	//每个图像背后其实是绑定一个ID号的
	private int imageID;
	
	//构造出一个带ID的image对象
	public PieceImage(Bitmap image, int imageID)
	{
		this.imageBitmap = image;
		this.imageID = imageID;
	}
	//下面将是一堆set与get属性函数
	public final Bitmap getImage(){
		return imageBitmap;
	}
	
	public void setImage(Bitmap image)
	{
		this.imageBitmap = image;
	}
	
	public final int getImageID()
	{
		return imageID;
	}
	
	public void setImageID(int imageID)
	{
		this.imageID = imageID;
	}
}
