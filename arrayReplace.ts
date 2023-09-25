function arrayReplace(
  inputArray: number[],
  elementToReplace: number,
  substitutionElem: number
): number[] {
  inputArray.forEach((element, index) => {
    if (element === elementToReplace) {
      inputArray[index] = substitutionElem;
    }
  });
  return inputArray;
}
console.log(arrayReplace([1, 2, 1], 1, 3));
