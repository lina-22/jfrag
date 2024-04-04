import React from 'react'
import styles from './hero.module.css'
import hero_img from '../../../assests/bg_hero.png'
import most_sold from '../../../assests/wave.png'

export const Hero = () => {
  return (
    <div className={styles.hero}>
      <div className={styles.hero_bg_txt}></div>
      <div className={styles.hero_bg_img}></div>
      <div className={styles.cta_container}>
        <section className={styles.cta}>
          <h1>La fraîcheur au delà de toute comparaison</h1>
          <p className={styles.slogan}>
            Une touche de magie dans chaque flacon de parfum
          </p>
          <button className={styles.btn_cta}>Decouvrez</button>
          <p className={styles.bg_txt}>PURITY</p>
        </section>
        <section className={styles.cta_product}>
          <img className={styles.hero_bg} src={hero_img} alt='background' />
          <div className={styles.most_sold_item}>
            <figure>
              <section>
                <h4>Wave</h4>
                <p>Eau de perfume</p>
                <p>Unisex</p>
                <figcaption>Plus vendu récement</figcaption>
              </section>
              <img src={most_sold} alt='most sold item' />
            </figure>
            <figure>
              <section>
                <h4>Wave</h4>
                <p>Eau de perfume</p>
                <p>Unisex</p>
                <figcaption>Plus vendu récement</figcaption>
              </section>
              <img src={most_sold} alt='most sold item' />
            </figure>
          </div>
        </section>
      </div>
    </div>
  )
}
