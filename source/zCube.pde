float xc,yc;
boolean cubepris=false;
boolean cubeboule=false;
int sallecube=0;

void cube() {
  fill(150);
if(cubepris==false) { if(salle==sallecube) { cubeanim.anim(xc-15,yc-15,30,30); }}
else { cubeanim.anim(x-55,y+28,30,30); }


if( touche['e']==true && cubepris==false && x>xc-10 && x <xc+10 && y>yc-10 && y<yc+10 && salle==sallecube && arme==-1) { cubepris=true; }
if(cubepris==false && x>xc-10 && x <xc+10 && y>yc-10 && y<yc+10 && salle==sallecube) { boutone2.anim(xc+10,yc-50,55,55);}

  if(touche['r']==true && cubepris==true) {xc=x; yc=y;  cubepris=false; sallecube=salle;}
  
//mode Orange  

//Prend le cube quand la boule est orange  
if(xboule>xc-10 && xboule <xc+10 && yboule>yc-10 && yboule<yc+10 && cubepris==false && cubeboule==false && couleurorange==true && dureT>0 && salle==sallecube) {cubeboule=true;} else {cubeboule=false;}

if(dureT==1 && cubepris==true) { if(couleurorange==true) {cubeboule=true;} else {xc=x; yc=y; cubepris=false; sallecube=salle;}}
  
if(cubeboule==true) {cubepris=false; xc=xboule; yc=yboule; sallecube=salle;  if(dureT>255) {cubeboule=false;}                       }
  
  
  
  
  
  
 
  
  
  
  
  
  
}
