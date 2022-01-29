import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import ddf.minim.*; 
import ddf.minim.analysis.*; 
import ddf.minim.effects.*; 
import ddf.minim.signals.*; 
import ddf.minim.spi.*; 
import ddf.minim.ugens.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Emergency_Exit extends PApplet {

//Librairie son






//
//Initialisation sons/musiques
AudioSnippet plop;
AudioSnippet dab;
AudioSnippet sonportal;
AudioSnippet sonarmedebut;
AudioSnippet saiyan;
AudioSnippet door;
AudioSnippet doori;
AudioSnippet leviers;
AudioSnippet oeil;
AudioSnippet screamers;
AudioSnippet screamersound;
AudioSnippet music3;
AudioSnippet musicmenu;
AudioSnippet winwin;
AudioSnippet squalala;
//
//Librairie son
Minim minim;
//
//Initialisation des boolean/int/float/PImage
int timemort=200;

boolean fly=false;

int morts=0;

int menu2=0;

PImage a;
PImage fondfin;

boolean fin=false;
boolean pause=false;
boolean menupause=false;
int[] modeT= new int[10];

int meurtvide=0; 

boolean active=true;
boolean fusil=false;
boolean changementarme=false;
boolean changementcouleur=false;

PFont police;

boolean[] succes = new boolean[10];

PImage table1, gateau,panneau;
boolean daba=false;

boolean[] emote = new boolean[5];
int timeemote=0;
PImage[] emoteimage = new PImage[5];

boolean[] marche = new boolean[4];

boolean interraction=true;

boolean Vie = true;
 
int salle=0;

PImage armeboule;
PImage armesecondaire;
float arme=1;

int timewinwin;

boolean[] touche = new boolean[70000];
float x, y;

float molette;

float jauge=25;
boolean ilesttire=false;
boolean reactive=false;
int dureT=0;
float xboule, yboule;

PImage[] sol = new PImage[5];
PImage[] vide = new PImage[5];
PImage[] olcorner = new PImage [1];

PImage checked;

PImage personnage,personnage2;

PImage redb,greenb;

PImage[] coin = new PImage[4];
PImage coinp;
PImage fondcoind;
PImage fondcoing;
PImage fondcoinh;
PImage fondcoinb;


PImage moi;
PImage qui;

boolean screamer;
PImage screamerimage;
PImage screamerimage2;

PImage mortelec2;
PImage lootobjet2;

boolean retour=true;
int[] code=new int[4];
int numerocode=0;
int attend=0;

PImage porteh,porteb;
int declancheur;

float sidex;
int sidey;

public void setup() {
  //Cr\u00e9dit
  porteh = loadImage("porte1.png");
  porteb = loadImage("porte2b.png");
  
  
  //Ombre
  for(int i=0;i<noir.length;i++) {noir[i]=true;}
  
  noStroke();
  
  //Initialisation sons/musiques suite
  minim = new Minim(this);
  plop = minim.loadSnippet("plop.mp3");
  dab = minim.loadSnippet("dab.mp3");
  sonportal = minim.loadSnippet("sonportal.mp3");
  sonarmedebut = minim.loadSnippet("oh.mp3");
  saiyan = minim.loadSnippet("saiyan.mp3");
  door = minim.loadSnippet("door.mp3");
  doori = minim.loadSnippet("doori.mp3");
  leviers = minim.loadSnippet("levier.mp3");
  oeil = minim.loadSnippet("sonoeil.mp3");
  screamers = minim.loadSnippet("screamers.mp3");
  screamersound = minim.loadSnippet("screamersound.mp3");
  music3 = minim.loadSnippet("music3.wav");
  musicmenu = minim.loadSnippet("musicmenu.mp3"); 
    winwin = minim.loadSnippet("winwin.mp3");
  squalala = minim.loadSnippet("squalala.mp3");
  //
  //Initialisation police
  police = loadFont("AgencyFB-Reg-48.vlw");
textFont(police,48);
  //
  
  
  frame.setIconImage((java.awt.Image) loadImage("icon.png").getNative());
  
 size(1000,800);
 
 //Cube
 xc=900;
 yc=40;
 
 
 //Emote
 for(int i=0 ; i<emote.length ; i++) { emote[i]=false;}
 emoteimage[0] = loadImage("DAB.png");
 emoteimage[1] = loadImage("DAB2.png");
 
 //Succes
 
  for(int i=0 ; i<succes.length ; i++) { succes[i]=false;}

//Initialisation images

//Image menu
  title = loadImage("title.png");
  back = loadImage("back.png");
  //sprite = loadImage("sprite.png");
  devant2 = loadImage("devant2.png");
  droites2 = loadImage("droites2.png");
  bouled=new SpriteAnim("bouledebut.png",12,5,256,256,0);
  sidey=1050;
  sidex=500;

 //Image perso vignette
 moi = loadImage("moi.png");
 qui = loadImage("qui.png");

 a= loadImage("a.png");
 fondfin= loadImage("fondfin.png");
 //Image d\u00e9cor
 table1 = loadImage("table.png");
 gateau = loadImage("gateau.png");
 panneau = loadImage("panneau.png");
  
 //Image succ\u00e8s
 succesg = new AnimSucces("succescake.png");
 succesd = new AnimSucces("a_5.png");
 
 //Image ??
 screamerimage= loadImage("screamerimage.png");
 screamerimage2= loadImage("screamerimage2.png");
 
 //Image checked
 checked= loadImage("checked.png");
 
 //Image laser
 orangelaser = new SpriteAnim("orangelaser.png",7,5,64,64,0);
 orangelaser2 = new SpriteAnim("orangelaser2.png",7,8,64,64,0);
 olcorner[0] = loadImage("orangelaser_corner.png");
 laser= new SpriteAnim("laser.png",5,10,128,128,0);
 
 //Images boule
 boulefinorange=new SpriteAnim("boulefin2.png",9,5,128,128,0);
 bouleorange=new SpriteAnim("bouleeffet2.png",12,5,128,128,0);
 boule=new SpriteAnim("bouleeffet.png",12,5,128,128,0);
 boulefin=new SpriteAnim("boulefin.png",9,5,128,128,0);
 
 //Image sprite personnage
 persodevant= new SpriteAnim("sprite_devant.png",8,8,128,128,0);
 persoderriere= new SpriteAnim("sprite_derriere.png",8,8,128,128,0);
 persodroite= new SpriteAnim("droite.png",8,8,128,128,0);
 personnage = loadImage("devant.png");
 personnage2 = loadImage("droites.png");
 
 //Image cube
 cubeanim= new SpriteAnim("cubeanim.png",10,5,128,128,0);

 
 //Image r\u00e9cup\u00e9ration arme et diamant
 lootn= new SpriteAnim("lootn.png",10,5,128,128,0);
 lootobjet= new SpriteAnim("lootobjet.png",23,12,128,128,0);
 lootobjet2=loadImage("lootobjet2.png");
 recuparme1= new SpriteAnim("recuparme1.png",17,10,128,128,0);
 
 //Image Bouton
 boutone = new SpriteAnim("boutone.png",3,20,128,128,0);
 boutone2 = new SpriteAnim("boutone2.png",3,20,256,256,0);
 boutonr = new SpriteAnim("boutonr.png",3,20,128,128,0);
 redb= loadImage("redbutton.png");
 greenb= loadImage("greenbutton.png");
 
 //Image emotes
 emoteportal= new SpriteAnim("emoteportal.png",42,10,128,128,0);
 emotedb= new SpriteAnim("emotedb.png",15,10,128,128,0);
 emoteoeil= new SpriteAnim("emoteoeil.png",30,10,128,128,0);
 
 //Image morts
 tombemort= new SpriteAnim("tombevide.png",20,5,128,128,0);
 mortelec2 = loadImage("mortelec2.png");
 mortelec= new SpriteAnim("mortelec.png",16,8,128,128,0);
 
 //Image fl\u00e8che d\u00e9placement
 fleche= new SpriteAnim("fleche.png",9,5,128,128,0);
 
 //Image levier
 activel= new SpriteAnim("activel.png",20,6,128,128,0);
 activelretour= new SpriteAnim("activelretour.png",20,6,128,128,0);
 levierna= new SpriteAnim("levierna.png",5,5,128,128,200);
 leviera= new SpriteAnim("leviera.png",5,5,128,128,200);

 //Fond de la fin
 FondFin = new SpriteAnim("ffinal.png",8,20,2000,2080,0);
 for(int i=0;i<feu.length;i++) {
 feu[i] = new SpriteAnim("feu.png",6,4,32,32,0);
 }
//


//Salle 0

// (Sens 1 : Horizontal, 2 : Vertical // direction en x 1 ou -1 // idem mais pr y // Coordonn\u00e9es x // Coordonn\u00e9es y // num\u00e9ro de la porte)
for(int i=0;i<levier.length;i++) { levier[i]= new Levier();}
  laserb[10] = new Collision(600,610,1,180);

  bouton[0] = new Bouton(870,380);

  porte[0] = new Porte(1,-1,1,150,600,0);
  porte[1] = new Porte(2,1,-1,990,100,1);
  
  porte[4] = new Porte(1,-1,-1,730,0,4);


    rec[0] = new Collision(0 ,0 ,10,800);
    rec[1] = new Collision(800,0,200,10);
    rec[12] = new Collision(0,0,730,10);
    rec[2] = new Collision(0,790,1000,10);
    rec[3] = new Collision(990,0,10,100);
    rec[4]  = new Collision(990,170,10,660);
    rec[5]  = new Collision(0,600,150,10);
    rec[6]  = new Collision(220,600,200,10);
    rec[7]  = new Collision(410,600,10,50);
    rec[8] = new Collision(410,720,10,80);
    rec[9] = new Collision(420,600,570,10);
    rec[10] = new Collision(300, 200, 10, 400);
    rec[11] = new Collision(300, 0, 10, 100);
    rec[13] = new Collision(850, 610, 10, 100);
    rec[14] = new Collision(650, 700, 10, 90);

   
   vide[0] = loadImage("vide1.png");
    vide[1] = loadImage("vide2.png");
   
    ol[0] = new Collision(310,449,212,15);
    ol[1] = new Collision(509,464,16,136);
   
    
    s0vide[0] = new Collision(10, 275, 290, 60);
    s0vide[1] = new Collision(10, 10, 290, 75);
    s0vide[2] = new Collision(520, 480, 480, 120);
    s0vide[3] = new Collision(310, 310, 480, 140);

    tablegateau[0] = new Collision(10,610,60,20);
 
    sol[0] = loadImage("sol2.png");
 
 
 
 
 //salle 1
 
bouton[1] = new Bouton(100,200);
bouton[2] = new Bouton(200,200); 
 
 for(int i=0;i<6;i++) {tuyauxs1[i] = new Rebondir();}

    laserb[0] = new Collision(310,100,200,1);
    laserb[1] = new Collision(510,100,1,390);
    laserb[2] = new Collision(180,490,330,1);
    laserb[3] = new Collision(310,200,1,110);
    laserb[4] = new Collision(145,310,166,1);
    
    laserb[5] = new Collision(520,690,1,100);
    laserb[6] = new Collision(520,300,300,1);
    laserb[7] = new Collision(610,420,380,1);
    laserb[8] = new Collision(520,500,1,190);
    laserb[9] = new Collision(520,600,330,1);

     mursalle1[0] = new Collision(145,490,375,10);
    mursalle1[1] = new Collision(0 ,0 ,10,110);
    mursalle1[2] = new Collision(0,0,1000,10);
    mursalle1[3] = new Collision(170,790,830,10);
    mursalle1[4] = new Collision(990,0,10,1000);
    mursalle1[5] = new Collision(0,790,100,10);
    mursalle1[6] = new Collision(0,180,10,650);
    mursalle1[7] = new Collision(145,300,155,10);
    mursalle1[8] = new Collision(300,200,10,110);
    mursalle1[9] = new Collision(300,90,10,30);
    mursalle1[10] = new Collision(310,90,200,10);
    mursalle1[11] = new Collision(510,90,10,400);
    mursalle1[12] = new Collision(510,10,10,10);
    
    ol[2] = new Collision(10,300,149,15);
    ol[3] = new Collision(10,490,149,15);
    

    s1vide[0] = new Collision(310,100,200,390);
    s1vide[1] = new Collision(180,310,130,180);
    s1vide[2] = new Collision(520,200,1000-530,590);
    s1vide[3] = new Collision(300,500,510,290);
    s1vide[4] = new Collision(10,500,300,90);

    porte[2] = new Porte(2,-1,-1,510,20,2);
    porte[3] = new Porte(1,-1,1,100,790,3);
    
    bouton[3] = new Bouton(30,730);
    bouton[4] = new Bouton(200,730);
 
 armeboule= loadImage("armeboule.png");
 armesecondaire= loadImage("arme2.png");
 
 
 //salle -1
    
    mursallemoins1[0] = new Collision(0,0,1000,10);
    mursallemoins1[1] = new Collision(0 ,0 ,10,800);
    mursallemoins1[2] = new Collision(0,790,1000,10);
    mursallemoins1[3] = new Collision(990,0,10,800);
    
    tablegateau[1] = new Collision(480,210,70,40); 
 
 
 //salle 2
 
 mursalle2[0] = new Collision(0 ,0 ,10,800);
 mursalle2[1] = new Collision(0 ,0 ,100,10);
 mursalle2[2] = new Collision(170 ,0 ,830,10);
 mursalle2[3] = new Collision(0 ,790 ,1000,10);
 mursalle2[4] = new Collision(990 ,0 ,10,800);
 
  ascenseurferme[0] = new Collision(455,360,70,90);
 
 ascenseurouvert[0] = new Collision(455,360,1,90);
 ascenseurouvert[1] = new Collision(456,360,69,1);
 ascenseurouvert[2] = new Collision(456,360+40,69,1);
 ascenseurouvert[3] = new Collision(456+69,360,1,90);
 
 ascenseurferme[0] = new Collision(455,360,3,90);
 ascenseurferme[1] = new Collision(458,360,69,1);
 ascenseurferme[2] = new Collision(456,360+90,69,1);
 ascenseurferme[3] = new Collision(458+69,360,3,90);
 ascenseurferme[4] = new Collision(456,390,69,1);
 
 bouton[5] = new Bouton(550,420);
 
 
//Image des tuyaux 
 
  coinp=loadImage("coin.png");
for(int i=0;i<4;i++) {coin[i]=coinp.get(i*128,0,128,128);}
fondcoing= loadImage("fondcoingauche.png");
fondcoind= loadImage("fondcoindroite.png");
fondcoinh= loadImage("fondcoinhaut.png");
fondcoinb= loadImage("fondcoinbas.png");
 
 //SPAWN
 
 x=100;
 y=700;

//Message / x / y / image --> false : myst\u00e8re ; true : perso / Commencement \u00e0 0 : false / \u00e0 1000 : true / vitesse 1 de base 
 msg1=new Message("Bonsoir.",100,80,false,false,false,1.1f);
 msgp1= new Message("O\u00f9 est-ce que je suis ?",600,280,true,true,false,1.1f);
 msg2=new Message("Vous \u00eates dans mon centre de recherche.",100,80,false,true,true,1.1f);
 msgp2=new Message("Quoi ?! Faites moi sortir d'ici !",600,280,true,true,true,1.1f);
 msg3=new Message("Du calme... Je ne compte pas te garder ici.",100,80,false,true,true,1.1f);
 msgp3=new Message("Comment \u00e7a ???",600,280,true,true,true,1.1f);
 msg4=new Message("Va prendre l'arme au sol, je t'expliquerai...",100,80,false,true,true,1.1f);
 msgp4=new Message("Une arme ? Attendez !",600,280,true,true,true,1.1f);
 msg5=new Message("Ah oui, utilise Z,Q,S,D pour te d\u00e9placer.",100,80,false,true,true,1.1f);
 
 msg11=new Message("Bien, le sujet r\u00e9agit normalement, on peut continuer.",100,80,false,false,false,1.3f);
 msg12=new Message("Cet arme vous permet de vous t\u00e9l\u00e9porter.",100,80,false,true,true,1.3f);
 msg13=new Message("Visez, clic gauche, recliquez et voil\u00e0.",100,80,false,true,true,1.3f);
 msg14=new Message("Passez la barri\u00e8re \u00e9lectrique. Mais attention !",100,80,false,true,true,1.3f); 
 msg15=new Message("N'essayez pas de la toucher...",100,80,false,true,true,1);
 msgp5= new Message("Je ne comprend rien...",600,280,true,true,false,1);
 msg16=new Message("Il n'y a rien \u00e0 comprendre. Continuez.",100,80,false,true,true,1);
 
 msg21=new Message("Utilise la molette pour changer d'arme.",100,80,false,false,false,1.3f);
 msg22=new Message("Em main, tu pourras activer certaines choses.",100,80,false,true,true,1.3f);
 
 msg31=new Message("Voici une am\u00e9lioration : clic droit.",100,80,false,false,false,1.2f);
 msg32=new Message("Tu ne pourras plus te t\u00e9l\u00e9porter...",100,80,false,true,true,1.2f);
 msg33=new Message("Mais tu pourras t\u00e9l\u00e9porter le cube ! De plus,",100,80,false,true,true,1.2f);
 msg34=new Message("la boule pourra traverser les murs de sa couleur.",100,80,false,true,true,1.2f);
 msg35=new Message("N'h\u00e9site pas \u00e0 changer lorsqu'elle est lanc\u00e9e.",100,80,false,true,true,1.2f);
 msgp6= new Message("\u00c7a commence \u00e0 devenir compliqu\u00e9...",600,280,true,true,false,1.1f);
 
 msg41=new Message("Dans cette salle il y aura des tuyaux.",100,80,false,false,false,1.2f);
 msg42=new Message("La boule entre par un c\u00f4t\u00e9, et ressort de l'autre.",100,80,false,true,true,1.2f);
 msg43=new Message("Vise le point noir au milieu et tire.",100,80,false,true,true,1.2f);
 msg44=new Message("Attention n\u00e9anmoins aux barri\u00e8res rouges...",100,80,false,true,true,1.2f);
 msg45=new Message("La boule n'appr\u00e9cie gu\u00e8re ce genre de choses.",100,80,false,true,true,1.2f);
 msgp7= new Message("Tirer sur le point noir hein ? ok...",600,280,true,true,false,1.1f);
 
 
}



public void draw() {
  
  if(menu2==10) {debut();}
  
    if(menu2==0) {menu();}
  
  if (menu2==1) {squalala.play(); timewinwin++; fill(0,0,0,timewinwin); rect(0,0,width,height); if(timewinwin==200) {menu2=2;}}
  
  
  if (menu2==2) { 
if(timecredit/2<=255) {  
 background(200);
 

 
 if(molette==-1 || molette==1) {arme=-arme; molette=0;}

  


     murdessalles(); 
     
  
 
     
//   
//  fill(255);
//  rect(x-25,y-25 ,50,50);

  
  
 
  
 

 for(int i=0;i<4;i++) {marche[i]=true;}


  if(Vie==true) {
   

   //ne s'active que si l'on peut bouger
   if(fusil==true && active==true) { fusilactif(); }
   
   
   cube();
perso(); emote();
}
tuyaux();

histoire();
     
brouillard();
if(salle==0) {porte[0].on(true);}
  
  
  
 
// stroke(255,0,0); strokeWeight(3); line(x ,y ,mouseX,mouseY); noStroke();


 
 if(Vie==false){
  textSize(50); fill(255,0,0); text("GAME OVER",420,300);  text(timemort/60,490,370);
  timemort--;
 }
 
  if((touche['1']==true && touche['2']==true && touche['3']==true) || timemort==0) {x=100; y=700; Vie = true; meurtvide=0; meurtlaser=0; active=true; dureT=350; salle=0; timevers=0; cubepris=false; sallecube=0; xc=900; yc=40; timemort=200;}
fill(255,255,255);
textSize(20);


//text(frameRate,20,20);

if(menupause==true) {
  code();
}

if(music==true) {
  music();
}

if(Vie==true && menupause==false && fin==false) {timer();}
if(fin==true) {textSize(70); fill(100,0,0);  text("Temps : "+minute+"."+seconde+"."+mili*10/6,300,200);        text("Nombre de morts :"+morts,250,300);}
















if(numerocode==4) {
  if(attend<50) {
  attend++;
}
else{
code[0]=0;
code[1]=0;
code[2]=0;
code[3]=0;
attend=0;
numerocode=0;
}
}



//animation lorsque l'on meurt du laser
  if(meurtlaser==100) { Vie=false; image(mortelec2,x-60,y-60,120,120);} 

if(daba==true) {succesd.anims();}




 if(timearme1==0 && salle==0) {guidedebut();}
 
   //d\u00e9clanche le 2 eme dialogue
  if(timearme1==300) { guide2(); }
  
  if(timearme2==500) { guide3(); }
  
  if(timearme3==500) { guide4(); }
  
  if(declancheur>=0 && salle==1) { declancheur++; }
  if(declancheur>=100) { guide5(); }
}

if(fin==true) {
  credit();

}

}



}



public void keyPressed() {
  println(keyCode);
  if(keyCode>20) {
  touche[key] = true;
  }

if (keyCode == 27 && pause==false && menupause==false) {
    pause=true;
    menupause=true;
    code[0]=0;
    key = 0;
}


if (keyCode == 27 && pause==false && menupause==true) {
    pause=true;
    menupause=false;
    active=true;
    key = 0;
}
}


public void keyReleased() {
  if(keyCode>20) {
 touche[key] = false;
  } 
 retour=true;
 effacer=true;
 if (keyCode == 27) {
    pause=false;
    numerocode=0;
    code[0]=0;
    code[1]=0;
    code[2]=0;
    code[3]=0;
    key = 0;
}

}

public void mouseReleased() {
 if(reactive==false && dureT>0) {reactive=true; }
if(reactive2==false) { reactive2=true;}
}

public void mouseWheel(MouseEvent event) {
 if(changementarme==true && dureT==0) { molette = event.getCount();}

}


SpriteAnim bouleorange;
SpriteAnim boulefinorange;
SpriteAnim boule;
SpriteAnim bouled;
SpriteAnim boulefin;
SpriteAnim laser;

SpriteAnim orangelaser;
SpriteAnim orangelaser2;


SpriteAnim persodroite;
SpriteAnim persodevant;
SpriteAnim persoderriere;
SpriteAnim emoteportal;
SpriteAnim emotedb;
SpriteAnim emoteoeil;

SpriteAnim tombemort;
SpriteAnim mortelec;

SpriteAnim recuparme1;
SpriteAnim cubeanim;

SpriteAnim lootn;
SpriteAnim lootobjet;
SpriteAnim boutone;
SpriteAnim boutone2;
SpriteAnim boutonr;

SpriteAnim activel;
SpriteAnim activelretour;
SpriteAnim levierna;
SpriteAnim leviera;

SpriteAnim fleche;

SpriteAnim FondFin;
SpriteAnim[] feu = new SpriteAnim[4];


class SpriteAnim {
  int index;
  int compt;
  int vit;
  int nbImg;
  PImage img;
  PImage[] tabImg;
  int Hauteur;
  int Longueur;
  int timeanim=0;
  int timeavantanim;
  SpriteAnim(String nomImg,int nbImage, int vitAnim, int L, int H,int timeavant){
    index=0;
    compt=0;
    vit=vitAnim;
    nbImg=nbImage;
    img=loadImage(nomImg);
    Hauteur=H;
    Longueur=L;
    tabImg=new PImage[nbImage];
    timeavantanim=timeavant;
    for (int i=0;i<nbImg;i++){
      tabImg[i]=img.get(Longueur*i,0,Longueur,Hauteur);
    }
  }
  public void anim(float x, float y, float tx, float ty){
     if(timeanim>timeavantanim) {
     compt++;
    if (compt==vit){
      compt=0;
      index=index+1;
      if (index==nbImg){
        index=0;
        timeanim=0;
      }
    }
  }
  
    timeanim=timeanim+1;
    image(tabImg[index],x,y,tx,ty);
  }
}









Collision[] rec = new Collision[15];
Collision[] mursalle1 = new Collision[13];
Collision[] mursalle2 = new Collision[5];
Collision[] mursallemoins1 = new Collision[4];
Collision[] ascenseurferme = new Collision[5];
Collision[] ascenseurouvert = new Collision[4];

Collision[] tablegateau = new Collision[2];

Collision[] s0vide = new Collision[4];
Collision[] s1vide = new Collision[5];

Collision[] ol = new Collision[4];







//salle 1



Collision salle1trou1;
Collision salle1trou2;
Collision salle1trou3;

Collision[] portec = new Collision[10];

Collision[] laserb = new Collision[11];

class Collision {
float x1,x2,y1,y2;
  Collision(float x7,float y7, float x8, float y8){
  x1=x7;
  y1=y7;
  x2=x8;
  y2=y8;
 }
  public void affichage(int r, int g, int b){
   fill(r,g,b);   rect(x1,y1,x2,y2);
}

public void collisionboule(){
    
    
    //HITBOX EN X
if(
(depX<0 &&  xboule <=x1+x2+10 && xboule >=x1+x2+6 && yboule>=y1 && yboule<=y1+y2)
|| (depX>0 && xboule >=x1-10 && xboule <=x1-6 && yboule>=y1-10 && yboule<=y1+y2+10)

)

{depX=-depX;
plop.rewind();
plop.play();
}
    //HITBOX EN Y
  
 if(
 
(depY<0 && yboule <= y1+y2+10 && yboule >= y1+y2+6  && xboule>=x1-10 && xboule<=x1+x2+10)
|| (depY>0 && yboule >=y1-10 && yboule <=y1-6 && xboule>=x1-10 && xboule<=x1+x2+10)
 
)

 {depY=-depY;
 plop.rewind();
 plop.play();
 }
}


public void collisionperso() {
if(fly==false) {
  //touche Z
  if(y >= y1+y2+0 && y <= y1+y2+25 && x >= x1-15 && x <= x1+x2+15) {//marche[0]=false;
  y=y+3*courir;}
  //touche S
  if(y >= y1-25 && y <= y1-0 && x >= x1-15 && x <= x1+x2+15) {//marche[1]=false; 
y=y-3*courir;}
  //touche Q
  if(x >= x1+x2+0 && x <= x1+x2+15 && y >= y1-25 && y <= y1+y2+25) {//marche[2]=false;
x=x+3*courir;}
  //touche D
  if(x >= x1-15 && x <= x1-0 && y >= y1-25 && y <= y1+y2+25) {//marche[3]=false;
x=x-3*courir;}
}
}
public void meurtv(){
if(fly==false) {
 if((dureT < 251 || dureT > 255) && x>=x1-2 && x<=x1+x2+2 && y >= y1-22 && y<=y1+y2+2 && meurtvide==0) { meurtvide=1; morts++;}
 if(dureT > 255 && xc>=x1-2 && xc<=x1+x2+2 && yc >= y1-22 && yc<=y1+y2+2 && meurtvide==0 && salle==sallecube)  {sallecube=0; xc=900; yc=40;}
}
}



public void laserboule(){
    
    
    
if(xboule>x1-10 && xboule<x1+x2+10 && yboule>y1-10 && yboule<y1+y2+10 && dureT<200 && dureT>2) { dureT=200;}
fill(random(100,255),0,0,255); rect(x1,y1,x2,y2);

}
}




AnimSucces succesg;
AnimSucces succesd;

class AnimSucces {
  PImage img;
  int time;
  AnimSucces(String nomImg){
    time=0;
    img = loadImage(nomImg);
    
  }
  public void anims(){
    
   if(time<=60) { image(img,-320+time*10,350,320,70); }
   if(time>60 && time <=250) {  image(img,-320+600+time/4,350,320,70); }
   if(time>250 && time<500) { image(img,-320+650-2500+time*10,350,320,70);}
  if(time<500) {  time++;}
    
    

  }
  }

Porte[] porte = new Porte[10];

class Porte {
  
  float timep=0;
  int Sens,nombre,modex,modey;
  float xp,yp,xpdepart,ypdepart;
  Porte(int procedure,int modenx,int modeny,int xp1,int yp1,int numero){
    if(procedure==1) {portec[numero] = new Collision(xp1,yp1,70,10);} else {portec[numero] = new Collision(xp1,yp1,10,70);}
   Sens=procedure;
   nombre=numero;
   xp=xp1; yp=yp1;
   xpdepart=xp1;
   ypdepart=yp1;
   modex=modenx;
   modey=modeny;
  }
public void on(boolean lock){
  portec[nombre].collisionperso();
  portec[nombre].collisionboule();
  if((timep>0 && timep<93)||(timep>94 && timep<186)) {timep++;} if(timep==186) {timep=0;}
 
 if(lock==false) {   portec[nombre].affichage(255,0,0);} if(lock==true) {   portec[nombre].affichage(0,150,0);}
 
 if(Sens==1) {
   portec[nombre] = new Collision(xp,yp,70,10);
 
 if(timep>0 && timep<20) { yp=ypdepart+(-timep/2-1)*modey;}
 if(timep>=20 && timep<93) { xp=xpdepart+(-22+timep)*modex;}
 
  if(timep>=168 && timep<186) { yp=ypdepart+(timep/2-168/2-9)*modey;}
 if(timep>95 && timep<168) { xp=xpdepart+(97+70-timep)*modex;}

 
 if((((y>yp+32 && y<yp+42)||(y>yp-32 && y<yp-22)) && x>xp && x<xp+70) && timep==0 && lock==true) {
 boutone2.anim(xp+5,yp-25,50,50);
 if(touche['e']==true  && lock==true) { if(arme==-1) {timep=1; door.play(); door.rewind();} else {textSize(15); fill(255); text("Comment pourrais-je ouvrir une porte scell\u00e9e...",xp-10,yp+100);}
 }}
 
 if((((y>yp+32+(10)*modey && y<yp+42+(10)*modey)||(y>yp-32+(10)*modey && y<yp-22+(10)*modey)) && x>xp+(-70)*modex && x<xp+70+(-70)*modex) && timep==93) {
   boutone2.anim(xp+5,yp-25,50,50);
 if(touche['e']==true  && lock==true && arme==-1) {timep=95; doori.play(); doori.rewind();}}
 }
 
 
  if(Sens==2) {
   portec[nombre] = new Collision(xp,yp,10,70);
  
 
 if(timep>0 && timep<20) { xp=xpdepart+(-timep/2-1)*modex;}
 if(timep>=20 && timep<93) { yp=ypdepart+(22-timep)*modey;}
 
  if(timep>=168 && timep<186) { xp=xpdepart+(timep/2-168/2-9)*modex;}
 if(timep>95 && timep<168) { yp=ypdepart+(-97-70+timep)*modey;}

 
 if(((x>xp+22 && x<xp+32)||(x>xp-22 && x<xp-12) && y>yp && y<yp+70) && timep==0) {
 boutone2.anim(xp,yp+25,50,50);
 if(touche['e']==true&& lock==true && arme==-1) {timep=1;}}
 
 if(((x>xp+22+70 && x<xp+32+70)||(x>xp-22+70 && x<xp-12+70) && y>yp+10 && y<yp+80) && timep==93 && touche['e']==true&& lock==true) {timep=95;}
 }
  
  
}
}

Rebondir[] tuyauxs1=new Rebondir[6];

 class Rebondir{
   float xcentre,ycentre;
   int timer=0;
   boolean sens=false;
   Rebondir() {
   }
   public void actif(int mode,float xcentre, float ycentre){
 if(mode==0) { image(coin[0],xcentre,ycentre,130,130); if(xboule>xcentre+35 && xboule<xcentre+45 && yboule>ycentre+55 && yboule<ycentre+75 && timer==0) { timer=1; sens=true;} 
                                                       if(xboule>xcentre+55 && xboule<xcentre+75 && yboule>ycentre+35 && yboule<ycentre+45 && timer==0) { timer=1; sens=false;} 
//rect(xcentre+40,ycentre+55,10,20); 
 if(timer>0) { dureT--; xboule=-100; yboule=-100; timer++;          if(timer==50 && mode==0 && sens==true) { timer=0; depX=0; depY=-1; xboule=xcentre+65; yboule=ycentre+35; }
                                                                    if(timer==50 && mode==0 && sens==false) { timer=0; depX=-1; depY=0; xboule=xcentre+35; yboule=ycentre+65; }
 }
 }
 
 if(mode==1) { image(coin[1],xcentre,ycentre,130,130); if(xboule>xcentre+35 && xboule<xcentre+45 && yboule>ycentre+55 && yboule<ycentre+75 && timer==0) { timer=1; sens=true;} 
                                                       if(xboule>xcentre+55 && xboule<xcentre+75 && yboule>ycentre+80 && yboule<ycentre+90 && timer==0) { timer=1; sens=false;} 
//fill(255,0,0,255); rect(xcentre+55,ycentre+80,20,10);
 if(timer>0) { dureT--; xboule=-100; yboule=-100; timer++;          if(timer==50 && mode==1 && sens==true) { timer=0; depX=0; depY=1; xboule=xcentre+65; yboule=ycentre+95; }
                                                                    if(timer==50 && mode==1 && sens==false) { timer=0; depX=-1; depY=0; xboule=xcentre+35; yboule=ycentre+65; }
 }
 }  
 
  if(mode==2) { image(coin[2],xcentre,ycentre,130,130); if(xboule>xcentre+80 && xboule<xcentre+90 && yboule>ycentre+55 && yboule<ycentre+75 && timer==0) { timer=1; sens=true;} 
                                                       if(xboule>xcentre+55 && xboule<xcentre+75 && yboule>ycentre+80 && yboule<ycentre+90 && timer==0) { timer=1; sens=false;} 
//fill(255,0,0,255); rect(xcentre+80,ycentre+55,10,20);
 if(timer>0) { dureT--; xboule=-100; yboule=-100; timer++;          if(timer==50 && mode==2 && sens==true) { timer=0; depX=0; depY=1; xboule=xcentre+65; yboule=ycentre+95; }
                                                                    if(timer==50 && mode==2 && sens==false) { timer=0; depX=1; depY=0; xboule=xcentre+95; yboule=ycentre+65; }
 }
 }  
 
 if(mode==3) { image(coin[3],xcentre,ycentre,130,130); if(xboule>xcentre+80 && xboule<xcentre+90 && yboule>ycentre+55 && yboule<ycentre+75 && timer==0) { timer=1; sens=true;} 
                                                       if(xboule>xcentre+55 && xboule<xcentre+75 && yboule>ycentre+35 && yboule<ycentre+45 && timer==0) { timer=1; sens=false;} 
//fill(255,0,0,255); rect(xcentre+80,ycentre+55,10,20);
 if(timer>0) { dureT--; xboule=-100; yboule=-100; timer++;          if(timer==50 && mode==3 && sens==true) { timer=0; depX=0; depY=-1; xboule=xcentre+65; yboule=ycentre+35; }
                                                                    if(timer==50 && mode==3 && sens==false) { timer=0; depX=1; depY=0; xboule=xcentre+95; yboule=ycentre+65; }
 }
 }  
 
 
 
 
 
 
 


 }

 
 public void fond(int mode,float xcentre, float ycentre){
   
if(mode==0) {  image(fondcoing,xcentre-42,ycentre,130,130); image(fondcoinh,xcentre,ycentre-42,130,130); }

if(mode==1) {  image(fondcoing,xcentre-42,ycentre,130,130); image(fondcoinb,xcentre,ycentre+42,130,130); }

if(mode==2) {  image(fondcoind,xcentre+42,ycentre,130,130); image(fondcoinb,xcentre,ycentre+42,130,130); }

if(mode==3) {  image(fondcoind,xcentre+42,ycentre,130,130); image(fondcoinh,xcentre,ycentre-42,130,130); }
   
 }
   

    

 }

Levier[] levier = new Levier[10];

class Levier{
  boolean activer=false;
  int  timelevier=0;
  Levier() {
  }
  
 public void actif(float xl,float yl) {
   
   
   if(timelevier==0) {  levierna.anim(xl,yl,120,120); if(x>xl+20 && x<xl+100 && y>yl+50 && y<yl+100) {boutone.anim(xl+35,yl,55,55); if(touche['e']==true) {timelevier=1; active=false; activel.index=0;  activel.compt=0; activelretour.index=0;  activelretour.compt=0;} } }
if(timelevier>0 && timelevier<120) {timelevier++; activel.anim(xl,yl,120,120);}
 if(timelevier==119) {active=true; x=xl+60; y=yl+75; activer=true;}
  if(timelevier==120)  {leviera.anim(xl,yl,120,120); if(x>xl+20 && x<xl+100 && y>yl+50 && y<yl+100) {boutone.anim(xl+35,yl,55,55); if(touche['e']==true) {timelevier=131; active=false;} } }
   if(timelevier>130 && timelevier<250) {timelevier++; activelretour.anim(xl,yl,120,120);}
   if(timelevier==250) {active=true; x=xl+60; y=yl+75; timelevier=0; activer=false;}
   
   if(timelevier==50||timelevier==180) {leviers.rewind();  leviers.play();
 }
   
   
 }
}

Bouton[] bouton = new Bouton[10]; 
class Bouton{
float xbouton,ybouton;
boolean appuyer;
Bouton(float xb,float yb) {
 xbouton=xb;
 ybouton=yb; 
}

public void bouton() {
  if(appuyer==false) { image(redb,xbouton,ybouton,50,50); } else { image(greenb,xbouton,ybouton,50,50); }
  
  if((xc>xbouton && xc<xbouton+50 && yc>ybouton && yc<ybouton+50 && cubepris==false)||(x>xbouton && x<xbouton+50 && y>-10+ybouton && y<ybouton+30)) {appuyer=true;} else{appuyer=false;} 
  
}
}


















public void stop() {
  minim.stop();
  super.stop();
 }

int timegateau=0;
int tempsreactiongateau=0;


public void emote() {
  
  
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

if(succes[1]==false && arme==1) { fill(255); textSize(15); text("Un g\u00e2teau que je ne peux pas attraper \u00e0 mains nues...",10,700);}
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
boolean[] noir = new boolean[10];
public void brouillard() {
  
  
 
  
  
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
   
   
   fill(255,255,0, timegateau*1.3f-201); textSize(40); text("Nouvelle Emote D\u00e9bloqu\u00e9e ! Touche[2] !",150,500);  fill(255); textSize(3);
   
 }
 if(timegateau>300 && timegateau<=500) {
 
 fill(255,255,0); textSize(40); text("Nouvelle Emote D\u00e9bloqu\u00e9e ! Touche[2] !",150,500);  fill(255); textSize(3);
 
 }

if(timegateau>200 && timegateau<600) {
   succesg.anims();
 }
 
 
  
 
 
  interraction();

}
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

public void code() {
  
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
text("Code : "+PApplet.parseChar(code[0])+" "+PApplet.parseChar(code[1])+" "+PApplet.parseChar(code[2])+" "+PApplet.parseChar(code[3]),400,500);

if(keyCode!=8) {

if(touche[key]==true && retour==true && numerocode==0) {retour=false; code[0]=PApplet.parseInt(key); numerocode++;}
if(touche[key]==true && retour==true && numerocode==1) {retour=false; code[1]=PApplet.parseInt(key); numerocode++;}
if(touche[key]==true && retour==true && numerocode==2) {retour=false; code[2]=PApplet.parseInt(key); numerocode++;}
if(touche[key]==true && retour==true && numerocode==3) {retour=false; code[3]=PApplet.parseInt(key); numerocode++;}}

else {
 if(numerocode>0 && effacer==true && numerocode<4) {
  code[numerocode]=0;
  numerocode--;
  effacer=false;
 } 
  
}

if(numerocode==4) {
if(PApplet.parseChar(code[0])=='3' && PApplet.parseChar(code[1])=='='&& PApplet.parseChar(code[2])=='=' && PApplet.parseChar(code[3])=='D') { changementarme=true; changementcouleur=true; fusil=true;}
if(PApplet.parseChar(code[0])=='d' && PApplet.parseChar(code[1])=='a'&& PApplet.parseChar(code[2])=='b' && PApplet.parseChar(code[3])=='s' && daba==false) { daba=true; succes[0]=true; succes[2]=true; }
if(code[0]==47 && code[1]==47 && code[2]==92 && code[3]==92) { fly=true; }
if(code[0]==92 && code[1]==92 && code[2]==47 && code[3]==47) { fly=false; }
if(PApplet.parseChar(code[0])=='6' && PApplet.parseChar(code[1])=='6'&& PApplet.parseChar(code[2])=='6' && PApplet.parseChar(code[3])=='6') { salle=10;}
if(PApplet.parseChar(code[0])=='|' && PApplet.parseChar(code[1])=='['&& PApplet.parseChar(code[2])==']' && PApplet.parseChar(code[3])=='|') { levier[0].activer=true;}
if(PApplet.parseChar(code[0])=='c' && PApplet.parseChar(code[1])=='u'&& PApplet.parseChar(code[2])=='b' && PApplet.parseChar(code[3])=='e') { xc=x; yc=y; sallecube=salle;}
if(PApplet.parseChar(code[0])=='e' && PApplet.parseChar(code[1])=='n'&& PApplet.parseChar(code[2])=='d' && PApplet.parseChar(code[3])=='s') { fin=true;}
//if(char(code[0])=='l' && char(code[1])=='i'&& char(code[2])=='f' && char(code[3])=='e' && choisirendroit==0) { Vie=true; choisirendroit=1; menupause=false;}


  
  
} 
  
  

  
  
  
}
public void collision() {
  
  //HITBOX EN X
  
  if((xboule>=1000 && xboule <=1004 && depX>0) || (depX<0 && xboule<=0 && xboule>=-4 )

// Mur Debut




// Rectangle rouge 180,180,20,50

|| (depX<0 && xboule <=210 && xboule >=206 && yboule>=180 && yboule<=230)
|| (depX>0 && xboule >=170 && xboule <=174 && yboule>=180 && yboule<=230)







)

{depX=-depX;}
  
  
  
  
  
  
  
  
  
  //HITBOX EN Y
  
   if((yboule>=800 && yboule<=804 && depY>0) || (yboule<=0 && yboule>=-4 && depY<0)
 
 //rectange rouge 180 y et 50 largeur
 
|| (depY<0 && yboule <=240 && yboule >=236 && xboule>=170 && xboule<=210)
|| (depY>0 && yboule >=170 && yboule <=174 && xboule>=170 && xboule<=210)
 
 
 
 
 
 
 
 
 
) 
 {depY=-depY;}
  
  
  
  
  
}
int timearme1=0;
int timearme2=0;
int timearme3=0;

public void histoire() {
  
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
int tempsdebut;

public void guidedebut() {
  msg1.lance();
  if(msg1.timerm>800) {
   msgp1.lance(); 
  }
  if(msg1.timerm>1600) {
   msg2.lance();
  }
  if(msg1.timerm>2400) {
   msgp2.lance();
  }
  if(msg1.timerm>3200) {
   msg3.lance();
  }
  if(msg1.timerm>4000) {
   msgp3.lance();
  }
  if(msg1.timerm>4800) {
   msg4.lance();
  }
  if(msg1.timerm>5600) {
   msgp4.lance();
  }
  if(msg1.timerm>6400) {
   msg5.lance();
  }
  if(msg1.timerm>8000) {
   msg1.timerm=-2;
   active=true;
   tempsdebut=1;
  }
  
  
  if(tempsdebut>0) {
    tempsdebut++;
    active=false;
    fleche.anim(270,700,80,80);
  }
  if(tempsdebut>200) {
   active=true;
  tempsdebut=0; 
  }
}

public void guide2() {
  msg11.lance();
  if(msg11.timerm>1000) {
   msg12.lance(); 
  }
  if(msg11.timerm>2000) {
   msg13.lance(); 
  }
  if(msg11.timerm>3000) {
   msg14.lance(); 
  }
  if(msg11.timerm>4000) {
   msg15.lance(); 
  }
  if(msg11.timerm>5500) {
   msgp5.lance(); 
  }
  if(msg11.timerm>7000) {
   msg16.lance(); 
  }
  if(msg11.timerm>9300) {
    msg11.timerm=-2;
   active=true;
   timearme1=301;
  }

}



public void guide3() {
  msg21.lance();
  if(msg21.timerm>1000) {
   msg22.lance(); 
  }
  if(msg21.timerm>2500) {
    msg21.timerm=-2;
   active=true;
   timearme2=501;
  }

}

public void guide4() {
  msg31.lance();
  if(msg31.timerm>1100) {
   msg32.lance(); 
  }
  if(msg31.timerm>2200) {
   msg33.lance();
}
if(msg31.timerm>3300) {
   msg34.lance();
}
if(msg31.timerm>4400) {
   msg35.lance();
}
if(msg31.timerm>5500) {
   msgp6.lance();
}

if(msg31.timerm>7000) {
   msg31.timerm=-2;
   active=true;
   timearme3=501;
}
}


public void guide5() {
  msg41.lance();
  if(msg41.timerm>1100) {
   msg42.lance(); 
  }
  if(msg41.timerm>2200) {
   msg43.lance();
}
if(msg41.timerm>3300) {
   msg44.lance();
}
if(msg41.timerm>4400) {
   msg45.lance();
}
if(msg41.timerm>5500) {
   msgp7.lance();
}

if(msg41.timerm>7000) {
   msg41.timerm=-2;
   active=true;
   declancheur=-1;
}
}





//1er dialogue

Message msg1,msg2,msg3,msg4,msgp1,msgp2,msgp3,msgp4,msg5;

//2 eme dialogue

Message msg11,msg12,msg13,msg14,msg15,msg16,msgp5;

//3 eme dialogue

Message msg21,msg22;

//4 eme dialogue

Message msg31,msg32,msg33,msg34,msg35,msgp6;

//5 eme dialogue

Message msg41,msg42,msg43,msg44,msg45,msgp7;

class Message {
char[] charmsg1;
float timerm=0; 
boolean personnage,debutv,dejafait;
float emplacementx,emplacementy,vitesse;


Message(String message1,float emplx,float emply,boolean perso,boolean debut, boolean fait, float vit){
personnage=perso;
emplacementx=emplx;
emplacementy=emply;
charmsg1 = new char[message1.length()];
for (int i = 0; i < message1.length(); i++) {
      charmsg1[i] = message1.charAt(i);
      println(charmsg1[i]);
  
}
debutv=debut;
dejafait=fait;
vitesse=vit;
}



public void lance() {


 if(timerm>-1) {  
  active=false;
timerm=timerm+4*vitesse;

 
 if(debutv==false) {
 fill(20,150);
rect(0,0,1000,800);

fill(255,timerm);
rect(200,200,600,450);
fill(255,timerm/2);
for(int i=0;i<50;i++) {rect(random(100,150),random(100,650),100,100); rect(random(750,800),random(100,650),100,100);  rect(random(100,800),random(100,150),100,100); rect(random(100,800),random(600,650),100,100);}
fill(200);
if(mouseX>900 && mouseX<970 && mouseY>0 && mouseY<50) { fill(255,0,0);  if(mousePressed==true) {timerm=100000; reactive2=false;}}
textSize(50);
text("SKIP",900,50);
 }


 
if(timerm>300) { 

  
tint(255,timerm-300);
if(dejafait==false) {
if(personnage==false) {
image(qui,emplacementx,emplacementy,300,300);}
else {image(moi,emplacementx,emplacementy,300,300);}
}


textSize(25);
for(int i=0;i<charmsg1.length;i++) {
fill(0,timerm-600-10*i);
if(timerm>2000/vitesse) { fill(0,2200-timerm*vitesse);}
if(personnage==false) {text(charmsg1[i],emplacementx+260+i*10,emplacementy+170);}
if(personnage==true) {text(charmsg1[i],emplacementx-400+i*10,emplacementy+170);}

}



}
fill(255,timerm/2);
tint(255,255);
}


}

}



  
  
  

int perlimpimpin;
PImage byegro;
public void interraction() {
  
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
float depX=0;
float depY=0;

boolean couleurorange=false;
boolean reactive2=false;



public void fusilactif() {
 
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
 //pendant la dur\u00e9 du missile
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
 
 
  if(dureT>250) {jauge=jauge+0.25f;}
  
  //Arme
  
  if(arme==1.0f) {if(couleurorange==false) {tint(141,0,230);} else { tint(255,130,30);} image(armeboule,x+20,y+20,50,35); noTint();}
  if(arme==-1.0f) {image(armesecondaire,x+15,y+19,50,38);}
 
  fill(255,255,255,50); strokeWeight(3); stroke(0,255,0); rect(x-12.5f,y+40,25,25); fill(0,250,0,50); rect(x-12.5f,y+65,25,-jauge); strokeWeight(1); noStroke();
  
  

  
  
}
boolean doubleboutons1=false;
int timefinol=0;
int aide;
boolean ascenseuro=false;
public void murdessalles() {
  
    
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
 
  
//laser a d\u00e9sactiv\u00e9 :
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
  text("Je crois que j'ai loup\u00e9 quelque chose",x-100,y-100);
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
  



int mili;
int seconde;
int minute;

public void timer() {
  mili++;
 
  if(mili==60) {
   mili=0;
  seconde++; 
  }
  if(seconde==60) {
   seconde=0;
  minute++; 
    
  }
  
  
  
}

public void tuyaux() {
  if(salle==1) 
{   tuyauxs1[0].actif(modeT[0],350,100); 
    tuyauxs1[1].actif(modeT[1],350,300);
    
    tuyauxs1[2].actif(modeT[2],820,250);
    tuyauxs1[3].actif(modeT[3],820,450);
    tuyauxs1[4].actif(modeT[4],510,450);
    tuyauxs1[5].actif(modeT[5],820,650);



}
  
  
  
  
  
  
}
int courir=1;
float versx=0;
float versy=0;
float depxp,depyp;
int timevers;
int meurtlaser=0;
public void perso() {
//mort dans le vide
  if(meurtvide<0) { meurtvide=0; active=true;}
 if(meurtvide>0) { if(meurtvide==1) {active=false;} meurtvide++;  if(meurtvide<20) {tombemort.anim(x-60,y-60,120,120);} 

 if(meurtvide<100 && meurtvide>=20) {tombemort.anim(x-80+meurtvide/2,y-80+meurtvide/2,140-meurtvide,140-meurtvide);} 

  if(meurtvide==100) { Vie=false;}  }
   
//mort dans un laser
 if(meurtlaser>0 && meurtlaser<100) { if(meurtlaser==1) {active=false; mortelec.index=0;} meurtlaser++; mortelec.anim(x-60,y-60,120,120);}
//voir en bas du void draw pour l'image apres la mort

  if (active==true) {
  
    //d\u00e9placement avec la souris
    
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
    
    //fin du d\u00e9placement souris
    
      //Courir
  
     if(touche[' ']==true) {courir=2;} else {courir=1;}
    
     if(touche['&']==true && timeemote == 0 && succes[0]==true) {dab.rewind();   dab.play(); 
   emote[0]=true; timeemote=1; active=false;}
     if(touche['\u00e9']==true && timeemote == 0 && succes[1]==true) { emote[1]=true; timeemote=1; active=false; sonportal.rewind();  sonportal.play();
   }
     if(touche['"']==true && timeemote == 0 && succes[2]==true) { emote[2]=true; timeemote=1; active=false; saiyan.rewind();  saiyan.play();
   }
     if(PApplet.parseInt(key)==39 && timeemote == 0 && retour==true) { emote[3]=true; timeemote=1; active=false; }
    
    
    
    
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
PImage title;
PImage back;
PImage sprite;
PImage devant2;
PImage droites2;

int timedebut;
int ybouledebut;
int xbouledebut;
int timesprite;


public void debut() {
  background(0);
  timedebut++;
  
  if(timedebut<=158) {xbouledebut=xbouledebut+5;}
  if(timedebut>158) {menu2=0;}
  imageMode(CENTER);
//image(title,width/2,height/5,700,150);
  bouled.anim(xbouledebut,120,100,100);
  
}


public void menu () {
  

 
 //if(menu=
  
  imageMode(CORNER);
  image(back,0,0,width,height);
  music2();
  recta();
  
  dab();
}
  
  int timemenu;

public void dab () {

timesprite++;
timemenu++;



if (timemenu<50) {image(devant2,sidex,sidey,1000,1000);}
if (timemenu>=50) {image(droites2,sidex,sidey,1000,1000);}
if (timemenu>=100) {timemenu=0;}

if (timesprite<50) {sidey=sidey-5;}
if (timesprite>250) {sidex=sidex+25;}
if (timesprite>=500) {sidey=1050; sidex=random(100,1000); timesprite=0;}
}

public void music2 () {
  
  musicmenu.play();
}

  public void recta ()
{

fill(0,0,0,200);
  rect(0,0,1000,800);
 fill(255,0,0);
  point(width/2+250,400);
  fill(67,159,255);
  
    {
  strokeWeight(5);
      textSize(width/30);
    stroke(67,159,255); 
  }
fill(0,0,0,100);
rectMode(CENTER);
  rect(width/2,height/2,width/2,height/7);
  fill(67,159,255);
  text("      Lancer la partie",width/2.7f,height/1.95f);
  fill(67,159,255);
 

  textSize(width/50);
  text("Copyright \u00a9 : 49534E Production",width/1.55f,height/1.05f);
  
  rectMode(CORNER);
  
  
  imageMode(CENTER);
image(title,width/2,height/5,700,150); 
bouled.anim(790,120,100,100);
  
  if(mousePressed == true && mouseX >= width/2-250 && mouseX <= width/2+250 && mouseY >= height/2-71 && mouseY <= height/2+71) {
    

  strokeWeight(1); imageMode(CORNER); noStroke(); musicmenu.close(); menu2=1;

  }
}
   
public void music() {
  
  if(timemusic>=0) 
    {
      timemusic++; 
      if(timemusic==3000) 
          {timemusic=0;
           }   
       if(timemusic==1)   
          {music=true;
          music3.rewind(); music3.play(); 
           }    
     }

  
}
float xc,yc;
boolean cubepris=false;
boolean cubeboule=false;
int sallecube=0;

public void cube() {
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
float timecredit;
float yf=-1080;
float xf=0;
int yph=20;
int ypb=270;
public void credit() {
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
text("Une cr\u00e9ation de :",width/2-180,-100+timecredit*2-2000);
text("SYROTNIK Adrien",30,-100+timecredit*2-2150);
text("JORIS Arthur",width-400,-100+timecredit*2-2300);

text("Remerciements \u00e0 :",width/2-208,-100+timecredit*2-3300);
textSize(50);
text("Bilal Scouris - Testeur / Id\u00e9es",width/2-210,-100+timecredit*2-3500);
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--full-screen", "--bgcolor=#666666", "--hide-stop", "Emergency_Exit" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
