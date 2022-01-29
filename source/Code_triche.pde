//int choisirendroit=0;
//float xendroit,yendroit;
boolean cochechecked;
int timercoche;
int timernoncoche;
boolean timercocheok;
boolean timernoncocheok;
boolean interraction2;
boolean music;

int timemusic=-1;

boolean effacer=true;

void code() {
  
  fill(50,50,50,100);
rect(0,0,1000,800);


 active=false; 
 fill(255);
text("PAUSE",450,400);

stroke(255,255,255);
  fill(0,0,0,0);
  rect(820,20,20,20);
  fill(255,0,0);
  text("Musique",850,36,50);
  noStroke();
  


  
  
//  if(mousePressed == true && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && cochechecked==false && cochechecked==false && timercoche==0 && timernoncoche==0 || 
//     mousePressed == true && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && cochechecked==false && cochechecked==false && timercoche==0 && timernoncoche>=10) { 
//
// cochechecked=true; timercocheok=true; timernoncocheok=false; timernoncoche=0; 
//
// }
  
  
//  if(mousePressed == true && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && cochechecked==true && timercoche>=10) { 
// 
//  timercocheok=false; cochechecked=false; timercoche=0; timernoncocheok=true;}
  
  
  if(timercocheok==true && timernoncocheok==false) {timercoche++;   image(checked,820,20,20,20);}
  if(timernoncocheok==true && timercocheok==false) {timernoncoche++;}
  
  
   if(mousePressed == true && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && interraction2==true && timemusic==-1) {interraction2=false; timemusic=0; 
        if(mousePressed == true && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && cochechecked==false && cochechecked==false && timercoche==0 && timernoncoche==0 || mousePressed == true && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && cochechecked==false && cochechecked==false && timercoche==0 && timernoncoche>=10) { 

             cochechecked=true; timercocheok=true; timernoncocheok=false; timernoncoche=0; music=true;

     }
   }
   
   if(mousePressed == false && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && interraction2==false && timemusic>=0) {interraction2=true;}
   
   if(mousePressed == false && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && interraction2==false && timemusic==-1) {interraction2=true;}
   
   if(mousePressed == true && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && interraction2==true && timemusic>=0) {interraction2=false; timemusic=-1; music=false; music3.close(); music3 = minim.loadSnippet("music3.wav");
   
   if(mousePressed == true && mouseX >= 820 && mouseX <= 840 && mouseY >= 20 && mouseY <= 40 && cochechecked==true && timercoche>=10) {timercocheok=false; cochechecked=false; timercoche=0; timernoncocheok=true;}
   }
  
  
  
    
 




fill(255);
text("Code : "+char(code[0])+" "+char(code[1])+" "+char(code[2])+" "+char(code[3]),400,500);

if(keyCode!=8) {

if(touche[key]==true && retour==true && numerocode==0) {retour=false; code[0]=int(key); numerocode++;}
if(touche[key]==true && retour==true && numerocode==1) {retour=false; code[1]=int(key); numerocode++;}
if(touche[key]==true && retour==true && numerocode==2) {retour=false; code[2]=int(key); numerocode++;}
if(touche[key]==true && retour==true && numerocode==3) {retour=false; code[3]=int(key); numerocode++;}}

else {
 if(numerocode>0 && effacer==true && numerocode<4) {
  code[numerocode]=0;
  numerocode--;
  effacer=false;
 } 
  
}

if(numerocode==4) {
if(char(code[0])=='3' && char(code[1])=='='&& char(code[2])=='=' && char(code[3])=='D') { changementarme=true; changementcouleur=true; fusil=true;}
if(char(code[0])=='d' && char(code[1])=='a'&& char(code[2])=='b' && char(code[3])=='s' && daba==false) { daba=true; succes[0]=true; succes[2]=true; }
if(code[0]==47 && code[1]==47 && code[2]==92 && code[3]==92) { fly=true; }
if(code[0]==92 && code[1]==92 && code[2]==47 && code[3]==47) { fly=false; }
if(char(code[0])=='6' && char(code[1])=='6'&& char(code[2])=='6' && char(code[3])=='6') { salle=10;}
if(char(code[0])=='|' && char(code[1])=='['&& char(code[2])==']' && char(code[3])=='|') { levier[0].activer=true;}
if(char(code[0])=='c' && char(code[1])=='u'&& char(code[2])=='b' && char(code[3])=='e') { xc=x; yc=y; sallecube=salle;}
if(char(code[0])=='e' && char(code[1])=='n'&& char(code[2])=='d' && char(code[3])=='s') { fin=true;}
//if(char(code[0])=='l' && char(code[1])=='i'&& char(code[2])=='f' && char(code[3])=='e' && choisirendroit==0) { Vie=true; choisirendroit=1; menupause=false;}


  
  
} 
  
  

  
  
  
}
