import java.io.*;
public class Hexagon implements Shape {
  private int sides;
  private int length;
  private String color;
  
    /**
   * Constructor for objects of class Circle
   */
  public Hexagon(int sides) {
    this.sides = sides;
    this.color = color;
  }
    /**
   * Get the perimeter
   * 
   * @return     returns the perimeter of the circle
   */
  public double getPerimeter() {
    return 6 * this.sides;
  }
   /**
   * Get the color
   * 
   * @return     returns the color of the circle
    */
  public String getColor()
  {
      return this.color;
  }
  /**
   * Get the area
   * 
   * @return     returns the area of the circle
   */
  public double getArea() {
    return ((3 * Math.sqrt(3) * (sides * sides)) / 2);
  }
}