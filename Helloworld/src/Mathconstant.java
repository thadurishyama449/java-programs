// VARIABLES in Interface — always: public static final
interface MathConstants {
    double PI = 3.14159;        // Same as: public static final double PI
    int MAX_LIMIT = 100;        // Automatically constant — can't change!
    
    // ❌ ERROR: Can't do this inside interface:
    // int x = 10;  x = 20;    // Reassignment not allowed!
}

// EXTENDING Interface — interface can extend other interface(s)
interface Shape3 {
    double area();
    double perimeter();
}

interface ColoredShape3 extends Shape3 {  // Inherits area() & perimeter()
    String getColor();
    void setColor(String color);
}

// Class implements the extended interface — must implement ALL methods
class ColoredCircle implements ColoredShape3 {
    double radius;
    String color;
    
    @Override public double area()       { return Math.PI * radius * radius; }
    @Override public double perimeter()  { return 2 * Math.PI * radius; }
    @Override public String getColor()   { return color; }
    @Override public void setColor(String c) { this.color = c; }
}

// Interface can extend MULTIPLE interfaces (unlike class!)
interface AdvancedShape extends Shape3, Drawable, Comparable<AdvancedShape3> {
    void transform(int angle);
}