//Librairie son
import ddf.minim.*;
import ddf.minim.analysis.*;
import ddf.minim.effects.*;
import ddf.minim.signals.*;
import ddf.minim.spi.*;
import ddf.minim.ugens.*;
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

void setup() {
  //Crédit
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
 //Image décor
 table1 = loadImage("table.png");
 gateau = loadImage("gateau.png");
 panneau = loadImage("panneau.png");
  
 //Image succès
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

 
 //Image récupération arme et diamant
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
 
 //Image flèche déplacement
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

// (Sens 1 : Horizontal, 2 : Vertical // direction en x 1 ou -1 // idem mais pr y // Coordonnées x // Coordonnées y // numéro de la porte)
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

//Message / x / y / image --> false : mystère ; true : perso / Commencement à 0 : false / à 1000 : true / vitesse 1 de base 
 msg1=new Message("Bonsoir.",100,80,false,false,false,1.1);
 msgp1= new Message("Où est-ce que je suis ?",600,280,true,true,false,1.1);
 msg2=new Message("Vous êtes dans mon centre de recherche.",100,80,false,true,true,1.1);
 msgp2=new Message("Quoi ?! Faites moi sortir d'ici !",600,280,true,true,true,1.1);
 msg3=new Message("Du calme... Je ne compte pas te garder ici.",100,80,false,true,true,1.1);
 msgp3=new Message("Comment ça ???",600,280,true,true,true,1.1);
 msg4=new Message("Va prendre l'arme au sol, je t'expliquerai...",100,80,false,true,true,1.1);
 msgp4=new Message("Une arme ? Attendez !",600,280,true,true,true,1.1);
 msg5=new Message("Ah oui, utilise Z,Q,S,D pour te déplacer.",100,80,false,true,true,1.1);
 
 msg11=new Message("Bien, le sujet réagit normalement, on peut continuer.",100,80,false,false,false,1.3);
 msg12=new Message("Cet arme vous permet de vous téléporter.",100,80,false,true,true,1.3);
 msg13=new Message("Visez, clic gauche, recliquez et voilà.",100,80,false,true,true,1.3);
 msg14=new Message("Passez la barrière électrique. Mais attention !",100,80,false,true,true,1.3); 
 msg15=new Message("N'essayez pas de la toucher...",100,80,false,true,true,1);
 msgp5= new Message("Je ne comprend rien...",600,280,true,true,false,1);
 msg16=new Message("Il n'y a rien à comprendre. Continuez.",100,80,false,true,true,1);
 
 msg21=new Message("Utilise la molette pour changer d'arme.",100,80,false,false,false,1.3);
 msg22=new Message("Em main, tu pourras activer certaines choses.",100,80,false,true,true,1.3);
 
 msg31=new Message("Voici une amélioration : clic droit.",100,80,false,false,false,1.2);
 msg32=new Message("Tu ne pourras plus te téléporter...",100,80,false,true,true,1.2);
 msg33=new Message("Mais tu pourras téléporter le cube ! De plus,",100,80,false,true,true,1.2);
 msg34=new Message("la boule pourra traverser les murs de sa couleur.",100,80,false,true,true,1.2);
 msg35=new Message("N'hésite pas à changer lorsqu'elle est lancée.",100,80,false,true,true,1.2);
 msgp6= new Message("Ça commence à devenir compliqué...",600,280,true,true,false,1.1);
 
 msg41=new Message("Dans cette salle il y aura des tuyaux.",100,80,false,false,false,1.2);
 msg42=new Message("La boule entre par un côté, et ressort de l'autre.",100,80,false,true,true,1.2);
 msg43=new Message("Vise le point noir au milieu et tire.",100,80,false,true,true,1.2);
 msg44=new Message("Attention néanmoins aux barrières rouges...",100,80,false,true,true,1.2);
 msg45=new Message("La boule n'apprécie guère ce genre de choses.",100,80,false,true,true,1.2);
 msgp7= new Message("Tirer sur le point noir hein ? ok...",600,280,true,true,false,1.1);
 
 
}



void draw() {
  
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
 
   //déclanche le 2 eme dialogue
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



void keyPressed() {
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


void keyReleased() {
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

void mouseReleased() {
 if(reactive==false && dureT>0) {reactive=true; }
if(reactive2==false) { reactive2=true;}
}

void mouseWheel(MouseEvent event) {
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
  void anim(float x, float y, float tx, float ty){
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
  void affichage(int r, int g, int b){
   fill(r,g,b);   rect(x1,y1,x2,y2);
}

void collisionboule(){
    
    
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


void collisionperso() {
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
void meurtv(){
if(fly==false) {
 if((dureT < 251 || dureT > 255) && x>=x1-2 && x<=x1+x2+2 && y >= y1-22 && y<=y1+y2+2 && meurtvide==0) { meurtvide=1; morts++;}
 if(dureT > 255 && xc>=x1-2 && xc<=x1+x2+2 && yc >= y1-22 && yc<=y1+y2+2 && meurtvide==0 && salle==sallecube)  {sallecube=0; xc=900; yc=40;}
}
}



void laserboule(){
    
    
    
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
  void anims(){
    
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
void on(boolean lock){
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
 if(touche['e']==true  && lock==true) { if(arme==-1) {timep=1; door.play(); door.rewind();} else {textSize(15); fill(255); text("Comment pourrais-je ouvrir une porte scellée...",xp-10,yp+100);}
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
   void actif(int mode,float xcentre, float ycentre){
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

 
 void fond(int mode,float xcentre, float ycentre){
   
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
  
 void actif(float xl,float yl) {
   
   
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

void bouton() {
  if(appuyer==false) { image(redb,xbouton,ybouton,50,50); } else { image(greenb,xbouton,ybouton,50,50); }
  
  if((xc>xbouton && xc<xbouton+50 && yc>ybouton && yc<ybouton+50 && cubepris==false)||(x>xbouton && x<xbouton+50 && y>-10+ybouton && y<ybouton+30)) {appuyer=true;} else{appuyer=false;} 
  
}
}


















void stop() {
  minim.stop();
  super.stop();
 }

