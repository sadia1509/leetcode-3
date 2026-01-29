import { findMaxConsecutiveOnes } from "../answers/typescript/easy/MaxConsecutiveOnes";

class Runner {
    public run(): void {
        console.log("============ Welcome to TYPESCRIPT section ============");
        console.log("Max consecutive ones:", findMaxConsecutiveOnes([1, 1, 0, 1, 1, 1]));
    }
}

// Entry execution (like main method)
new Runner().run();

// run: npx ts-node src\runners/Runner.ts