int tempsdebut;

void guidedebut() {
  msg1.lance();
  if(msg1.timerm>800) {
   msgp1.lance(); 
  }
  if(msg1.timerm>1600) {
   msg2.lance();
  }
  if(msg1.timerm>2400) {
   msgp2.lance();
  }
  if(msg1.timerm>3200) {
   msg3.lance();
  }
  if(msg1.timerm>4000) {
   msgp3.lance();
  }
  if(msg1.timerm>4800) {
   msg4.lance();
  }
  if(msg1.timerm>5600) {
   msgp4.lance();
  }
  if(msg1.timerm>6400) {
   msg5.lance();
  }
  if(msg1.timerm>8000) {
   msg1.timerm=-2;
   active=true;
   tempsdebut=1;
  }
  
  
  if(tempsdebut>0) {
    tempsdebut++;
    active=false;
    fleche.anim(270,700,80,80);
  }
  if(tempsdebut>200) {
   active=true;
  tempsdebut=0; 
  }
}

void guide2() {
  msg11.lance();
  if(msg11.timerm>1000) {
   msg12.lance(); 
  }
  if(msg11.timerm>2000) {
   msg13.lance(); 
  }
  if(msg11.timerm>3000) {
   msg14.lance(); 
  }
  if(msg11.timerm>4000) {
   msg15.lance(); 
  }
  if(msg11.timerm>5500) {
   msgp5.lance(); 
  }
  if(msg11.timerm>7000) {
   msg16.lance(); 
  }
  if(msg11.timerm>9300) {
    msg11.timerm=-2;
   active=true;
   timearme1=301;
  }

}



void guide3() {
  msg21.lance();
  if(msg21.timerm>1000) {
   msg22.lance(); 
  }
  if(msg21.timerm>2500) {
    msg21.timerm=-2;
   active=true;
   timearme2=501;
  }

}

void guide4() {
  msg31.lance();
  if(msg31.timerm>1100) {
   msg32.lance(); 
  }
  if(msg31.timerm>2200) {
   msg33.lance();
}
if(msg31.timerm>3300) {
   msg34.lance();
}
if(msg31.timerm>4400) {
   msg35.lance();
}
if(msg31.timerm>5500) {
   msgp6.lance();
}

if(msg31.timerm>7000) {
   msg31.timerm=-2;
   active=true;
   timearme3=501;
}
}


void guide5() {
  msg41.lance();
  if(msg41.timerm>1100) {
   msg42.lance(); 
  }
  if(msg41.timerm>2200) {
   msg43.lance();
}
if(msg41.timerm>3300) {
   msg44.lance();
}
if(msg41.timerm>4400) {
   msg45.lance();
}
if(msg41.timerm>5500) {
   msgp7.lance();
}

if(msg41.timerm>7000) {
   msg41.timerm=-2;
   active=true;
   declancheur=-1;
}
}





//1er dialogue

Message msg1,msg2,msg3,msg4,msgp1,msgp2,msgp3,msgp4,msg5;

//2 eme dialogue

Message msg11,msg12,msg13,msg14,msg15,msg16,msgp5;

//3 eme dialogue

Message msg21,msg22;

//4 eme dialogue

Message msg31,msg32,msg33,msg34,msg35,msgp6;

//5 eme dialogue

Message msg41,msg42,msg43,msg44,msg45,msgp7;

class Message {
char[] charmsg1;
float timerm=0; 
boolean personnage,debutv,dejafait;
float emplacementx,emplacementy,vitesse;


Message(String message1,float emplx,float emply,boolean perso,boolean debut, boolean fait, float vit){
personnage=perso;
emplacementx=emplx;
emplacementy=emply;
charmsg1 = new char[message1.length()];
for (int i = 0; i < message1.length(); i++) {
      charmsg1[i] = message1.charAt(i);
      println(charmsg1[i]);
  
}
debutv=debut;
dejafait=fait;
vitesse=vit;
}



void lance() {


 if(timerm>-1) {  
  active=false;
timerm=timerm+4*vitesse;

 
 if(debutv==false) {
 fill(20,150);
rect(0,0,1000,800);

fill(255,timerm);
rect(200,200,600,450);
fill(255,timerm/2);
for(int i=0;i<50;i++) {rect(random(100,150),random(100,650),100,100); rect(random(750,800),random(100,650),100,100);  rect(random(100,800),random(100,150),100,100); rect(random(100,800),random(600,650),100,100);}
fill(200);
if(mouseX>900 && mouseX<970 && mouseY>0 && mouseY<50) { fill(255,0,0);  if(mousePressed==true) {timerm=100000; reactive2=false;}}
textSize(50);
text("SKIP",900,50);
 }


 
if(timerm>300) { 

  
tint(255,timerm-300);
if(dejafait==false) {
if(personnage==false) {
image(qui,emplacementx,emplacementy,300,300);}
else {image(moi,emplacementx,emplacementy,300,300);}
}


textSize(25);
for(int i=0;i<charmsg1.length;i++) {
fill(0,timerm-600-10*i);
if(timerm>2000/vitesse) { fill(0,2200-timerm*vitesse);}
if(personnage==false) {text(charmsg1[i],emplacementx+260+i*10,emplacementy+170);}
if(personnage==true) {text(charmsg1[i],emplacementx-400+i*10,emplacementy+170);}

}



}
fill(255,timerm/2);
tint(255,255);
}


}

}



  
  
  

