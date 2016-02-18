package solutions;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Tests Solution219.
 */
public class Solution219Test {
    @Test
    public void listOf3With2Duplicates() {
        Solution219 solution219 = new Solution219();
        int[] values = {1, 2, 1};
        assertFalse(solution219.containsNearbyDuplicate(values, 0));
    }

    @Test
    public void listOf4With2Duplicates() {
        Solution219 solution219 = new Solution219();
        int[] values = {1, 0, 1, 1};
        assertFalse(solution219.containsNearbyDuplicate(values, 0));
    }

    @Test
    public void findsDuplicatesInFile() throws IOException {
        Solution219 solution219 = new Solution219();
        assertFalse(solution219.containsNearbyDuplicate(loadTestDataFromFile(), 15000));
    }

    private int[] loadTestDataFromFile() throws IOException {
        List<Integer> data = new ArrayList<>(30000);

        String testDataFilename = "/solution219.dat";
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(testDataFilename)));
        String line;
        while ((line = reader.readLine()) != null) {
            data.add(Integer.parseInt(line));
        }

        int[] values = new int[data.size()];
        for (int i = 0; i < data.size(); i++) {
            values[i] = data.get(i);
        }

        return values;
    }
}
