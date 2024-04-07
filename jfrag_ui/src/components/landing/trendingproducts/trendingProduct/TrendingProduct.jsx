import React from 'react'
import styles from './trendingProduct.module.css'
export const TrendingProduct = ({ product }) => {
  const { id, name, description, category, size, price, reduction, photo } =
    product
  return (
    <figure className={styles.trend_item}>
      <figcaption>
        <h4>{name}</h4>
        <section>
          <p>{description}</p>
          <p>
            <span>{category}</span>
            <span>{size}</span>
          </p>
        </section>
      </figcaption>
      <section>
        <img src={photo} alt='perfume' />
      </section>
      <h5>{price}€</h5>
    </figure>
  )
}
