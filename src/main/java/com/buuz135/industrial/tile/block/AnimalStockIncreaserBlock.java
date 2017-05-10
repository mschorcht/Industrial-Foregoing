package com.buuz135.industrial.tile.block;

import com.buuz135.industrial.tile.mob.AnimalStockIncreaserTile;
import net.minecraft.block.material.Material;

public class AnimalStockIncreaserBlock extends CustomOrientedBlock<AnimalStockIncreaserTile> {

    public AnimalStockIncreaserBlock() {
        super("animal_stock_increaser", AnimalStockIncreaserTile.class, Material.ROCK, 400,20);
    }
}
