function areEquallyStrong(
  yourLeft: number,
  yourRight: number,
  friendsLeftt: number,
  friendsRight: number
): boolean {
  const yourWeakest = yourLeft <= yourRight ? yourLeft : yourRight;
  const yourStrongest = yourLeft >= yourRight ? yourLeft : yourRight;
  const friendsWeakest =
    friendsLeftt <= friendsRight ? friendsLeftt : friendsRight;
  const friendsStrongest =
    friendsLeftt >= friendsRight ? friendsLeftt : friendsRight;
  return yourStrongest === friendsStrongest && yourWeakest === friendsWeakest;
}
console.log(areEquallyStrong(10, 15, 15, 10));
console.log(areEquallyStrong(15, 10, 15, 10));
console.log(areEquallyStrong(15, 10, 15, 9));
