import React from 'react'
import styles from './newproduct.module.css'

export const NewProduct = ({ product }) => {
  const { id, name, description, category, size, price, photo } = product
  return (
    <div className={styles.new_item}>
      <figure>
        <section>
          <h4>{name}</h4>
          <p>{description}</p>
          <p>
            <span>{category}</span>
            <span>{size}</span>
          </p>
          <figcaption>{price}€</figcaption>
        </section>
        <img src={photo} alt='Perfum' />
      </figure>
    </div>
  )
}
