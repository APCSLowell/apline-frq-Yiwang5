public class APLine
{
  private int a,b,c;
  
  public APLine(num1, num2, num3){
  a = num1;
  b = num2;
  c = num3;
  }
  public double getSlope(){
  double temp = (double) -a/b;
  return temp;
  }

  public Boolean isOnline(x,y){
  boolean temp = (a*x) + (a*y) + c == 0;
  return temp;
  }
}
