import React from 'react'
import { PromoProduct } from './promoproduct/PromoProduct'
import dramatic from '../../../assests/newProducts/dramatic_desert_1.png'
import desert from '../../../assests/newProducts/desert_night_1.png'
import lilium from '../../../assests/newProducts/lilium_sweet_sand_1.png'
import nuit from '../../../assests/newProducts/nuit_de_noel_1.png'
import styles from './promoproducts.module.css'
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
    price: 89,
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
export const PromoProducts = () => {
  return (
    <div className={styles.promo_cart_container}>
      <h3>en promotion</h3>
      <div className={styles.promo_cart}>
        <section className={styles.promo_cart_items}>
          <PromoProduct product={products[0]} />
          <PromoProduct product={products[1]} />
          <PromoProduct product={products[2]} />
          <PromoProduct product={products[3]} />
          <PromoProduct product={products[0]} />
          <PromoProduct product={products[1]} />
          <PromoProduct product={products[2]} />
          <PromoProduct product={products[3]} />
        </section>
        <div className={styles.link_more}>
          <a href='google.com'>Et encore plus...</a>
        </div>
      </div>
    </div>
  )
}
