public class Findmax {
public void max(int maxarr[]){
int firstmax= 0;
int secondmax = 0;
for(  int i =0 ; i<maxarr.length();i++)
{
  if(firstmax < maxarr[i]){
    secondmax = firstmax;
    firstmax = maxarr[i];
  } else if (secondmax < a[i]) {
   secondmax = a[i];
}
}
System.out.println(firstmax);
System.out.println(secondmax);
}

public static void main (String args []) {
int maxarr [] = {1,2,3,4,5,6,7,8,9,10};
Findmax f1 = new Findmax();
f1.max(maxarr);
}
