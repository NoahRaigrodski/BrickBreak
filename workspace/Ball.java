//
//  Class author:  Noah Raigrodski
//  Date created:  12/4/24
//  General description: This class blueprints a ball object which moves and appears on the screen
//
import java.awt.*;

public class Ball {
	
	private int x;
	private int y;
	private int xVelocity;
	private int yVelocity;
	private int size;
	
	
	//constructor(s):
	public Ball(int x, int y, int size){
		this.x = x;
		this.y = y;
		this.size = size;
		xVelocity = 1;
		yVelocity = -2;
	}
	
	//methods:
	//Accessor methods
	public int getXpos(){
		return x;
	}

	public int getYpos(){
		return y;
	}

	public int getSize(){
		return size;
	}

	//Mutator methods
	public void setX(int x){
		this.x = x;
	}

	public void setY(int y){
		this.y = y;
	}

	public void setXVelocity(int velocity){
		xVelocity = velocity;
	}

	public void setYVelocity(int velocity){
		yVelocity = velocity;
	}

	public void reverseX(){
		xVelocity = -xVelocity;
	}

	public void reverseY(){
		yVelocity = -yVelocity;
	}

	//
	//  Pre-condition: g must have a value
	//  Post-condition: a graphics object will be drawn
	//
	public void draw(Graphics g){
		g.setColor(Color.white);
        g.fillOval(x, y, size,size);
	}

	//
	//  Pre-condition: An instance of this class must exist
	//  Post-condition: The ball's x and y posistions will be updated
	//
	public void move(){
		x += xVelocity;
		y += yVelocity;
	}

}