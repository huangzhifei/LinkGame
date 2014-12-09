package com.hzf.linkgame.HelpViews;

import android.graphics.Bitmap;

/*
 * bitmap & id
 */
public class PieceImage {

	private Bitmap imageBitmap;
	
	private int imageID;
	
	public PieceImage(Bitmap image, int imageID)
	{
		this.imageBitmap = image;
		this.imageID = imageID;
	}
	
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
