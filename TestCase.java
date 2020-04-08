import org.junit.Test;
import static org.junit.Assert.assertTrue;
import java.util.*;

public class TestCase {
  private boolean compare(List<Integer[]> triplets1, List<Integer[]> triplets2){
    if(triplets1.size() != triplets2.size()){

      System.out.println(  " SIze problem " + triplets1.size() + " " + triplets2.size() );
      return false ;}
    for(int i = 0 ; i < triplets1.size(); i++){
      if(!Arrays.equals(triplets1.get(i),triplets2.get(i))){
        System.out.println(" Other problem " + triplets1.get(i) + " "+ triplets2.get(i));
        return false;
      }
    }
    return true;
  }

  @Test
  public void Testcase1(){
    List<Integer[]> expected = new ArrayList<Integer[]>();
    expected.add(new Integer[] {1,2,3});
    List<Integer[]> output = ThreeNumberSum.threeNumberSum(new int[]{1,2,3}, 6);
    assertTrue(this.compare(output, expected));
  }
}
