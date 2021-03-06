package dev.tilegame.entities.statics;

import java.awt.Graphics;

import dev.tilegame.Handler;
import dev.tilegame.gfx.Assets;
import dev.tilegame.items.Item;

import dev.tilegame.tiles.Tile;

public class A extends StaticEntity {
	public A(Handler handler,float x,float y )
	{
		super(handler,x,y,Tile.TILEWIDTH, Tile.TILEHEIGHT * 2);
		
		bounds.x=10;
		bounds.y=(int)(height / 1.5f);
		bounds.width=width - 20;
		bounds.height=(int)(height - height / 1.5f);
		
	}

	@Override    
	public void tick() {
		
	}
	@Override
	
	public void die() {
		
		handler.getWorld().getItemManager().addItem(Item.vowelItem.createNew((int) x, (int) y));
	}
	
	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.tree,(int) (x- handler.getGameCamera().getxOffset()),(int) (y - handler.getGameCamera().getyOffset()),width,height,null);
	}

	

}
 