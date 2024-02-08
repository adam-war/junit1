

// Import all assertions and all annotations
// - see docs for lists and descriptions
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class Circle2Test 
{

private Circle2 circle1;
private Circle2 circle2;


@BeforeEach
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle2(1,2,3);
   circle2 = new Circle2(-1, 1, 4);
}

@AfterEach
public void teardown()
{
   System.out.println("\nTest finished.");
}

// Tests begin here:

//
// Test a simple positive move
//
@Test
public void simpleMove()
{
   Point p;
   System.out.println("Running test simpleMove.");
   p = circle1.moveBy(1,1);
   assertTrue(p.x == 2 && p.y == 3);
}

// 
// Test a simple negative move
//
@Test
public void simpleMoveNeg()
{
   Point p;
   System.out.println("Running test simpleMoveNeg.");
   p = circle1.moveBy(-1,-1);
   assertTrue(p.x == 0 && p.y == 1);
}

//
// Test a more complex move
//
@Test
public void largeMove()
{
   Point p;
   System.out.println("Running test largeMove.");
   p = circle1.moveBy(1,5);
   assertTrue(p.x == 2 && p.y == 7);
}

//
// Test a simple scale
//
@Test
public void simpleScale()
{
   Circle2 p = circle1;
   System.out.println("Running test simpleScale.");
   p.scale(2.0);
   assertTrue(p.radius == 6);
}

//
// Test a negative scale factor
//
@Test
public void negativeScale()
{
   Circle2 p = circle1;
   System.out.println("Running test negativeScale.");
   p.scale(0.5);
   assertTrue(p.radius == 1.5);
}




}