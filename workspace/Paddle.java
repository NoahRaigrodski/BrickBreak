//
//  Class author:  Noah Raigrodski
//  Date created:  12/4/24
//  General description: This class blueprints a paddle object which appears on the screen and moves
//
import java.awt.*;

public class Paddle {
	
	private int x;
	private int y;
	private int width;
	private int height;
	private int velocity;
	
	
	//constructor(s):
	public Paddle(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		velocity = 0;
	}
	
	//methods:

	//Accessor methods
	public int getX(){
		return x;
	}

	public int getY(){
		return y;
	}

	public int getWidth(){
		return width;
	}

	public int getHeight(){
		return height;
	}

	public int getVelocity(){
		return velocity;
	}

	//Mutator methods
	public void setX(int x){
		this.x = x;
	}

	public void setVelocity(int velocity){
		this.velocity = velocity;
	}

	//
	//  Pre-condition: The argument given must be an int
	//  Post-condition: Velocity is updated to add the bonus velocity
	//
	public void addVelocity(int bonusVelocity){
		velocity += bonusVelocity;
	}

	//
	//  Pre-condition: An instance of this class must exist
	//  Post-condition: The Paddle's x posistion will be updated
	//
	public void move(){
		x+= velocity;

		if (velocity > 0) {
			velocity--; 
		} else if (velocity < 0) {
			velocity++;
		}
	}

	//
	//  Pre-condition: g must have a value
	//  Post-condition: a graphics object will be drawn
	//
	public void draw(Graphics g){
		g.setColor(Color.blue);
        g.fillRect(x, y, width, height);
	}
	
	
}
