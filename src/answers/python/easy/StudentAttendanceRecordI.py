class StudentAttendanceRecordI:
    def checkRecord(self, s: str) -> bool:
        awardEligible = s.find("LLL") == -1 # The student was never late ('L') for 3 or more consecutive days.
        absentCount = 0
        for ch in s:
            if ch == 'A':
                absentCount += 1
        return awardEligible and absentCount < 2 # The student was absent ('A') for strictly fewer than 2 days total.
