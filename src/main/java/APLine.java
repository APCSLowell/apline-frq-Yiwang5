public class APLine
{
  private int a,b,c;
  
  public APLine(int num1,int num2,int num3){
  a = num1;
  b = num2;
  c = num3;
    
  }
  public double getSlope(){
  double temp = (double) -a/b;
  return temp;
  }

  public Boolean isOnLine(int x, int y){
  return (a * x + b * y + c) == 0;
  
  }
}
