import java.util.*;
import java.io.*;

public class composition{
  public static void main(String args[]){
    int n,i;
    int[] x = new int[10];
    int[] y = new int[10];
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the no: of shapes");
    n = in.nextInt();
    for(i=0;i<n;i++)
    {
      System.out.println("Enter the value of shape " + i );
      x[i] = in.nextInt();
      y[i] = in.nextInt();
    }
    ArrayList<shapes> s = new ArrayList<>();
    for(i=0;i<n;i++)
      s.add(new shapes(x[i],y[i]));
    for(i=0;i<n;i++){
      System.out.println("Area of shape "+ i +" "+s.get(i).a.ar);
  }
}
}

class shapes{
  int x, y;
  Area a;
  shapes(int x, int y){
    this.x=x;
    this.y=y;
    a = new Area(x,y);
  }
}

class Area{
  int ar;
  Area(int a, int b)
  {
    ar = a*b;
  }

}
