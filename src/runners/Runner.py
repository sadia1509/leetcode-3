import sys
from pathlib import Path

if __name__ == "__main__":
    # ensure project `src` is on sys.path so packages like `answers` can be imported
    repo_src = Path(__file__).resolve().parents[1]
    if str(repo_src) not in sys.path:
        sys.path.insert(0, str(repo_src))
    print("============ Welcome to PYTHON section ============");
    from answers.python.easy.MaxConsecutiveOnes import MaxConsecutiveOnes
    print("Max consecutive ones:", MaxConsecutiveOnes().findMaxConsecutiveOnes([1, 1, 0, 1, 1, 1]))

# run: python src\runners\Runner.py 
# remove binaries: Remove-Item -Recurse -Force src\answers\python\easy\__pycache__
