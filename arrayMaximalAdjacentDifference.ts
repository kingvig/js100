function arrayMaximalAdjacentDifference(inputArray: number[]): number {
  let max: number = 0;
  let sum: number = 0;

  for (let i = 0; i < inputArray.length; i++) {
    sum = Math.abs(inputArray[i + 1] - inputArray[i]);
    if (sum > max) {
      max = sum;
    }
  }
  return max;
}
console.log(arrayMaximalAdjacentDifference([2, 2, 1, 4, 17]));
