

public static void main (String args[]){

int count=0;
File f = new File("c://niti");
String [] S = f.list();
for(String S1 ; S){
\\ here we create an object f1 of file type bcos isFile() method is not directly availabl on String S1
\\ also we specify dir location f where the file could be present from where the strings are extracted
 File f1 = new File(f,S1); 
 if(f1.isFile()){
  count++;
  System.out.println(S1);
 }
 System.out.println(Count);
}
}
