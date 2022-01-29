int timearme1=0;
int timearme2=0;
int timearme3=0;

void histoire() {
  
//  message=message+0.2;
// 
//  fill(0,0,0,80); rect(0,600,1000,200);
//  
//  for(int i=0; i<message ; i++) {
//     
// textSize(25);  fill(255); text(lettre,20+i*60,620);
//  }

//Arme 1

  if(timearme1==0 && salle==0) { image(armeboule,280,745,62,27);}
  

  if(x>=300 && x<=325 && y>=730 && y<=755 && timearme1==0) {       boutone.anim(290,700,50,50);           if(touche['e']==true) {timearme1=1; active=false;}}
  
  if(timearme1<300 && timearme1>0) {timearme1++;}
  
  if(timearme1>0 && timearme1<170) {recuparme1.anim(x-60,y-60,120,120);}
  
  if(timearme1==50) { 
  sonarmedebut.rewind(); sonarmedebut.play();
}
  if(timearme1==170) { fusil=true; active=true;}
  
  

  
  
  
  
  
  
  
  
  
  
//Arme 2  
  
   if(timearme2==0 && salle==0) { lootn.anim(910,620,55,55);}
  


if(x>=915 && x<=955 && y>=610 && y<=690 && timearme2==0 && touche['e']==true) { timearme2=1; active=false;}


if(timearme2<500 && timearme2>0) {timearme2++;}
  
if(timearme2>0 && timearme2<276) {lootobjet.anim(x-30,y-70,120,120);} 
if(timearme2>=276 && timearme2<380) { image(lootobjet2,x-30,y-70,120,120);}
if(timearme2>=276 && timearme2<380) { image(armesecondaire,x-30,y-70,50,40);}


if(timearme2==380) { changementarme=true; active=true;}
  
  
  
//Arme 3
  
   if(timearme3==0 && salle==1) { lootn.anim(100,650,55,55);}
  


if(x>=105 && x<=145 && y>=640 && y<=740 && timearme3==0 && touche['e']==true && salle==1) { timearme3=1; active=false;}


if(timearme3<500 && timearme3>0) {timearme3++;}
  
if(timearme3>0 && timearme3<276) {lootobjet.anim(x-30,y-70,120,120);} 
if(timearme3>=276 && timearme3<380) { image(lootobjet2,x-30,y-70,120,120);}
if(timearme3>=276 && timearme3<380) { tint(255,130,30); image(armeboule,x-30,y-70,50,35); noTint();}

if(timearme3==380) { changementcouleur=true; active=true;}
  
 
  
  
  
  
  
  
  
  
}
