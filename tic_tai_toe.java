import java.util.*;
public class tic_tai_toe{
static Scanner sc = new Scanner(System.in);
public static void main(String[] args) {

int a[]=new int[9];
Arrays.fill(a,-1);
System.out.print("Enter user 1 name : ");
String user1 =sc.nextLine();

System.out.print("Enter user 2 name : ");
String user2 =sc.nextLine();
System.out.println("User only can enter Integer from gvien matix\n");
String user ="";
while(true){
    int c=0; for(int x:a) if(x==-1) c++;

  prnt(a);
  if(won(a,user1,user2) || c==0)
  { System.out.println("Game over !");
  break;  
   }

  System.out.println("For "+user1+": X");
  System.out.println("For "+user2+": O");
  
  user=user.compareTo(user1)!=0?user1:user2;
  int val=10;
  do{
    System.out.print("Enter "+user+": ");
     val =sc.nextInt();
  }while(val>=9);
  a[val]=user.compareTo(user1)!=0?0:1;
  
}






  }







public static void prnt(int ar[]){
int n=ar.length;

for(int i=0;i<n;i++){
   char c=(char)(i+(int)'0');
   if(ar[i]==0)
     c='O';
   if(ar[i]==1)
    c='X'; 

System.out.print(" "+c+" "+" | ");    

if(i==2 || i==5)
  System.out.println("\n-----------------");

}
System.out.println();
}

static Boolean won(int a[],String user1,String user2){
int n=a.length; 

// System.out.println(a.toString());

for(int i=0;i<n;i+=3){
    if( a[i]!=-1 && a[i]==a[i+1] && a[i+1]==a[i+2])
     { 
        if(a[i]==1) System.out.println(user1+" won the match !");
        else System.out.println(user2+" won the match !");
        return true;
     }    
     
    
}

for(int i=0;i<3;i++){
    if(a[i]!=-1 && a[i]==a[i+3] && a[i+3]==a[i+6])
    { 
        if(a[i]==1) System.out.println(user1+" won the match !");
        else System.out.println(user2+" won the match !");
        return true;
     }    
    }


if(a[0]!=-1 && a[0]==a[4] && a[4]==a[8])
 { 
        if(a[0]==1) System.out.println(user1+" won the match !");
        else System.out.println(user2+" won the match !");
        return true;
     }    
    
if(a[2]!=-1 && a[2]==a[4] && a[4]==a[6])
{ 
    if(a[2]==1) System.out.println(user1+" won the match !");
    else System.out.println(user2+" won the match !");
    return true;
 }    

    return false;
}



}