import React from 'react'
import { useGetProductsQuery } from '../../features/products/productsApi'

export const Products = () => {
  const { products, isLoading, isError } = useGetProductsQuery()
  let content = null
  if (isLoading) content = 'Loading...'
  if (!isLoading && isError) content = 'Somenthing went wrong...'
  if (!isLoading && !isError && products?.length === 0) {
    content = 'No data'
  }
  if (!isLoading && !isError && products?.length === 0) {
    content = products.map((data) => {
      return <p>data.id</p>
    })
  }

  return <div>{{ content }}</div>
}
