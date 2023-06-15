package week4;

public class Rectangle {

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

   public  double width = 1;
    public  double height = 1;

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
    public double getWidth() {
        return width;
    }

    public double getArea(){

        double Area = width * height;
        return Area;
    }

    public double getPerimeter(){

        double Perimeter = 2 * (width + height);
        return Perimeter;
    }

}
