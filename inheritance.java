import java.io.*;
import java.util.*;

public class inheritance{
  public static void main(String args[]){
    rectangle r1 = new rectangle(5,2);
    traingle t1 = new traingle(3,2);
    Print p = new Print();
    int ar = r1.shapeArea();
    int at = t1.shapeArea();
    p.print(ar);
    p.print(at);
  }
}

class shapes{
  int x, y;
    shapes(int x, int y){
    this.x=x;
    this.y=y;
  }
  public int shapeArea(){
    return 0;
  }
}

class rectangle extends shapes{
  rectangle(int x, int y)
  {
    super(x,y);
  }
  public int shapeArea(){
    int area = x*y;
    return area;
  }
}

class traingle extends shapes{
  traingle(int x, int y){
    super(x,y);
  }
  public int shapeArea(){
    int area = 1/2*x*y;
    return area;
  }
}

class Print{
  public void print(int a){
    System.out.println("Area is " + a);
  }
}
