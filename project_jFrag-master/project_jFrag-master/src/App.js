import React from 'react'
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom'
import './App.css'
import { Home } from './pages/home/Home'
import { Header } from './components/common/header/Header'

function App() {
  return (
    <Router>
      <Header />
      {/* <Footer /> */}
      <Routes>
        <Route path='/' element={<Home />} />
        {/* <Route path='/test' element={<P />} /> */}
        {/* <Route path='/test/:id' element={<P />} /> */}
      </Routes>
    </Router>
  )
}

export default App
