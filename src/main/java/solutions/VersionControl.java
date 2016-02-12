package solutions;

/**
 * Used in Solution278.
 */
class VersionControl {
    private final int badVersion;

    VersionControl(int version) {
        badVersion = version;
    }
    boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
