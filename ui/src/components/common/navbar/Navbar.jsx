import React, { useRef, useState } from 'react'
import styles from './navbar.module.css'
import logo from '../../../assests/logo.png'
import login from '../../../assests/login.svg'
import logout from '../../../assests/logout.svg'
import profile from '../../../assests/profile.png'
import basket from '../../../assests/basket.png'
import burgerMenu from '../../../assests/burger.png'
import menuClose from '../../../assests/menu_close.png'

import {
  useAddProductMutation,
  useGetProductsQuery,
} from '../../../features/products/productsApi'

export const Navbar = () => {
  const [show, setShow] = useState(false)
  const showMenu = () => {
    setShow(!show)
  }

  let data = {}
  const test = useGetProductsQuery()
  const [postCall, { isSuccess, isLoading, isError }] =
    useAddProductMutation(data)

  return (
    <div className={styles.nav_container}>
      <nav className={styles.nav}>
        <img src={logo} className={styles.logo} alt='logo' />
        <ul className={`${styles.main_menu} ${show ? styles.show : null}`}>
          <li>Acceuil</li>
          <li>Produit</li>
          <li>Homme</li>
          <li>Femme</li>
          <li>Universel</li>
          <li>A Propos</li>
        </ul>
        <section className={styles.util_menu}>
          <img src={login} alt='login' />
          <img src={profile} alt='profile' />
          <img src={basket} alt='basket' />
          {!show && (
            <img
              className={styles.menu_mobile}
              src={burgerMenu}
              alt='menu mobile'
              onClick={showMenu}
            />
          )}
          {show && (
            <img
              className={styles.menu_mobile}
              src={menuClose}
              alt='menu close'
              onClick={showMenu}
            />
          )}
        </section>
      </nav>
    </div>
  )
}
