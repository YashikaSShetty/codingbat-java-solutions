public boolean cigarParty(int cigars, boolean isWeekend) {
if(isWeekend)
{
return 40<=cigars;
}
else{
  if((40<=cigars)&&(cigars<=60))
 {
  return true;
 }
 else{
 return false;
}
}
}