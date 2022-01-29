int mili;
int seconde;
int minute;

void timer() {
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
