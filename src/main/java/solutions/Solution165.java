package solutions;

import java.util.ArrayList;
import java.util.List;

/**
 * Compare two version numbers version1 and version2.
 *
 * @see <a href="https://leetcode.com/problems/compare-version-numbers/">165. Compare Version Numbers</a>
 */
public class Solution165 {
    public int compareVersion(String version1, String version2) {
        return compareVersions(parseVersion(version1), parseVersion(version2));
    }

    private int compareVersions(List<Integer> version1, List<Integer> version2) {
        int compare = 0;
        for (int i = 0; i < Math.max(version1.size(), version2.size()); i++) {
            if (versionSection(version1, i) > versionSection(version2, i)) {
                return 1;
            } else if (versionSection(version1, i) < versionSection(version2, i)) {
                return -1;
            }
        }
        return compare;
    }

    private List<Integer> parseVersion(String version) {
        List<Integer> sections = new ArrayList<>();
        for (String v : version.split("\\.")) {
            sections.add(Integer.valueOf(v));
        }
        return sections;
    }

    private int versionSection(List<Integer> version, int section) {
        return version.size() > section ? version.get(section) : 0;
    }
}
