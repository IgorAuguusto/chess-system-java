package application;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		
		Position po = new Position(1,2);
		po.setValues(2, 0);;
		
		System.out.println(po);
	}

}
