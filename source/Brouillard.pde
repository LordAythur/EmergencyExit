boolean[] noir = new boolean[10];
void brouillard() {
  
  
 
  
  
  if(salle==0) {
    
    
  if(x>0 && x <=410 && y >605 && y <= 800) { fill(20, 200);  if(noir[1]==true) {fill(0,255);}  rect(0,0,1000,600); fill(20, 200); if(noir[0]==true) {fill(0,255);} rect(420,600,580,200);}  
  if(x>0 && x <=1000 && y >0 && y <= 605) { fill(20, 200); rect(0,610,1000,190); noir[1]=false;}  
  if(x>410 && x <=1000 && y >605 && y <= 800) { fill(20, 200); rect(0,600,410,200); if(noir[1]==true) {fill(0,255);} rect(0,0,1000,600);  noir[0]=false;}  
  
  }
  
  if(salle==1) {
    
    
  if(x>0 && x <=510 && y >0 && y <= 490) { fill(20, 200); if(noir[2]==true) {fill(0,255);}  rect(520,0,1000-520,800); rect(0,500,520,800-500);}  
  if(x>510 && x <=1000 && y >0 && y <= 800 || x>0 && x<=1000 && y>500 && y<=800) { fill(20, 200); rect(0,0,510,490); noir[2]=false;}   
  
  }
  
  //Succes Gateau Affichage
  
if(timegateau>200 && timegateau<=300) {
   
   
   fill(255,255,0, timegateau*1.3-201); textSize(40); text("Nouvelle Emote Débloquée ! Touche[2] !",150,500);  fill(255); textSize(3);
   
 }
 if(timegateau>300 && timegateau<=500) {
 
 fill(255,255,0); textSize(40); text("Nouvelle Emote Débloquée ! Touche[2] !",150,500);  fill(255); textSize(3);
 
 }

if(timegateau>200 && timegateau<600) {
   succesg.anims();
 }
 
 
  
 
 
  interraction();

}
