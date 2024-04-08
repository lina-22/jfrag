import React from 'react'
import styles from './footer.module.css'
import contact from '../../../assests/footerIcons/contact.png'
import payment from '../../../assests/footerIcons/payment.png'
import delivery from '../../../assests/footerIcons/delivery.png'
import condition from '../../../assests/footerIcons/condition.png'
import meta from '../../../assests/footerIcons/meta.png'
import instagram from '../../../assests/footerIcons/instagram.png'
import tiktok from '../../../assests/footerIcons/tiktok.png'

export const Footer = () => {
  return (
    <footer>
      <div className={styles.footer_container}>
        <div className={styles.information}>
          <section>
            <img src={payment} alt='paiment' />
            <h5>Paiment</h5>
            <a href='#'>Moyen de paiment</a>
            <br />
            <a href='#'>Plitique de retour</a>
          </section>
          <section>
            <img src={delivery} alt='livraison' />
            <h5>Livraison</h5>

            <a href='#'>Codition de livraison</a>
            <br />
            <a href='#'>Retourner un produit</a>
          </section>
          <section>
            <img src={contact} alt='contact' />
            <h5>Contact</h5>
            <a href='#'>Contact général</a>
            <br />
            <a href='#'>Sitemap</a>
          </section>
          <section>
            <img src={condition} alt='condition' />
            <h5>Condition général</h5>
            <a href='#'>Mention légales</a>
            <br />
            <a href='#'>Conditions d'utilisation</a>
            <br />
            <a href='#'>Conditions de vente</a>
          </section>
        </div>
        <div className={styles.social}>
          <section>
            <a href='#'>
              <img src={meta} alt='meta' />
            </a>
            <a href='#'>
              <img src={instagram} alt='instagram' />
            </a>
            <a href=''>
              <img src={tiktok} alt='tiktok' />
            </a>
          </section>
          <section>
            <p className={styles.copyright}>
              &copy; jfrag.com 2024 | Tous droits réservés | SIRET - 985 334 614
              00015{' '}
            </p>
            <p className={styles.designation}>Jahanara Fragrance</p>
          </section>
        </div>
      </div>
    </footer>
  )
}
