export function findMaxConsecutiveOnes(nums: number[]): number {
    let maxOnes: number = 0, currentOnes: number = 0;
    for (const n of nums) {
        if (n === 1) {
            currentOnes++;
        } else {
            if (maxOnes < currentOnes) {
                maxOnes = currentOnes;
            }
            currentOnes = 0;
        }
    }
    return maxOnes < currentOnes ? currentOnes : maxOnes;
};