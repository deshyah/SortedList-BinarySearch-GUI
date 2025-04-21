package src;

import java.util.ArrayList;

public class SortedList {
    private ArrayList<String> list;

    public SortedList() {
        this.list = new ArrayList<>();
    }

    public void add(String element) {
        int low = 0;
        int high = list.size() - 1;
        int insertionPoint = list.size();

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparisonResult = element.compareTo(list.get(mid));

            if (comparisonResult == 0) {
                insertionPoint = mid;
                break;
            } else if (comparisonResult < 0) {
                insertionPoint = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        list.add(insertionPoint, element);
    }

    /**
     * Uses binary search to find the element in the sorted list.
     * If found, returns the element. If not found, returns a string
     * indicating the index where it would be inserted.
     * @param target The String element to search for.
     * @return The found element or an insertion position string.
     */
    public String search(String target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int comparisonResult = target.compareTo(list.get(mid));

            if (comparisonResult == 0) {
                return list.get(mid);
            } else if (comparisonResult < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return "Not found. Would be inserted at index: " + low;
    }

    public ArrayList<String> getList() {
        return this.list;
    }
}
