public class ArrangeBuildings {
    public static void main(String[] args) {
        int n = 5;
        int result = countArrangements(n);
        System.out.println(result);
    }

    public static int countArrangements(int n) {
        int oldBuildings = 1;
        int oldSpaces = 1;

        for(int i = 2; i <= n; ++i) {
            int newBuildings = oldSpaces;
            int newSpaces = oldBuildings + oldSpaces;

            oldBuildings = newBuildings;
            oldSpaces = newSpaces;
        }

        int totalOfOneSide = oldBuildings + oldSpaces;
        int totalArrangementsOfBothSide = totalOfOneSide * totalOfOneSide;

        return totalArrangementsOfBothSide;
    }
}