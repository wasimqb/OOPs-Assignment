import java.util.*;
import java.io.*;

public class aggregation{
  public static void main(String args[]){
    shapes s1 = new shapes(5,2);
    shapes s2 = new shapes(3,2);
    rectangleArea r = new rectangleArea(s1);
    triangleArea t = new triangleArea(s2);
    Print p = new Print();
    p.print(r);
    p.print(t);
  }
}

class shapes{
  int x, y, a;
  shapes(int x, int y){
  this.x=x;
  this.y=y;
  }
}
class rectangleArea{
  int l, b, a;
  rectangleArea(shapes s)
  {
    l = s.x;
    b = s.y;
    a = l * b;
  }
}

class triangleArea{
  int b, h, a;
  triangleArea(shapes s){
    b=s.x;
    h=s.y;
    a = (b*h)/2;
  }
}

class Print{
  public void print(rectangleArea r){
    System.out.println("Rectangle has area = " + r.a);
  }
  public void print(triangleArea t){
    System.out.println("Triangle has area = " + t.a);
  }
}
