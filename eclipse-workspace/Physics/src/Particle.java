public class Particle{
	private double xVel = 0.0;
	private double yVel = 0.0;
	private double xPos = 0.0;
	private double yPos = 0.0;
	public double getxVel() {
		return xVel;
	}
	public void setxVel(double xVel) {
		this.xVel = xVel;
	}
	public double getyVel() {
		return yVel;
	}
	public void setyVel(double yVel) {
		this.yVel = yVel;
	}
	public double getxPos() {
		return xPos;
	}
	public void setxPos(double xPos) {
		this.xPos = xPos;
	}
	public double getyPos() {
		return yPos;
	}
	public void setyPos(double yPos) {
		this.yPos = yPos;
	}
	
	int initID = 0;
	
	Particle(){
		
		xVel = Math.random();
		yVel = Math.random();
		xPos = 0.0;
		yPos = 0.0;
	}
	
	Particle(int a){
		this.initID = a;
	}
	
	public int getInitID() {
		return initID;
	}
	
	public void pushParticleX() {
		this.xVel = this.xVel + 0.1;
	}
}