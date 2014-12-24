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
	
	//所有的子类都可以用这个，这就是设置成抽象类的好处
	public Piece[][] create(GameConf config)
	{
		Piece[][] pieces = new Piece[config.getXSize()][config.getYSize()];
		
		List<Piece> notNullPieces = createPiece(config, pieces);
		
		List<PieceImage> playImages = ImageUtil.getPlayImages(config.getContext(),
				notNullPieces.size());
		
		//所有的图像都是一样大小的，只需要随便获取一张的属性就ok了
		int imageWidth = playImages.get(0).getImage().getWidth()+config.PIECE_SPACING;
		int imageHeight = playImages.get(0).getImage().getHeight()+config.PIECE_SPACING;
		
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
