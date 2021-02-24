const createBook = (id, name, author,genre,edition,price) => ({
    id,
    name,
    author,
    genre,
    edition,
    price
  })

const bookstore = (books = [], action) => {
  
    switch (action.type) {
      case 'ADD_BOOK':
        console.log(books)
        return [...books, createBook(action.id, action.name, action.author,action.genre,action.edition,action.price)]
      default:
        return books
    }
  }
  
export default bookstore