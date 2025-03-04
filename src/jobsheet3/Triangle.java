package jobsheet3;

public class Triangle {
   public int base;
   public int height;

    public Triangle(int a, int t){
         base = a;
         height = t;
    }

    int countArea(int b, int h){
        base = b;
        height = h;
        return b * h /2;
    }

    double countPerimeter(int b, int h){
        base = b;
        height = h;
        double hypotenuse = Math.sqrt(Math.pow(b,2) + Math.pow(h,2));
        return base + height + hypotenuse;
    }
}
