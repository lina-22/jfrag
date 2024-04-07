import React from 'react'
import styles from './promoproduct.module.css'
import getDiscountPrice from '../../../../utils/calculateDiscountPrice'

export const PromoProduct = ({ product }) => {
  const { id, name, description, category, size, price, reduction, photo } =
    product
  return (
    <figure className={styles.promo_item}>
      <section className={styles.decription}>
        <h4>{name}</h4>
        <section>
          <p>{description}</p>
          <p>
            <span>{category}</span>
            <b> | </b>
            <span>{size}</span>
          </p>
        </section>
      </section>
      <img src={photo} alt='Perfum' />
      <figcaption>
        <span>{price} €</span>
        <span> - {reduction}% </span>
        <span>{getDiscountPrice(price, reduction)} €</span>
      </figcaption>
    </figure>
  )
}
