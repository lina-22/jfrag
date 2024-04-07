import React from 'react'
import styles from '../trendingproducts/trendingproducts.module.css'
import { TrendingProduct } from './trendingProduct/TrendingProduct'
import dramatic from '../../../assests/newProducts/dramatic_desert_1.png'
import desert from '../../../assests/newProducts/desert_night_1.png'
import lilium from '../../../assests/newProducts/lilium_sweet_sand_1.png'
import nuit from '../../../assests/newProducts/nuit_de_noel_1.png'
const products = [
  {
    id: 1,
    name: 'Dramatic desert',
    description: 'Eau de perfum',
    category: 'Unisex',
    size: '100ml',
    price: 65,
    reduction: 25,
    photo: dramatic,
  },
  {
    id: 2,
    name: 'Desert night',
    description: 'Eau de perfum',
    category: 'Unisex',
    size: '100ml',
    price: 99,
    reduction: 30,
    photo: desert,
  },
  {
    id: 3,
    name: 'Lilium',
    description: 'Eau de perfum',
    category: 'Unisex',
    size: '100ml',
    price: 99,
    reduction: 25,
    photo: lilium,
  },
  {
    id: 4,
    name: 'Nuit de noel',
    description: 'Eau de perfum',
    category: 'Unisex',
    size: '100ml',
    price: 89,
    reduction: 25,
    photo: nuit,
  },
]
export const TrendingProducts = () => {
  return (
    <div className={styles.trend_cart_container}>
      <div className={styles.trend_cart}>
        <p className={styles.ltr_a}>A</p>
        <section className={styles.top_midle}>
          <TrendingProduct product={products[0]} />
        </section>
        <section className={styles.top_right}>
          <TrendingProduct product={products[1]} />
        </section>
        <p className={styles.ltr_la}>LA</p>
        <section className={styles.bottom_left}>
          <TrendingProduct product={products[2]} />
        </section>
        <section className={styles.bottom_midle}>
          <TrendingProduct product={products[3]} />
        </section>
        <p className={styles.ltr_mode}>MODE</p>
      </div>
    </div>
  )
}
