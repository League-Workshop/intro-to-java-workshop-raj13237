int ballX = 100;
int ballY = 400;
int speedX = 5;
import ddf.minim.*;
Minim minim;
AudioSample sound;
void setup() {
  size(800,800);
  minim = new Minim (this);
  sound = minim.loadSample("pong.wav" , 128);
}
void draw() {
  background(255,255,255);
  fill(17,167,234);
  stroke(25,114,155);
  ellipse(ballX,ballY, 25,25);
  ballX = ballX + speedX;
  if(ballX >= 800) {
    speedX = -speedX;
    ballX = ballX +speedX;
  }
  if(ballX <=0) {
    speedX = -speedX;
    ballX = ballX + speedX;
  }
  if(ballY >= 800){
  speedX = -speedX;
    ballY = ballY + speedX;
  }
  if(ballY <= 0) {
    speedX = -speedX;
    ballY = ballY + speedX;
    sound.trigger();
  }
}