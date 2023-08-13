class solution{
public int accountBalanceAfterPurchase(int p){
    if(p%10==0){
return 100-p;
}
else{
int r = p%10;
int k = p/10;
if(r>0  && r<5){
return 100-(k*10);
}
else{
return 100-((k+1)*10);
}
}
}
}
