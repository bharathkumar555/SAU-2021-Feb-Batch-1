import React, { useState } from 'react'
import { useSelector, useDispatch } from 'react-redux'
import { addBook } from '../redux/actions'
import { useHistory } from "react-router-dom";
import { Button, Form } from 'react-bootstrap';


export const Add = () => {
  const books = useSelector((state) => state.bookstore) || []
  const dispatch = useDispatch()
  const [name, setBookName] = useState('')
  const [author, setAuthorname] = useState('')
  const [genre, setGenre] = useState('')
  const [edition, setEdition ] = useState('')
  const [price, setPrice] = useState('')
  let history = useHistory();



  return (

    <div>
      <center><h1 style={{color: "blue",position:"relative",top:"20px"}}>ADD BOOK</h1></center>

      <div style={{color: "green",position:"relative",top:"20px",fontSize:"25px"}}>
      <Form.Group controlId="formBasicEmail">
        <Form.Label ><b>Book Name</b></Form.Label>
        <Form.Control onInput={(e) => setBookName(e.target.value)} type="text" placeholder="Enter Book Name" />
      </Form.Group>

      <Form.Group controlId="formBasicEmail">
        <Form.Label><b>Author Name</b></Form.Label>
        <Form.Control   onInput={(e) => setAuthorname(e.target.value)} type="text" placeholder="Enter Author name" />
      </Form.Group>

      <Form.Group controlId="formBasicEmail">
        <Form.Label><b>Book Genre</b></Form.Label>
        <Form.Control  onInput={(e) => setGenre(e.target.value)} type="text" placeholder="Enter Book Genre" />
      </Form.Group>


      <Form.Group controlId="formBasicEmail">
        <Form.Label><b>Edition</b></Form.Label>
        <Form.Control  onInput={(e) => setEdition(e.target.value)} type="text" placeholder="Enter Edition Of The Book" />
      </Form.Group>

      <Form.Group controlId="formBasicEmail">
        <Form.Label><b>Price</b></Form.Label>
        <Form.Control  onInput={(e) => setPrice(e.target.value)} type="text" placeholder="Enter Price Of The Book" />
      </Form.Group>

     

    
      

      <center><Button onClick={() => { dispatch(addBook(name, author,genre, edition,price)); history.push('/list') }}>Insert</Button>
    </center></div>
     </div>
  );
}