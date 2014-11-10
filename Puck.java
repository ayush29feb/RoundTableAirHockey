import java.awt.*;

public class Puck {
	public static final int WIDTH = 50, HEIGTH = 50;
	private double x = 0, y = -20;
	private double velX = 50, velY = 50;
	private Space space;

	public Puck(Space space, int x, int y){
		this.space = space;
		this.x = x;
		this.y = y;
	}

	public void draw(Graphics g){
		g.setColor(Color.BLUE);
		g.fillOval(space.getGridX(x) - WIDTH / 2, space.getGridY(y) - HEIGTH / 2, WIDTH, HEIGTH);
	}

	public void update(){
		x += velX / 100;
		y += velY / 100;
		checkBorderCollision();
	}

	public void checkBorderCollision(){
        double a  = Math.sqrt(x * x +  y * y);
        if(a >= 27.5){
            double c = 2*((velX * x + velY * y)/(x * x + y * y));
            setVelX(velX - c * x);
            setVelY(velY - c * y);
        }
    }

	public void setVelX(double velX){
		this.velX = velX;
	}

	public void setVelY(double velY){
		this.velY = velY;
	}

	public double getVelX(){
		return this.velX;
	}

	public double getVelY(){
		return this.velY;
	}
}
