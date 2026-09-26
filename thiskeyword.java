class Box {
 
    int height;
    int width;
    int length;

    // Constructor 1
    Box(int height, int width, int length) {
     this.height = height;
        this.width = width;
        this.length = length;
    }

    // Constructor 2
    Box(int d) {
       height = d;
        width = d;
        length = d;
    }

    void disp() {
        System.out.println(height + " " + width + " " + length);
    }
}

public class thiskeyword {
    public static void main(String[] chaitan) {

        Box b = new Box(5, 7, 8);
        Box a = new Box(15);
        a.disp();

        b.disp();
    }

}