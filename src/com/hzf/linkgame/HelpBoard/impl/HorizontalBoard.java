/**
 * 
 */
package com.hzf.linkgame.HelpBoard.impl;

import java.util.ArrayList;
import java.util.List;

import com.hzf.linkgame.HelpViews.Piece;

import com.hzf.linkgame.HelpBoard.AbstractBoard;
import com.hzf.linkgame.HelpObject.GameConf;

/**
 * @author huangzhifei
 * @ClassName: HorizontalBoard
 * @Description: http://blog.csdn.net/ac_huang
 * @date 2014-12-9 下午11:41:34 
 */
public class HorizontalBoard extends AbstractBoard {

	/* (non-Javadoc)
	 * @see HelpBoard.AbstractBoard#createPiece(HelpObject.GameConf, com.hzf.linkgame.HelperViews.Piece[][])
	 */
	@Override
	protected List<Piece> createPiece(GameConf config, Piece[][] pieces) {
		// TODO Auto-generated method stub
		
		List<Piece>notNullPieces = new ArrayList<Piece>();
		
		for(int i = 0;i < pieces.length ; ++ i )
		{
			for(int j = 0 ;j < pieces[i].length ; ++ j)
			{
				if( j % 2 != 0 ) continue;
				
				Piece piece = new Piece(i, j);
				
				notNullPieces.add(piece);
			}
		}
		
		return notNullPieces;
	}

}
