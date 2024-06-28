package collection;

import java.util.ArrayList;
import java.util.List;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {
    Integer input_len = input.size();
    List<Double> compute1_results = new ArrayList<>(input_len);
    for(Integer i = 0 ; i < input_len ; i++){
      Integer element = input.get(i);
      Double element_double_value = element.doubleValue();
      Double compute1 = Math.pow((element_double_value * 2.0) + 3.0, 5.0);
      compute1_results.add(i, compute1);
    }
    return compute1_results;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {
    int input_len = input.size();
    List<String> compute2_results = new ArrayList<>(input_len);
    for (int i=0; i<input_len;i++){
      String input_string = input.get(i);
      String capitalized_input_string = copyAndCapitalizeString(input_string);
      compute2_results.add(i, capitalized_input_string+capitalized_input_string);
    }
    return compute2_results;
  }

  /*
   * Returns a capitalized copy of the input string
   */
  private static String copyAndCapitalizeString(String string){
    if(string == null || string.isEmpty()) return string;
    StringBuilder sb = new StringBuilder();
    sb.append(string.substring(0, 1).toUpperCase());
    if(string.length()>1){
      sb.append(string.substring(1));
    }
    return sb.toString();
  }

}
