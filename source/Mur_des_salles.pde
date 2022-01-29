boolean doubleboutons1=false;
int timefinol=0;
int aide;
boolean ascenseuro=false;
void murdessalles() {
  
    
// SALLE -1
  
  if(x>=990 && salle==0) {
  x=20;
 dureT=350;
  salle=1;
}

if(x<=15 && salle==1) {
  x=980;
  salle=0;
 dureT=350;

}

if(y<=0 && salle==0) {
  y=780;
  x=500;
 dureT=350;
  salle=10;

}
if(y>=790 && salle==1) {
  y=20;
  salle=2;
  dureT=350;
 fin=true;  

}

if(y<=10 && salle==2) {
  y=780;
  salle=1;
  dureT=350;
 fin=true;  

}


if(salle==10) {
    for(int i=0; i<mursallemoins1.length; i++) { 
mursallemoins1[i].affichage(123,123,123); mursallemoins1[i].collisionperso(); mursallemoins1[i].collisionboule();}

  if(screamer==false) {
image(table1,480,210,70,40);
    image(gateau,500,200,30,30);
    tablegateau[1].collisionboule(); tablegateau[1].collisionperso();}
        
  }


                                                                                                                          // SALLE 0

  if(salle==0) {
     image(sol[0],10,578,400,214);
    
    image(table1,10,620,70,40);
   if(succes[1]==false) { image(gateau,31,615,30,30);}
    tablegateau[0].collisionboule(); tablegateau[0].collisionperso();
    
    
    

    //histoire1();
  if((dureT < 251 || dureT > 255) && x>=390 && x <=440 && y>=647 && y<=647+75 && meurtlaser==0) { meurtlaser=1; morts++;}
//  rect(360+30,615+32,50,75);

  laser.anim(360,615,110,140);



  
  
   for(int i=0; i<rec.length; i++) { rec[i].affichage(123,123,123);  rec[i].collisionboule(); rec[i].collisionperso();}
   
   //Porte salle 0
    
  
   

    for(int i=0; i<s0vide.length; i++) { //s0vide[i].affichage(0,0,255);  s0vide[i].collisionperso();
  s0vide[i].meurtv();}

  

 image(vide[0],10, 250, 290, 120);
image(panneau,250,350,50,50);

 image(vide[1],10, 0, 290, 110);
 image(vide[1],310, 300, 490, 300);
 image(vide[0],800, 470, 190, 100);
 
   

 
 
 
 fill(0);
 rect(310,550,680,50);
//orangelaser.anim(500,200,45,50);
fill(200);
 rect(310, 480, 190, 120);
 
 
bouton[0].bouton();

 if(bouton[0].appuyer==false) { timefinol=0;} else { if(timefinol==0) {timefinol=1;}}
 
 
 if((timefinol>0 && timefinol<10)||(timefinol>30 && timefinol<40)||(timefinol>60)) {} else {
 
 for(int i=0; i<2; i++) {if(couleurorange==false) { ol[i].collisionboule();}}
    for(int i=0; i<2; i++) {if(couleurorange==true) {}}
 
orangelaser.anim(310,430,45,50);
 orangelaser.anim(355,430,45,50);
 orangelaser.anim(400,430,45,50);
 orangelaser.anim(445,430,45,50);
 image(olcorner[0],490,430,50,50);
 orangelaser2.anim(490,480,50,45);
 orangelaser2.anim(490,525,50,45);
 orangelaser2.anim(490,555,50,45);
 }

if(timefinol>0 && timefinol<100) {timefinol++;}


levier[0].actif(320,470);

laserb[10].laserboule();

porte[1].on(levier[0].activer);
  porte[4].on(levier[3].activer);

  }

                                                                                                                          // SALLE 1


if(salle==1) {
  
levier[1].actif(40,330);  
  
bouton[1].bouton(); 
bouton[2].bouton();

if(bouton[1].appuyer==false) { modeT[0]=0;} else { modeT[0]=1;}
if(bouton[2].appuyer==false) { modeT[1]=3;} else { modeT[1]=0;}

 
 if(couleurorange==false) { ol[3].collisionboule();ol[3].collisionperso();}
 if(couleurorange==true) {ol[3].collisionperso();}

 porte[2].on(levier[1].activer);
 
  
//laser a désactivé :
if(levier[1].activer==false) {
 if(couleurorange==false) { ol[2].collisionboule(); ol[2].collisionperso();}
 if(couleurorange==true) {ol[2].collisionperso();} 
  
   orangelaser.anim(10,280,45,50);
 orangelaser.anim(55,280,45,50);
 orangelaser.anim(100,280,45,50);
}

 image(vide[0],310,90,200,50);
 image(vide[0],180,300,130,50);
 
 orangelaser.anim(10,470,45,50);
 orangelaser.anim(55,470,45,50);
 orangelaser.anim(100,470,45,50);


for(int i=0; i<mursalle1.length; i++) { 
mursalle1[i].affichage(123,123,123);  
mursalle1[i].collisionboule(); 
mursalle1[i].collisionperso();}



fill(0);
rect(310,120,200,370);
rect(180,330,130,160);
for(int i=0; i<s1vide.length; i++) { s1vide[i].affichage(0,0,0);}

fill(200,255); rect(520,300,70,70); if(x>510 && x<580 && y>300 && y<370) {meurtvide=-2;}
fill(200,255); rect(520,700,100,90); if(x>520 && x<620 && y>700 && y<790) {meurtvide=-2;    if(aide>=0 && bouton[2].appuyer==false) {aide++;}  }


//Aide 
if(aide>120) { 
  touche['z']=false;
  touche['s']=false;   
  touche['d']=false; 
  touche['q']=false; 
  textSize(17);
  text("Je crois que j'ai loupé quelque chose",x-100,y-100);
  if(aide>320) { aide=-1;}
}


for(int i=0; i<10;i++) {if(i!=5) {laserb[i].laserboule();}}



tuyauxs1[0].fond(modeT[0],350,100);
tuyauxs1[1].fond(modeT[1],350,300);

tuyauxs1[2].fond(modeT[2],820,250);
tuyauxs1[3].fond(modeT[3],820,450);
tuyauxs1[4].fond(modeT[4],510,450);
tuyauxs1[5].fond(modeT[5],820,650);


levier[2].actif(880,-20);
levier[3].actif(780,-20);
levier[4].actif(680,-20);
levier[5].actif(580,-20);


if(bouton[2].appuyer==false) { laserb[5].laserboule();}


//                 \ \ \ \ - / / / /
if(levier[2].activer==false && levier[3].activer==false && levier[4].activer==false && levier[5].activer==false||(levier[2].activer==true && levier[3].activer==true && levier[4].activer==true && levier[5].activer==true)) { modeT[2]=3; modeT[3]=0; modeT[4]=0; modeT[5]=2;}

//
if(levier[2].activer==true && levier[3].activer==false && levier[4].activer==false && levier[5].activer==false) { modeT[2]=1; modeT[3]=3;}

if(levier[2].activer==false && levier[3].activer==false && levier[4].activer==true && levier[5].activer==false) { modeT[2]=2; modeT[5]=0;}

if(levier[2].activer==true && levier[3].activer==false && levier[4].activer==false && levier[5].activer==false) { modeT[2]=1; modeT[3]=3;}

if(levier[2].activer==true && levier[3].activer==false && levier[4].activer==true && levier[5].activer==false) { modeT[2]=0; modeT[3]=1; modeT[4]=3; modeT[5]=0;}
  

  
                                                                                                                                        // SALLE 2
  
  if(salle==2) {
    
    
    
    
    
    
    
    
  }
  
  
  
  
  
                                                                                                                                  //FIN de la salle 2
bouton[3].bouton(); 
bouton[4].bouton();


if(bouton[3].appuyer==true && bouton[4].appuyer==true) { doubleboutons1=true;}
porte[3].on(doubleboutons1);

for(int i=0; i<s1vide.length; i++) { s1vide[i].meurtv();}

}

// SALLE 2
  
  if(salle==2) {
    
    bouton[5].bouton();

 if(bouton[5].appuyer==false) {ascenseuro=false;}
 if(bouton[5].appuyer==true) {ascenseuro=true;}
    
    for(int i=0; i<mursalle2.length; i++) { mursalle2[i].affichage(123,123,123);  mursalle2[i].collisionboule(); mursalle2[i].collisionperso();}
   
    fill(255,0,0);
    image(a,430,350,120,120);
    fill(0,0,0,0);
    stroke(255,0,0);
    strokeWeight(1);
    rect(470,410,40,40);
    noStroke();
    
    
    
    if(ascenseuro==true) {for(int i=0; i<ascenseurouvert.length; i++) { ascenseurouvert[i].collisionboule(); ascenseurouvert[i].collisionperso();}
//    stroke(0,255,0);
//    strokeWeight(1);
//    rect(455,360,1,90);
//    rect(456,360,69,1);
//    rect(456,360+40,69,1);
//    rect(456+69,360,1,90);
//    noStroke();
  }
    if(ascenseuro==false) {for(int i=0; i<ascenseurferme.length; i++) { ascenseurferme[i].collisionboule(); ascenseurferme[i].collisionperso();} 
//    stroke(0,255,0);
//    strokeWeight(1);
//    //rect(455,360,1,90);
//    //rect(456,360,69,1);
//    //rect(456,360+90,69,1);
//    //rect(456+69,360,1,90);
//    //rect(456,390,69,1);
//    noStroke();
}
    
    //x>=width/2-15 && x <=width/2+50 && y>=height/2-15 && y<=height/2+50
    
    
    
    
  }

}
  



