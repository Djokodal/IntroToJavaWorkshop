void setup () {
  size(500, 500);

}
int xPos = 250;
int xSpeed = 2;
int yPos = 250;
int ySpeed = 3;
void draw () {
  background(255, 0, 0);
  noStroke();
  ellipse ( xPos, yPos, 30, 30);
  fill (25, 34, 18);
  xPos += xSpeed;
  yPos += ySpeed;
  if ( xPos > width) {
    xSpeed=-xSpeed;
  }
  if ( xPos < 0) {
    xSpeed=-xSpeed;
  }
  if ( yPos > height) {
    ySpeed=-ySpeed;
  }
  if ( yPos < 0) {
    ySpeed=-ySpeed;
  }
  rect (mouseX, 450, 60, 10);
  
  if (intersects( xPos, yPos, mouseX, 450, 60)){
    ySpeed=-ySpeed;
  }
}

boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else 
  return false;
}