export function checkRecord(s: string): boolean {
    let awardEligible: boolean = s.includes("LLL") === false; // The student was never late ('L') for 3 or more consecutive days.
    let absentCount: number = 0;
    for (const ch of s) {
        if (ch === 'A') {
            absentCount++;
        }
    }
    return awardEligible && absentCount < 2; // The student was absent ('A') for strictly fewer than 2 days total.
};
