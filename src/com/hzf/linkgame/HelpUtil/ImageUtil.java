/**
 * 
 */
package com.hzf.linkgame.HelpUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;

import com.hzf.linkgame.R;
import com.hzf.linkgame.HelpViews.PieceImage;

/**
 * @author huangzhifei
 * @ClassName: ImageUtil
 * @Description: http://blog.csdn.net/ac_huang
 * @date 2014-12-9 下午10:38:47 
 */
public class ImageUtil {

	private static List<Integer> imageValues = getImageValues();
	
	public static List<Integer> getImageValues()
	{
		try {
			Field[] drawFields = R.drawable.class.getFields();
			List<Integer> resourceValuesIntegers = new ArrayList<Integer>();
			for( Field field : drawFields )
			{
				if( field.getName().indexOf("p_") != -1 )
				{
					resourceValuesIntegers.add(field.getInt(R.drawable.class));
				}
			}
			return resourceValuesIntegers;
			
		} catch (Exception e) {
			// TODO: handle exception
			Log.e("ImageUtil", e.getMessage().toString());
			return null;
		}
	}
	
	public static List<Integer> getRandomValues(List<Integer> sourceValues, int size)
	{
		Random random = new Random();
		
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = 0; i < size; ++ i)
		{
			try {
				int index = random.nextInt(sourceValues.size());
				
				Integer imageInteger = sourceValues.get(index);
				
				result.add(imageInteger);
				
			} catch (IndexOutOfBoundsException e) {
				// TODO: handle exception
				return result;
			}
		}
		
		return result;
	}
	
	public static List<Integer> getPlayValues(int size)
	{
		if( size % 2 != 0 )
		{
			size += 1;
		}
		
		List<Integer> playImageValues = getRandomValues(imageValues, size/2);
		playImageValues.addAll(playImageValues);
		Collections.shuffle(playImageValues);
		return playImageValues;
	}
	
	public static List<PieceImage> getPlayImages(Context context, int size)
	{
		List<Integer> resourceIntegers = getPlayValues(size);
		List<PieceImage> result = new ArrayList<PieceImage>();
		
		for( Integer valueInteger : resourceIntegers )
		{
			Bitmap bmBitmap = BitmapFactory.decodeResource(context.getResources(),valueInteger);
			
			PieceImage piceImage = new PieceImage(bmBitmap, valueInteger);
			result.add(piceImage);
		}
		
		return result;
	}
	
	public static Bitmap getSelectImage(Context context)
	{
		Bitmap bmBitmap = BitmapFactory.decodeResource(context.getResources(),
				R.drawable.image_selected);
		return bmBitmap;
	}
	
}
