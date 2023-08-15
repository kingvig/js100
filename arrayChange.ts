function arrayChange(inputArray: number[]): number {
  let numberOfChanges: number = 0;
  for (let i = 0; i < inputArray.length; i++) {
    if (inputArray[i] >= inputArray[i + 1]) {
      const difference = inputArray[i] + 1 - inputArray[i + 1];
      inputArray[i + 1] = inputArray[i] + 1;
      numberOfChanges += difference;
    }
  }
  return numberOfChanges;
}
console.log(arrayChange([1, 1, 1, 1]));
console.log(arrayChange([1, 1, 1, 5, 8, 1]));
console.log(arrayChange([1, 1, 1, 3, 8]));
