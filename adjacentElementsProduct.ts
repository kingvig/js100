function adjacentElementsProduct(numbers: number[]): number {
  let largestProduct = numbers[0] * numbers[1];
  for (let i = 1; i < numbers.length - 1; i++) {
    const product = numbers[i] * numbers[i + 1];
    largestProduct = largestProduct < product ? product : largestProduct;
  }
  return largestProduct;
}

console.log(adjacentElementsProduct([10, 1, 13, 2, 3, 25, 1, 100]));
