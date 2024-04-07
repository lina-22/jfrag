import React from 'react'
import { Hero } from '../../components/landing/hero/Hero'
import { NewProducts } from '../../components/landing/newproducts/NewProducts'
import { PromoProducts } from '../../components/landing/promoproducts/PromoProducts'
import { TrendingProducts } from '../../components/landing/trendingproducts/TrendingProducts'

export const Home = () => {
  return (
    <>
      <Hero />
      <NewProducts />
      <PromoProducts />
      <TrendingProducts />
    </>
  )
}
