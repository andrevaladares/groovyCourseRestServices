import groovy.json.JsonBuilder

JsonBuilder builder = new JsonBuilder()

builder.books{
    currentBook {
        title 'The 4 hour work week'
        isbn '999-999-999-999'
        author {
            first 'Andre'
            last 'Valada'
            twitter '@askValada'
        }
        related 'The 4 hour body' , 'The 4 hour chef'
    }
    nextBook{
        title '#askGaryVee'
        isbn '888-888-888-888'
        author {
            first 'Oine'
            last 'Valada'
            twitter '@oinseSabe'
        }
        related 'Jab jab jab Right Hook' , 'Crush it'
    }
}

new File('data/books.json').write(builder.toPrettyString())