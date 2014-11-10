import java.awt.*;

public class Pusher {
	public static final int WIDTH = 50, HEIGHT = 50;
	private double x = 0, y = -20;
	protected Space space;

	public Pusher(Space space) {
		this.space = space;

	}

	public void draw(Graphics g){
		g.setColor(Color.RED);
		g.fillOval(space.getGridX(x) - WIDTH / 2, space.getGridY(y) - HEIGHT / 2, WIDTH, HEIGHT);
	}

	public void setX(double x){
		this.x = x;
	}

	public void setY(double y){
		this.y = y;
	}


}

class Player extends Pusher {

	public Player(Space space){
		super(space);
	}

	public void update(){
		setX(super.space.curX);
		setY(super.space.curY);
	}


}