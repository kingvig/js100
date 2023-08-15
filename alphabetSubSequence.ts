function alphabetSubsequence(inputString: String): boolean {
  const chars: string[] = inputString.split("");
  const charValues: number[] = [];
  chars.forEach((char: string) => {
    charValues.push(char.charCodeAt(0));
  });
  if (new Set(charValues).size !== charValues.length) {
    return false;
  }
  for (let i = 0; i < charValues.length; i++) {
    if (charValues[i] >= charValues[i + 1]) {
      return false;
    }
  }
  return true;
}
console.log(alphabetSubsequence("effg"));
console.log(alphabetSubsequence("cdce"));
console.log(alphabetSubsequence("ace"));
console.log(alphabetSubsequence("bxz"));
console.log(alphabetSubsequence("bpez"));
console.log(alphabetSubsequence("bza"));
