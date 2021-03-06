import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/* 0023-HR: SPARSE ARRAYS */

class Result {

  /*
   * Complete the 'matchingStrings' function below.
   *
   * The function is expected to return an INTEGER_ARRAY.
   * The function accepts following parameters:
   *  1. STRING_ARRAY strings
   *  2. STRING_ARRAY queries
   */

  public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    // Write your code here
    List<Integer> matchesCount = new ArrayList<Integer>(strings.size());
    for (int i = 0; i < queries.size(); i++) {
      matchesCount.add(i, 0);
      for (int j = 0; j < strings.size(); j++) {
        if (queries.get(i).compareTo(strings.get(j)) == 0)
          matchesCount.set(i, matchesCount.get(i) + 1);
      }
    }

    return matchesCount;
  }
}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter =
        // new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        new BufferedWriter(new OutputStreamWriter(System.out));

    int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<String> strings = new ArrayList<>();

    for (int i = 0; i < stringsCount; i++) {
      String stringsItem = bufferedReader.readLine();
      strings.add(stringsItem);
    }

    int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<String> queries = new ArrayList<>();

    for (int i = 0; i < queriesCount; i++) {
      String queriesItem = bufferedReader.readLine();
      queries.add(queriesItem);
    }

    List<Integer> res = Result.matchingStrings(strings, queries);

    for (int i = 0; i < res.size(); i++) {
      bufferedWriter.write(String.valueOf(res.get(i)));

      if (i != res.size() - 1) {
        bufferedWriter.write("\n");
      }
    }

    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
