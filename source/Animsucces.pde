int timegateau=0;
int tempsreactiongateau=0;


void emote() {
  
  
   if(timeemote>0) {
    timeemote++;
   if (emote[0]==true && timeemote==220) { timeemote=0;  for(int i=0; i<emote.length ; i++) { emote[i]=false; } active=true;} 
    if (emote[1]==true && timeemote==420) { timeemote=0;  for(int i=0; i<emote.length ; i++) { emote[i]=false; } active=true;}
   if (emote[2]==true && timeemote==150) { timeemote=0;  for(int i=0; i<emote.length ; i++) { emote[i]=false; } active=true;}
   if (emote[3]==true && timeemote==300) { timeemote=0;  for(int i=0; i<emote.length ; i++) { emote[i]=false; } active=true; emoteoeil.index=0;}
  
  
  //Emote DAB
  
  if(emote[0]==true) {
    
if(( timeemote > 60 && timeemote<=105)||(timeemote > 130 && timeemote<=155 )||(timeemote > 170 && timeemote<=195)) {image(emoteimage[0], x-60, y-60 ,120,120);}

if(( timeemote > 105 && timeemote<=130 )||(timeemote > 155 && timeemote<=170 )||(timeemote > 195 && timeemote<=220)) {image(emoteimage[1], x-60, y-60 ,120,120);}

if( timeemote>0 && timeemote<=40 || timeemote>=220) {image(personnage,x-60,y-60,120,120);}
if( timeemote>40 && timeemote<=60 ) {image(personnage2,x-60,y-60,120,120);}
}

//Emote Portal

 if(emote[1]==true) {
 emoteportal.anim(x-60,y-60,120,120);
 }
 
 //Emote DBS
 
 if(emote[2]==true) {
 emotedb.anim(x-60,y-60,120,120);
 }

if(emote[3]==true) {
 emoteoeil.anim(x-60,y-60,120,120);
 if(timeemote==150) {oeil.rewind();  oeil.play();}
 }


}


//Succes Gateau

//interaction gateau


if(arme==1 && touche['e']==true && x>=32 && x <=59 && y>652 && y < 665 && tempsreactiongateau==0) {
 tempsreactiongateau=1; active=false;
} 
if(tempsreactiongateau>0 && tempsreactiongateau<100) {tempsreactiongateau++;

if(succes[1]==false && arme==1) { fill(255); textSize(15); text("Un gâteau que je ne peux pas attraper à mains nues...",10,700);}
if(succes[1]==true) { fill(255); textSize(15); text("Il n'y a plus rien sur cette table...",10,700);}


persoderriere.index=0; persoderriere.vit=100; persoderriere.anim(x-60,y-60,120,120); 
}
if(tempsreactiongateau==100) {tempsreactiongateau=0; persoderriere.vit=8;

 active=true;

}





if(tempsreactiongateau==0 && touche['e']==true && arme==-1 && x>=32 && x <=59 && y>652 && y < 665 && timegateau==0) {
  timegateau=1;
 active=false; 
}
  
  if(timegateau>0 && timegateau<600) { timegateau++; 
   if(timegateau<200) {persoderriere.anim(x-60,y-60,120,120); }
  }
    
    if(timegateau==200) {active=true; succes[1]=true;}

 





}
