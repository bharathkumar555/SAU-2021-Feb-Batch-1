let bookId = 0

export const addBook = (name,author,genre,edition,price) => {
    return { type: 'ADD_BOOK', id:bookId++, name,author,genre,edition,price }
}