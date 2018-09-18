import groovy.json.JsonSlurper

/*
import groovy.json.JsonSlurper

def books = '''
{
    "books": {
        "currentBook": {
            "title": "The 4 hour work week",
            "isbn": "999-999-999-999",
            "author": "Autor current",
            "related": [
                "The 4 hour body",
                "The 4 hour chef"
            ]
        },
        "nextBook": {
            "title": "#askGaryVee",
            "isbn": "888-888-888-888",
            "author": "Author next",
            "related": [
                "Jab jab jab Right Hook",
                "Crush it"
            ]
        }
    }
}
'''

JsonSlurper slurper = new JsonSlurper()
def json = slurper.parseText(books)

println json
println json.getClass().getName()

println json.books.nextBook.title
*/

def json = new JsonSlurper().parse(new File('data/books.json'))

println json.books.currentBook
println json.books.currentBook.title
println json.books.currentBook.author
println json.books.currentBook.author.twitter
println json.books.currentBook.related
