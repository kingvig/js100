function areSimilar(firstArray: number[], seondArray: number[]): boolean {
  const thirdArray: number[] = [];
  let fourthArray: number[] = [];

  if (firstArray.toString() === seondArray.toString()) return true;
  for (let i = 0; i < firstArray.length; i++) {
    if (firstArray[i] !== seondArray[i]) {
      thirdArray.push(firstArray[i]);
      fourthArray.push(seondArray[i]);
    }
  }
  fourthArray = fourthArray.reverse();
  if (
    thirdArray.length === 2 &&
    thirdArray.toString() === fourthArray.toString()
  ) {
    return true;
  }
  return false;
}
console.log(areSimilar([1, 2, 3], [1, 2, 3]));
console.log(areSimilar([1, 2, 3], [2, 1, 3]));
console.log(areSimilar([1, 2, 2], [2, 1, 1]));
