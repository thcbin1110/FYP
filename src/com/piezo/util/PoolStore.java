package com.piezo.util;

import java.util.Arrays;
import java.util.List;

import com.badlogic.gdx.utils.Pool;
import com.piezo.model.Apple;
import com.piezo.model.Bomb;
import com.piezo.model.CuttingObject;
import com.piezo.model.Egg;

public class PoolStore {
	public static Pool<Command> commandPool= new Pool<Command>(){

		@Override
		protected Command newObject() {
			// TODO Auto-generated method stub
			return new Command();
		}
		
	};
	public static Pool<Apple> applePool =new Pool<Apple>(){

		@Override
		protected Apple newObject() {
			// TODO Auto-generated method stub
			return new Apple();
		}
		
	};
	public static Pool<Egg> eggPool =new Pool<Egg>(){

		@Override
		protected Egg newObject() {
			// TODO Auto-generated method stub
			return new Egg();
		}
		
	};
	public static Pool<Bomb> bombPool =new Pool<Bomb>(){

		@Override
		protected Bomb newObject() {
			// TODO Auto-generated method stub
			return new Bomb();
		}
		
	};
	public static List<Pool<? extends CuttingObject>> poolArray= Arrays.asList(applePool, eggPool,bombPool);
//	public static CuttingObject randomCuttingObject(){
//		
//	}
}