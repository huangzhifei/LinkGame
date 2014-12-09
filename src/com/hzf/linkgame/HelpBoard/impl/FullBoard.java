/**
 * 
 */
package com.hzf.linkgame.HelpBoard.impl;

import java.util.ArrayList;
import java.util.List;

import com.hzf.linkgame.HelpBoard.AbstractBoard;
import com.hzf.linkgame.HelpObject.GameConf;

import com.hzf.linkgame.HelpViews.Piece;

/**
 * @author huangzhifei
 * @ClassName: FullBoard
 * @Description: http://blog.csdn.net/ac_huang
 * @date 2014-12-9 下午11:37:08 
 */
public class FullBoard extends AbstractBoard {

	@Override
	protected List<Piece> createPiece(GameConf config, Piece[][] pieces) {
		// TODO Auto-generated method stub
		
		List<Piece>notNullPieces = new ArrayList<Piece>();
		
		for(int i = 1 ;i < pieces.length - 1; ++ i )
		{
			for(int j = 1 ;j < pieces[i].length - 1; ++ j)
			{
				Piece piece = new Piece(i, j);
				notNullPieces.add(piece);
			}
		}
		
		return notNullPieces;
	}

}
