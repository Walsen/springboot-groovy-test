package hello

class Greeting {

        final long id
        final String content

        Greeting ( long id, String content ) {
                this.id = id
                this.content = content
        }

        long getId () {
                return id
        }

        String getContent () {
                return content
        }
}
