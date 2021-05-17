import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

  /* 0013-HR: SUBARRAY DIVISION */
  // Complete the birthday function below.
  static int birthday(List<Integer> s, int d, int m) {
		int count = 0;

		for (int i = 0; i <= s.size() - m; i++) {
			int sum = 0;			

			for (int j = i; j < i + m; j++) {
				sum += s.get(j);
			}

			if (sum == d) count++;
		}

		return count;
	}

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter =
        //new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        new BufferedWriter(new OutputStreamWriter(System.out));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    String[] sItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    List<Integer> s = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      int sItem = Integer.parseInt(sItems[i]);
      s.add(sItem);
    }

    String[] dm = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int d = Integer.parseInt(dm[0]);

    int m = Integer.parseInt(dm[1]);

    int result = birthday(s, d, m);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
