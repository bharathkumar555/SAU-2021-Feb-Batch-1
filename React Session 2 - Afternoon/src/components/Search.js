import React, { useState } from "react";
import { useSelector, useDispatch } from 'react-redux'
import { findWithAttrs } from "./searchBook";
import { Link } from "react-router-dom";
import { Form , Table } from "react-bootstrap";


export const Search = () => {
    const [input, setInput] = useState("");
    const allBooks = useSelector((state) => state.bookstore) || []

    let result = findWithAttrs(allBooks, 'name', input).map((book, i) =>
        <tr key={i}>
            <td>{i + 1}</td>
            <td>
            <Link to={"/detail/" + book.id}>
                {book.name}
            </Link></td>
            <td>{book.author}</td>
            <td>{book.genre}</td>
                   </tr>
    );
    console.log(allBooks);
    return (
        <div>
            <center><h1>Book List</h1></center><br/>
            

            <Form.Group controlId="formBasicEmail">
                <Form.Label><h3>Search Book By Entering The Book Name</h3></Form.Label>
                <Form.Control onInput={(e) => setInput(e.target.value)} type="text" placeholder="Search" />
            </Form.Group>
            <Table>
                <thead>
                    <tr>
                        <th>Number</th>
                        <th>Book Name</th>
                        <th>Book Author</th>
                        <th>Book genre</th>
                        
                    </tr>
                </thead>
                <tbody>
                    {result}
                </tbody>
            </Table>
        <h3>*Click on Book name to get the details*</h3>

        </div>

    )
}