const getDiscountPrice = (actPrice, discount) => {
  return (actPrice - actPrice * (discount / 100)).toFixed(2)
}

export default getDiscountPrice
