

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





}