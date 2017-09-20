package gameObjects;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import math.Vector2D;
import states.GameState;

public class Ufo extends MovingObject{
	
	public Ufo(Vector2D position, Vector2D velocity, double maxVel, BufferedImage texture, GameState gameState) {
		super(position, velocity, maxVel, texture, gameState);

	}

	@Override
	public void update() {
		
	}

	@Override
	public void draw(Graphics g) {
		
	}
	
}
