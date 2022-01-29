PImage title;
PImage back;
PImage sprite;
PImage devant2;
PImage droites2;

int timedebut;
int ybouledebut;
int xbouledebut;
int timesprite;


void debut() {
  background(0);
  timedebut++;
  
  if(timedebut<=158) {xbouledebut=xbouledebut+5;}
  if(timedebut>158) {menu2=0;}
  imageMode(CENTER);
//image(title,width/2,height/5,700,150);
  bouled.anim(xbouledebut,120,100,100);
  
}


void menu () {
  

 
 //if(menu=
  
  imageMode(CORNER);
  image(back,0,0,width,height);
  music2();
  recta();
  
  dab();
}
  
  int timemenu;

void dab () {

timesprite++;
timemenu++;



if (timemenu<50) {image(devant2,sidex,sidey,1000,1000);}
if (timemenu>=50) {image(droites2,sidex,sidey,1000,1000);}
if (timemenu>=100) {timemenu=0;}

if (timesprite<50) {sidey=sidey-5;}
if (timesprite>250) {sidex=sidex+25;}
if (timesprite>=500) {sidey=1050; sidex=random(100,1000); timesprite=0;}
}

void music2 () {
  
  musicmenu.play();
}

  void recta ()
{

fill(0,0,0,200);
  rect(0,0,1000,800);
 fill(255,0,0);
  point(width/2+250,400);
  fill(67,159,255);
  
    {
  strokeWeight(5);
      textSize(width/30);
    stroke(67,159,255); 
  }
fill(0,0,0,100);
rectMode(CENTER);
  rect(width/2,height/2,width/2,height/7);
  fill(67,159,255);
  text("      Lancer la partie",width/2.7,height/1.95);
  fill(67,159,255);
 

  textSize(width/50);
  text("Copyright © : 49534E Production",width/1.55,height/1.05);
  
  rectMode(CORNER);
  
  
  imageMode(CENTER);
image(title,width/2,height/5,700,150); 
bouled.anim(790,120,100,100);
  
  if(mousePressed == true && mouseX >= width/2-250 && mouseX <= width/2+250 && mouseY >= height/2-71 && mouseY <= height/2+71) {
    

  strokeWeight(1); imageMode(CORNER); noStroke(); musicmenu.close(); menu2=1;

  }
}
   
