void collision() {
  
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
