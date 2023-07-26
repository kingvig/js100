function allLongestStrings(inputArray: string[]): string[] {
  let longestStringLength = 0;
  let result: string[] = [];
  for (let i = 0; i < inputArray.length; i++) {
    const length = inputArray[i].length;
    if (length > longestStringLength) {
      longestStringLength = length;
    }
  }
  for (let i = 0; i < inputArray.length; i++) {
    if (inputArray[i].length === longestStringLength) {
      result.push(inputArray[i]);
    }
  }

  return result;
}
console.log(allLongestStrings(["king", "vigny", "arthur", "arthur"]));
