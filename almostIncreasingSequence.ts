function almostIncreasingSequence(inputArray: number[]): boolean {
  let countOutOfsync = 0;
  for (let i = 0; i < inputArray.length; i++) {
    if (inputArray[i] <= inputArray[i - 1]) {
      countOutOfsync++;
      if (
        inputArray[i] <= inputArray[i - 2] &&
        inputArray[i + 1] <= inputArray[i - 1]
      ) {
        return false;
      }
    }
  }
  return countOutOfsync <= 1;
}
console.log(almostIncreasingSequence([2, 3, 1, 1]));
console.log(almostIncreasingSequence([1, 3, 2]));
console.log(almostIncreasingSequence([1, 3, 2, 1]));
