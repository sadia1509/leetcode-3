package answers.java.easy;

public class StudentAttendanceRecordI {
    public boolean checkRecord(String s) {
        boolean awardEligible = !s.contains("LLL"); // The student was never late ('L') for 3 or more consecutive days.
        int absentCount = 0;
        for (char ch : s.toCharArray()) {
            if (ch == 'A') {
                absentCount++;
            }
        }
        return awardEligible && absentCount < 2; // The student was absent ('A') for strictly fewer than 2 days total.
    }
}
