void music() {
  
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
