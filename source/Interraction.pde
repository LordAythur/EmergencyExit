int perlimpimpin;
PImage byegro;
void interraction() {
  
  if(salle==0) {
  if(x>=915 && x<=955 && y>=610 && y<=690 && timearme2==0) { boutone.anim(940,605,55,55);}
 
 if(changementarme==false && x>=32 && x <=59 && y>652 && y < 665 && tempsreactiongateau==0) { boutone.anim(22,585,50,50);}
if(changementarme==true && x>=32 && x <=59 && y>652 && y < 665 && tempsreactiongateau==0) { boutone2.anim(22,585,50,50);}
  
  
  
  }
 
 if(salle==1) {
   
   if(x>=105 && x<=145 && y>=640 && y<=740 && timearme3==0) { boutone.anim(80,620,55,55);}
   
   
 }
 
 if(salle==10 && screamer==false) {
  //if(x>=480 && x<=480+50 && y>=210+70 && y<=210+80 && timearme2==0) { boutone.anim(940,675,55,55);}
 
  if(changementarme==false && x>=480 && x<=480+50 && y>=210+60 && y<=210+80 && tempsreactiongateau==0) { boutone.anim(450,160,50,50);}
  if(changementarme==true && x>=480 && x<=480+50 && y>=210+60 && y<=210+80 && tempsreactiongateau==0) { boutone2.anim(450,160,50,50);}

  if(arme==-1 && touche['e']==true && x>=480 && x<=480+50 && y>=210+60 && y<=210+80 && tempsreactiongateau==0) { screamer=true; }
    
    
  }

if(screamer==true) {perlimpimpin++; fill(50,100); rect(0,0,1000,800); fill(255,255);
screamers.play(); 


rectMode(CENTER);
    if(perlimpimpin>750 && perlimpimpin<760){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>760 && perlimpimpin<770){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>770 && perlimpimpin<780){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>780 && perlimpimpin<790){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>790 && perlimpimpin<800){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>800 && perlimpimpin<810){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>810 && perlimpimpin<820){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>820 && perlimpimpin<830){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>830 && perlimpimpin<840){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>840 && perlimpimpin<850){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>850 && perlimpimpin<860){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>860 && perlimpimpin<870){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>870 && perlimpimpin<880){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>880 && perlimpimpin<890){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>890 && perlimpimpin<900){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>900 && perlimpimpin<910){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>910 && perlimpimpin<920){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>920 && perlimpimpin<930){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>930 && perlimpimpin<940){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>940 && perlimpimpin<950){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>950 && perlimpimpin<960){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>960 && perlimpimpin<970){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>970 && perlimpimpin<980){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>980 && perlimpimpin<990){image(screamerimage2,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin>990 && perlimpimpin<1000){image(screamerimage,random(-100,1000),random(-100,800),random(100,1000),random(100,800));}
    if(perlimpimpin==1000){image(screamerimage2,0,0,1000,800);}
    if(perlimpimpin==1001){image(byegro,666,666,666,666);}
rectMode(CORNER);
}
 
 
  
}
