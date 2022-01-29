float timecredit;
float yf=-1080;
float xf=0;
int yph=20;
int ypb=270;
void credit() {
salle=2;

timecredit=timecredit+1*courir*courir;
fill(0,timecredit/2);
rect(0,0,width,height);
  
  
if(timecredit/2>255) {
  active=true;
  
  
  
  
  
  

  FondFin.anim(xf,yf,2000,2080);
  fill(0,510-timecredit+255);
  rect(0,0,width,height);
  
  
  
  
  
  
  if(timecredit>1000 && timecredit<3000) {
fill(255,255,0);
textSize(80);
text("Une création de :",width/2-180,-100+timecredit*2-2000);
text("SYROTNIK Adrien",30,-100+timecredit*2-2150);
text("JORIS Arthur",width-400,-100+timecredit*2-2300);

text("Remerciements à :",width/2-208,-100+timecredit*2-3300);
textSize(50);
text("Bilal Scouris - Testeur / Idées",width/2-210,-100+timecredit*2-3500);
text("Adrien Nicolas - Notre Voisin",width/2-210,-100+timecredit*2-3550);
text("",width/2-205,-100+timecredit*2-3600);
}
fill(255);  
  
  
  if(timecredit<900) {
    feu[0].anim(width/2-40,1350-timecredit,20,20);
    feu[1].anim(width/2+20,1350-timecredit,20,20);
    feu[2].anim(width/2-35,1355-timecredit,20,20);
    feu[3].anim(width/2+15,1355-timecredit,20,20);
    
    image(a,width/2-60,1250-timecredit,120,120);
    y=1330-timecredit;
    x=width/2;
  }
  
  if(timecredit>=900 && timecredit<3040) {
    
   feu[0].anim(width/2-40,450,20,20);
   feu[1].anim(width/2+20,450,20,20);
   feu[2].anim(width/2-35,455,20,20);
   feu[3].anim(width/2+15,455,20,20);
   image(a,width/2-60,350,120,120);
   yf=timecredit/2-1080-450;
   
  }
  if(timecredit>=3040 && timecredit<3400) {
    feu[0].anim(width/2-40,1510-timecredit/2+450,20,20);
    feu[1].anim(width/2+20,1510-timecredit/2+450,20,20);
    feu[2].anim(width/2-35,1510-timecredit/2+455,20,20);
    feu[3].anim(width/2+15,1510-timecredit/2+455,20,20);
    image(a,width/2-60,1510-timecredit/2+350,120,120);
    y=1510-timecredit/2+430;
  }
  if(timecredit>=3400 && timecredit<4700) {
    feu[0].anim(width/2-40,260,20,20);
    feu[1].anim(width/2+20,260,20,20);
    feu[2].anim(width/2-35,265,20,20);
    feu[3].anim(width/2+15,265,20,20);
  image(a,width/2-60,160,120,120);
  xf=-timecredit/2+1700;
  
  if(timecredit>3420 && timecredit<3480) {
    textSize(50);
    fill(255,0,0);
    text("?",x-10,y-50);
  }
  
  if(timecredit>3450 && timecredit<3510) {
    textSize(50);
    fill(255,0,0);
    text("?",x+5,y-60);
  }
  
  
  }
  if(timecredit>3950 && timecredit<4150) {
  yph--;
  ypb++;
  }
  if(timecredit>4500 && timecredit<4700) {
  yph++;
  ypb--;
  }
  
  
  if(timecredit>4900 && timecredit<5000) {
  yph--;
  ypb++;
  x=-100;
  }
  
  if(timecredit>5100 && timecredit<5200) {
  yph++;
  ypb--;
  }
  
  
  
  
  
  
  if(timecredit>4900) {
    fill(200,20,0);
  textSize(50);
  text("This is only the beginning",350,280);
  }
  

  touche['z']=false;
  touche['s']=false;   
  touche['d']=false; 
  touche['q']=false; 
  perso(); emote(); }  
  
image(porteh,900+xf,yph+yf,587,250);
image(porteb,900+xf,ypb+yf,587,250);
 
 
 if(timecredit>5200) {
  fill(0);
 rect(0,0,width,height);
 }
 if(timecredit>5250) {
fill(255);
text("FIN",width/2-15,height/2-50);
 }
}
