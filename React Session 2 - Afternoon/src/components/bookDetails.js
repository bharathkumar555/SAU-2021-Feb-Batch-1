import React from "react";
import { useParams } from 'react-router-dom'
import { useSelector, useDispatch } from 'react-redux'
import findWithAttr from './searchBook'


export const Detail = () => {
    let { id } = useParams();
    const books = useSelector((state) => state.bookstore) || []
    let result = findWithAttr(books,'id',id);
  
    return (
      <div>
      <br/>      <br/>      <br/>
      <center> <h1> Book Details</h1></center><br/>
      <center><table class="styled-table" variant="dark">
    <thead>
        <tr>
            <th>Book ID</th>
            <th>Book Name</th>
            <th>Book Author name</th>
            <th>Book Genre</th>
            <th>Book Edition</th>
            <th>Book price</th>
        </tr>
    </thead>

    <tbody>
        <tr>
            <td>{result.id}</td>
            <td>{result.name}</td>
            <td>{result.author}</td>
            <td>{result.genre}</td>
            <td>{result.edition}</td>
            <td>{result.price}</td>

        </tr>
    
    </tbody>
</table>
</center>
      </div>
    );
}

