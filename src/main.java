/**
 * My words and actions will reflect Academic Integrity. 
 * I will not cheat or lie or steal in academic matters. 
 * I will promote integrity in the UNCG community.
 * Austin Gain  02/01/2022
 */

/*
Rectangle
Austin Gain
CSC 230, Sec. 3
*/

public class main {

    public static void main(String[] args) {
        System.out.println("""
                           Rectangle
                           Austin Gain
                           CSC 230, Sec 3\n
                           This program creates and uses a class called Rectangle.
                           The Rectangle class has one constructor and 5 other methods.
                           The setLength() method will set the length to 2.5.
                           The setWidth() method will set the width to 5.2.
                           The getLength() method will return the length.
                           The getWidth() method will return the width of the rectangle.
                           The getArea() method will return the length * width.
                           """);
        Rectangle newRectangle = new Rectangle();
        newRectangle.setLength(2.5);
        newRectangle.setWidth(5.2);
        System.out.printf("The rectangle's length is %.1f\n", newRectangle.getLength());
        System.out.printf("The rectangle's width is %.1f\n", newRectangle.getWidth());
        System.out.printf("The rectangle's area is %.1f\n", newRectangle.getArea());   
    }
    
}
