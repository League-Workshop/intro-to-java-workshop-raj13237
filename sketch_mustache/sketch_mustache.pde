PImage mustache;
PImage friend;
void setup() {
  friend = 
  loadImage("friend.png");
  size (800,600);
  friend.resize(width,height);
  mustache=
  loadImage("mustache.png");
  
  
}
void draw() {
  fill(255,0,0);
  rect(0,0,width,height);
  image(friend,0,0);
  image(mustache, mouseX-200, mouseY-200);
  if(mousePressed) {
    image(mustache, mouseX-200, mouseY-200);
  }
  else{
     fill(255,0,0);
  rect(0,0,width,height);
  image(friend,0,0);
  }
  
}