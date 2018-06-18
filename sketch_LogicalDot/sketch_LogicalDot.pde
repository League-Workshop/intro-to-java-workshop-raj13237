void setup() {
  size(800,800);
  background(80,247,15);
}
void draw() {
  if(mousePressed){
  fill(247,15,15);
  ellipse(400,400,200,200);
  } else{
    fill (15,199,247);
    ellipse(400,400,200,200);
  }
}