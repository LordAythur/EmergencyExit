float depX=0;
float depY=0;

boolean couleurorange=false;
boolean reactive2=false;



void fusilactif() {
 
    //renitialisation
  if(dureT>=350) {ilesttire=false; dureT=0; reactive=false; jauge=25; }
  
  
  if(arme==1) {
   if(mousePressed==true && mouseButton == RIGHT && couleurorange==false && reactive2==true && dureT<199 && arme==1 && changementcouleur==true) { couleurorange=true; reactive2=false;}
   if(mousePressed==true && mouseButton == RIGHT && couleurorange==true && reactive2==true && dureT<199 && arme==1 && changementcouleur==true) { couleurorange=false; reactive2=false;}
   
   if(mousePressed==true && mouseButton == LEFT && dureT==0 && reactive2==true) {ilesttire=true; reactive2=false;}
   if(mousePressed==true && mouseButton == LEFT && dureT>1 && dureT<199 && reactive==true && reactive2==true) {dureT=200; reactive2=false;}
   
   
   if(ilesttire==true) {dureT++;}
   
   //Initialisation
   if(dureT==1) { 
     xboule=x;
     yboule=y;
     depX=(mouseX-x)/sqrt(pow((mouseX-x), 2)+pow((mouseY-y), 2));
     depY=(mouseY-y)/sqrt(pow((mouseX-x), 2)+pow((mouseY-y), 2));
   }
   
   //Activation
  if(dureT==250) {jauge=0;}
  
  
  //activation animation quand on clique

 if(dureT>=200 && dureT<250) {
   if(couleurorange==false) {
boulefin.anim(xboule-25,yboule-25,50,50);}
else {
 boulefinorange.anim(xboule-25,yboule-25,50,50); 
}
 }

 

  
  
  //deplacement du personnage :
  if(couleurorange==false) {
  if(dureT==251) {x=x+(xboule-x)/5; y=y+(yboule-y)/5;}
  if(dureT==252) {x=x+(xboule-x)/4; y=y+(yboule-y)/4;}
  if(dureT==253) {x=x+(xboule-x)/3; y=y+(yboule-y)/3;}
  if(dureT==254) {x=x+(xboule-x)/2; y=y+(yboule-y)/2;}
  if(dureT==255) {x=x+(xboule-x); y=y+(yboule-y);}
  }
  
  
 
   
   
   if(dureT>1) {
 //pendant la duré du missile
  if(dureT<200) {  fill(0,255,0);   
  xboule=xboule+depX*4;
 yboule=yboule+depY*4;

//delimitation de la map
if(xboule<12||xboule>990) {depX=-depX;}
if(yboule<12||yboule>790) {depY=-depY;}

//sprite boule
if(couleurorange==false) {
boule.anim(xboule-25,yboule-25,50,50);
}
else { bouleorange.anim(xboule-25,yboule-25,50,50);}


    }
 //fin du dureT>1

  
  //deplacement de la boule
  

 }
  }
 
 
  if(dureT>250) {jauge=jauge+0.25;}
  
  //Arme
  
  if(arme==1.0) {if(couleurorange==false) {tint(141,0,230);} else { tint(255,130,30);} image(armeboule,x+20,y+20,50,35); noTint();}
  if(arme==-1.0) {image(armesecondaire,x+15,y+19,50,38);}
 
  fill(255,255,255,50); strokeWeight(3); stroke(0,255,0); rect(x-12.5,y+40,25,25); fill(0,250,0,50); rect(x-12.5,y+65,25,-jauge); strokeWeight(1); noStroke();
  
  

  
  
}
