import java.util.ArrayList;
import java.util.List;

public class Contest1 {

  public static List < String > splitString(String str, char esc) {
    List < String > result = new ArrayList < String > ();

    boolean inchar = false;
    StringBuilder temp = new StringBuilder();
    for (char c: str.toCharArray()) {
      if (c == ' ' && !inchar) {
        result.add(temp.toString());
        temp.setLength(0);
      }

      if (c == esc) {

        if (inchar) {
          inchar = false;
        } else {
          inchar = true;

        }
        temp.append(c);
        continue;
      }

      temp.append(c);
    }

    result.add(temp.toString());

    return result;
  }

  public static void main(String[] args) {
    String str = "My name is *Sucheth ,I am living in bangalore* ";

    List < String > result = splitString(str, '*');

    for (String a: result) {
      System.out.println(a);
    }
  }

}
