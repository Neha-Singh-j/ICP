package ICP.Home_Assignment5;

import java.util.Arrays;

public class boats_to_save_people {
    public int numRescueb(int[] people, int limit) {
        Arrays.sort(people);
        int i = 0, j = people.length - 1;
        int b = 0;

        while (i <= j) {
            if (people[i] + people[j] <= limit) {
                i++; // lightest person can go with heaviest
            }
            j--;   // always put the heaviest person
            b++;
        }
        return b;
    }

}
