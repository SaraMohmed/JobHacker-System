public class Rectangle {

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double width = 1;
    double height = 1;

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
        return width * height;
    }

    public double getPerimeter(){
        return width + height;
    }

}
