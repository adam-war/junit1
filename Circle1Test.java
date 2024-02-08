
/***
* Example JUnit testing class for Circle1 (and Circle)
***/

// Import all assertions and all annotations
// - see docs for lists and descriptions
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Circle1Test
{
   // Data you need for each test case
   private Circle1 circle1;

// 
// Stuff you want to do before each test case
//
@BeforeEach
public void setup()
{
   System.out.println("\nTest starting...");
   circle1 = new Circle1(1,2,3);
}

//
// Stuff you want to do after each test case
//
@AfterEach
public void teardown()
{
   System.out.println("\nTest finished.");
}

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
   Circle1 p = circle1;
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
   Circle1 p = circle1;
   System.out.println("Running test negativeScale.");
   p.scale(0.5);
   assertTrue(p.radius == 1.5);
}

//
// Test intersection for intersecting circles
//
@Test
public void intersectionTrue()
{
   Circle1 circle2 = new Circle1(0, 1, 4);
   System.out.println("Running test true intersection");
   assertTrue(circle1.intersects(circle2));
}



}

