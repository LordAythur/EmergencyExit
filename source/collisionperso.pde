int courir=1;
float versx=0;
float versy=0;
float depxp,depyp;
int timevers;
int meurtlaser=0;
void perso() {
//mort dans le vide
  if(meurtvide<0) { meurtvide=0; active=true;}
 if(meurtvide>0) { if(meurtvide==1) {active=false;} meurtvide++;  if(meurtvide<20) {tombemort.anim(x-60,y-60,120,120);} 

 if(meurtvide<100 && meurtvide>=20) {tombemort.anim(x-80+meurtvide/2,y-80+meurtvide/2,140-meurtvide,140-meurtvide);} 

  if(meurtvide==100) { Vie=false;}  }
   
//mort dans un laser
 if(meurtlaser>0 && meurtlaser<100) { if(meurtlaser==1) {active=false; mortelec.index=0;} meurtlaser++; mortelec.anim(x-60,y-60,120,120);}
//voir en bas du void draw pour l'image apres la mort

  if (active==true) {
  
    //déplacement avec la souris
    
    if(mousePressed==true && mouseButton == CENTER) { versx=mouseX; versy=mouseY; if(x>versx-3 && x<versx+3 && y>versy-3 && y<versy+3) {} else {timevers=1;}}
    
     if(touche['z'] == true || touche['q'] == true || touche['d'] == true || touche['s'] == true||(x>versx-2 && x<versx+2 && y>versy-2 && y<versy+2)) {timevers=0;}  
    
    if(timevers>0) {
      fleche.anim(versx-40,versy-60,80,80);
      timevers++; if(timevers>200) {timevers=0;}
     if(versy<=y) {persoderriere.anim(x-60,y-60,120,120);} else {
    if(versx>=x) {  persodroite.anim(x-60,y-60,120,120);}
    if(versx<x) {  persodevant.anim(x-60,y-60,120,120);}}
    depxp=(versx-x)/sqrt(pow((versx-x),2)+pow((versy-y),2))*courir*3;
    depyp=(versy-y)/sqrt(pow((versx-x),2)+pow((versy-y),2))*courir*3;
    
    x=x+depxp;
    y=y+depyp;
   
}
    
    //fin du déplacement souris
    
      //Courir
  
     if(touche[' ']==true) {courir=2;} else {courir=1;}
    
     if(touche['&']==true && timeemote == 0 && succes[0]==true) {dab.rewind();   dab.play(); 
   emote[0]=true; timeemote=1; active=false;}
     if(touche['é']==true && timeemote == 0 && succes[1]==true) { emote[1]=true; timeemote=1; active=false; sonportal.rewind();  sonportal.play();
   }
     if(touche['"']==true && timeemote == 0 && succes[2]==true) { emote[2]=true; timeemote=1; active=false; saiyan.rewind();  saiyan.play();
   }
     if(int(key)==39 && timeemote == 0 && retour==true) { emote[3]=true; timeemote=1; active=false; }
    
    
    
    
if(touche['z']==true ) { y=y-3*courir; if(touche['q']==false && touche['d']==false && touche['s']==false) {persoderriere.anim(x-60,y-60,120,120);}}
  
if(touche['s']==true) { y=y+3*courir; if(touche['q']==false && touche['d']==false) {persodevant.anim(x-60,y-60,120,120);}}  
    
if(touche['q']==true)  { x=x-3*courir; persodevant.anim(x-60,y-60,120,120);}  
   
if(touche['d']==true) { x=x+3*courir; if(touche['q']==false) {persodroite.anim(x-60,y-60,120,120);}}  
     
     
     if(touche['z'] == false && touche['q'] == false && touche['d'] == false && touche['s'] == false && timevers==0) {  if(cubepris==true) { boutonr.anim(x+10,y-50,55,55); }   if(mouseX<=x) { image(personnage,x-60,y-60,120,120);}  else { image(personnage2,x-60,y-60,120,120);  }}
     
}
    
    //Ascenseur

if(salle==2 && touche['e']==true && x>=width/2-15 && x <=width/2+50 && y>=height/2-15 && y<=height/2+50) {fill(0,255,0); rect(0,0,500,500); //Animascenseur2()
} 


  
    
     
}     
