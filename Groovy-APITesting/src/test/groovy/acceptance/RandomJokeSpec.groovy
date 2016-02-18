package acceptance

import api.APIClient
import spock.lang.*

/**
 * Created by fcardona on 2/18/16.
 */
@Narrative("""
When you are bored you may want
to get Chuck Norris Wisdom with you
""")
class RandomJokeSpec extends Specification{
  @Shared client = new APIClient();

  @Unroll
  def "Ramdom jokes can be retrieved by categories like #category" () {
    given: "Our chuck norris Server up "
      assert client.isServerAlive()

    when: "A random joke is requested with the category #category"
      def joke = client.getRandomJoke([query: [limitTo: category.toString()]]);

    then: "Jokes are sucessfully retrieved"
      joke != null
      joke.status == 200
      joke.data.type == "success"
      !joke.data.isEmpty()

/*    and: "The jokes only belongs to the given category"
      joke.data.each {
        assert it.value.categories as Set == category as Set
      }*/
    where:
      category << [['nerdy'], ['explicit'], ['nerdy', 'explicit']]
  }
}
