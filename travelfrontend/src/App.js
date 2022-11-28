import './App.css';
import React from 'react';


import Header from './components/Header'
import Body from './components/Body'
import Template1 from './components/Template1'
import Footer from './components/Footer'



function App() {
  return (
    <div className="App">

      <Header/>
      <Template1/>
      <Body/>
      <Footer/>
      
    </div>
  );
}

export default App;
