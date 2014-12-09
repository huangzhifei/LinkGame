/**
 * 
 */
package com.hzf.linkgame.HelpBoard;

import java.util.List;

import com.hzf.linkgame.HelpObject.GameConf;
import com.hzf.linkgame.HelpUtil.ImageUtil;
import com.hzf.linkgame.HelpViews.Piece;
import com.hzf.linkgame.HelpViews.PieceImage;

/**
 * @author huangzhifei
 * @ClassName: AbstractBoard
 * @Description: http://blog.csdn.net/ac_huang
 * @date 2014-12-9 下午10:24:52 
 */
public abstract class AbstractBoard {

	/*
	 * 定义一个抽象类，让子类去实现
	 */
	protected abstract List<Piece>createPiece(GameConf config, Piece[][] pieces);
	
	public Piece[][] create(GameConf config)
	{
		Piece[][] pieces = new Piece[config.getXSize()][config.getYSize()];
		
		List<Piece> notNullPieces = createPiece(config, pieces);
		
		List<PieceImage> playImages = ImageUtil.getPlayImages(config.getContext(),
				notNullPieces.size());
		
		int imageWidth = playImages.get(0).getImage().getWidth();
		int imageHeight = playImages.get(0).getImage().getHeight();
		
		for(int i = 0;i < notNullPieces.size(); ++ i)
		{
			Piece piece = notNullPieces.get(i);
			piece.setImage(playImages.get(i));
			piece.setBeginX(piece.getIndexX() * imageWidth + config.getBeginImageX());
			piece.setBeginY(piece.getIndexY() * imageHeight + config.getBeginImageY());
			
			pieces[piece.getIndexX()][piece.getIndexY()] = piece;
		}
		
		return pieces;
	}
	
}
